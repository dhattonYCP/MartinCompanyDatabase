package martinComp.FMC.IFMA.db;
import java.sql.SQLException;

import martinComp.FMC.IFMA.model.MemberData;

public interface IDatabase {

	public MemberData retrieveData(RequestHandler request) throws SQLException;
	public void sendData(RequestHandler request) throws SQLException;
	
}
