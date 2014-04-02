package martinComp.FMC.IFMA.view;
import java.sql.SQLException;

import martinComp.FMC.IFMA.db.RequestHandler;
import martinComp.FMC.IFMA.model.MemberData;

public interface IGraph {

	public MemberData graphData(RequestHandler request) throws SQLException;
	public void sendData(RequestHandler request) throws SQLException;
	
}
