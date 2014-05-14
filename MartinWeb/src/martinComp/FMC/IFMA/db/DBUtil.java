package martinComp.FMC.IFMA.db;


	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class DBUtil {
		private static final IDatabase theInstance = /* new Database();*/ new FakeDatabase();

		public static IDatabase instance() {
			return theInstance;
		}

		public static void closeQuietly(PreparedStatement stmt) {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					throw new IllegalStateException ("Statement did not close");
				}
			}
		}

		public static void closeQuietly(ResultSet resultSet) {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					throw new IllegalStateException ("Result set did not close");
				}
			}
		}
	}

