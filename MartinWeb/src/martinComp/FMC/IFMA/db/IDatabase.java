package martinComp.FMC.IFMA.db;

import java.sql.SQLException;
import java.util.List;

import martinComp.FMC.IFMA.model.BrotherData;
import martinComp.FMC.IFMA.shared.Login;


public interface IDatabase {

	public List<Login> getLogin() throws SQLException;

	public Login findLogin(String username, String password);

	public Login addLogin(String username, String password) throws SQLException;
	
	public List<BrotherData> getBroData(String parameter);
	
	public BrotherData findBroData(String parameter);
	
	public BrotherData addBroData(String lastName, String firstName, String position, String pledgeClass, double GPA);
}
