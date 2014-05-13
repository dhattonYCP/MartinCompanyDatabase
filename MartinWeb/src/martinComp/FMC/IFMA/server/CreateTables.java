package martinComp.FMC.IFMA.server;

import java.sql.SQLException;

import martinComp.FMC.IFMA.db.Database;

public class CreateTables {
	public static void main(String[] args) throws SQLException {
		// creating multiple data entries.
		Database db = new Database();
		db.createLoginTable();
		db.createBroDataTable();
		System.out.println("Successfully created tables");
	}
}
