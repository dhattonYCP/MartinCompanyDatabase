package martinComp.FMC.IFMA.server;

import java.sql.SQLException;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import martinComp.FMC.IFMA.client.BrotherDataService;
import martinComp.FMC.IFMA.db.DBUtil;
import martinComp.FMC.IFMA.shared.BrotherData;

public class BrotherDataServiceImpl extends RemoteServiceServlet implements BrotherDataService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public BrotherData retriveBrotherData(String parameter) {
		return DBUtil.instance().findBroData(parameter);
	}

	@Override
	public BrotherData addBrotherData(String lastName, String firstName, String position, String pledgeClass, String GPA) {
		try {
			return DBUtil.instance().addBroData(lastName, firstName, position, pledgeClass, GPA);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
