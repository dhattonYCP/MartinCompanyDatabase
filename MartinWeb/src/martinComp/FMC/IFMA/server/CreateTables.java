package martinComp.FMC.IFMA.server;

import java.sql.SQLException;

import martinComp.FMC.IFMA.db.Database;

public class CreateTables {
	public static void main(String[] args) throws SQLException {
		// creating multiple data entries.
		Database db = new Database();
		db.createTables("login");
		db.createTables("brodata");
		System.out.println("Successfully created tables");
	}
}
