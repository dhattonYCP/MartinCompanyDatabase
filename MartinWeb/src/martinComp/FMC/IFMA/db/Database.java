package martinComp.FMC.IFMA.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import martinComp.FMC.IFMA.shared.BrotherData;
import martinComp.FMC.IFMA.shared.ITransaction;
import martinComp.FMC.IFMA.shared.Login;


public class Database implements IDatabase{

	// Datastore is the location of where we will put our data at.
	private static final String DATASTORE = "H:/BroDatabase";

	// making sure that the driver is running properly
	static { 
		try { 
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (Exception e) {
			throw new RuntimeException("Could not load Derby JDBC driver");
		}
	}

	public class DConnection {
		public Connection con;
		public int refCount;
	}

	private final ThreadLocal<DConnection> connHolder = new ThreadLocal<DConnection>();

	// managing database connections
	// avoid two database from using the same thread
	private DConnection getConnection() throws SQLException {
		DConnection dbConn = connHolder.get();
		// if the thread is empty
		// no data in thread already
		if (dbConn == null) {
			dbConn = new DConnection();
			dbConn.con = DriverManager.getConnection("jdbc:derby:" + DATASTORE + ";create=true");
			dbConn.refCount = 0;
			connHolder.set(dbConn);
		}
		// counter
		dbConn.refCount++;
		return dbConn;
	}

	// releasing the connection
	private void releaseConnection(DConnection dbConn) throws SQLException {
		dbConn.refCount--;
		if (dbConn.refCount == 0) {
			try {
				dbConn.con.close();
			} finally {
				connHolder.set(null);
			}
		}
	}

	private<E> E databaseRun(ITransaction<E> transaction) throws SQLException {
		DConnection dbConn = getConnection();

		try {
			boolean origAutoCommit = dbConn.con.getAutoCommit();
			// restoring the autocommit statement.
			try {
				// can run into a deadlock
				dbConn.con.setAutoCommit(false);

				return transaction.run(dbConn.con);
			} finally {
				dbConn.con.setAutoCommit(origAutoCommit);
			}
		} 
		// connection is released
		finally {
			releaseConnection(dbConn);
		}
	}

	public void createLoginTable() throws SQLException {
		databaseRun(new ITransaction<Boolean>() {
			@Override
			public Boolean run(Connection conn) throws SQLException {

				PreparedStatement stmt = null;

				try {
					stmt = conn.prepareStatement(
							"create table login (" +
							"  id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), " +
							"  username VARCHAR(200) NOT NULL, " +
							"  password VARCHAR(200) NOT NULL, " +
							")"
					);

					stmt.executeUpdate();

				} finally {
					DBUtil.closeQuietly(stmt);
				}
				
				return true;
			}
		});
	}
	public void createBroDataTable() throws SQLException {
		databaseRun(new ITransaction<Boolean>() {
			@Override
			public Boolean run(Connection conn) throws SQLException {

				PreparedStatement stmt = null;

				try {
					stmt = conn.prepareStatement(
							"create table bordata (" +
							"  id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), " +
							"  lastname VARCHAR(200) NOT NULL, " +
							"  firstname VARCHAR(200) NOT NULL, " +
							"  position VARCHAR(200) NOT NULL, " +
							"  pledgeclass VARCHAR(200) NOT NULL, " +
							"  gpa VARCHAR(200) NOT NULL, " +
							")"
					);

					stmt.executeUpdate();

				} finally {
					DBUtil.closeQuietly(stmt);
				}
				
				return true;
			}
		});
	}

	@Override
	public List<Login> getLogin() throws SQLException {
		return databaseRun(new ITransaction<List<Login>>() {
			@Override
			public List<Login> run(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;

				try {
					stmt = conn.prepareStatement("select * from logins");
					resultSet = stmt.executeQuery();

					List<Login> result = new ArrayList<Login>();

					while(resultSet.next()) {
						Login login = new Login();

						login.setId(resultSet.getInt(1));
						login.setUserName(resultSet.getString(2));
						login.setPassword(resultSet.getString(3));

						result.add(login);
					}

					return result;
				} finally {
					DBUtil.closeQuietly(stmt);
					DBUtil.closeQuietly(resultSet);
				}
			}
		});
	}

	@Override
	public Login findLogin(final String username, final String password) throws SQLException {	
		try {
			return databaseRun(new ITransaction<Login>() {
				@Override
				public Login run(Connection conn) throws SQLException {
					List<Login> logs;
					logs = getLogin();

					for(Login user : logs){
						if (user.getUser().equals(username) && user.getPassword().equals(password)) {
							return user;
						}
					}
					return null; // no such user
				}
			});
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception adding user to database", e);
		}

		// TODO "select * from logins where username = ? and password = ?"
	}

	@Override
	public Login addLogin(final String username, final String password) throws SQLException {

		try {
			return databaseRun(new ITransaction<Login>() {
				@Override
				public Login run(Connection conn) throws SQLException {
					// TODO: create Login object, insert its data into the database
					PreparedStatement stmt = null;
					ResultSet keys = null;
					try {
						Login login = new Login();
						login.setUserName(username);
						login.setPassword(password);

						stmt = conn.prepareStatement(
								"insert into logins (username, password) values (?, ?)",
								PreparedStatement.RETURN_GENERATED_KEYS
						);
						stmt.setString(1, username);
						stmt.setString(2, password);

						stmt.executeUpdate();

						keys = stmt.getGeneratedKeys();
						if (!keys.next()) {
							throw new SQLException("Can't happen: no generated key for inserted login");
						}
						login.setId(keys.getInt(1));

						return login;
					} catch (SQLException e) {
						throw new RuntimeException("SQLException inserting login", e);
					}
				}
			});
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception adding user to database", e);
		}
	}

	public void deleteLogin(final String username, final String password) throws SQLException {

			databaseRun(new ITransaction<Login>() {
				@Override
				public Login run(Connection conn) throws SQLException {
					PreparedStatement stmt = null;
					try {

						stmt = conn.prepareStatement(
								"delete from logins where login.username = ? AND login.password = ?",
								PreparedStatement.RETURN_GENERATED_KEYS
						);
						
						stmt.setString(1, username);
						stmt.setString(2, password);
					} catch (SQLException e) {
						throw new RuntimeException("SQLException deleting from login", e);
					}
					return null;
				}
			});
	}
	@Override
	public List<BrotherData> getBroData(String parameter) throws SQLException {
		return databaseRun(new ITransaction<List<BrotherData>>() {
			@Override
			public List<BrotherData> run(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;

				try {
					stmt = conn.prepareStatement("select * from brotherdata");
					resultSet = stmt.executeQuery();

					List<BrotherData> result = new ArrayList<BrotherData>();

					while(resultSet.next()) {
						BrotherData bro = new BrotherData();

						bro.setId(resultSet.getInt(1));
						bro.setLastName(resultSet.getString(2));
						bro.setFirstName(resultSet.getString(3));
						bro.setPledgeClass(resultSet.getString(4));
						bro.setPosition(resultSet.getString(5));
						bro.setGPA(resultSet.getString(6));
						
						result.add(bro);
					}

					return result;
				} finally {
					DBUtil.closeQuietly(stmt);
					DBUtil.closeQuietly(resultSet);
				}
			}
		});
	}
	
	@Override
	public BrotherData addBroData(final String lastName, final String firstName, final String position, final String pledgeClass, final String GPA) throws SQLException {

		try {
			return databaseRun(new ITransaction<BrotherData>() {
				@Override
				public BrotherData run(Connection conn) throws SQLException {
					// TODO: create BrtherData object, insert its data into the database
					PreparedStatement stmt = null;
					ResultSet keys = null;
					try {
						BrotherData broData = new BrotherData();
						

						stmt = conn.prepareStatement(
								"insert into brodata (lastname, firstname, position, pledgeclass, gpa) values (?, ?, ?, ?, ?)",
								PreparedStatement.RETURN_GENERATED_KEYS
						);
						stmt.setString(1, lastName);
						stmt.setString(2, firstName);
						stmt.setString(4, position);
						stmt.setString(3, pledgeClass);
						stmt.setString(5, GPA);

						stmt.executeUpdate();

						keys = stmt.getGeneratedKeys();
						if (!keys.next()) {
							throw new SQLException("Can't happen: no generated key for inserted brother data");
						}
						broData.setId(keys.getInt(1));

						return broData;
					} catch (SQLException e) {
						throw new RuntimeException("SQLException inserting brodata", e);
					}
				}
			});
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception adding brother data to database", e);
		}
	}
	
	public void deleteBroData(final String lastName, final String firstName, final String position, final String pledgeClass, final String GPA) throws SQLException {

		databaseRun(new ITransaction<BrotherData>() {
			@Override
			public BrotherData run(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				try {

					stmt = conn.prepareStatement(
							"delete from brodata where brodata.firstname = ? AND brodata.lastname = ?",
							PreparedStatement.RETURN_GENERATED_KEYS
					);
					
					stmt.setString(1, firstName);
					stmt.setString(2, lastName);
				} catch (SQLException e) {
					throw new RuntimeException("SQLException deleting from brodata", e);
				}
				return null;
			}
		});
	}

	@Override
	public BrotherData findBroData(String parameter) {
		return DBUtil.instance().findBroData(parameter);
	}



}
