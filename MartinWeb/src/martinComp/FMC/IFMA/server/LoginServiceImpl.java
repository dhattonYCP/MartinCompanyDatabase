package martinComp.FMC.IFMA.server;

import java.sql.SQLException;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import martinComp.FMC.IFMA.client.LoginService;
import martinComp.FMC.IFMA.db.DBUtil;
import martinComp.FMC.IFMA.shared.Login;

//@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Login findLogin(String username, String password) {
		try {
			return DBUtil.instance().findLogin(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; //fails to find, therefore returns null
	}

	@Override
	public Login addLogin(String username, String password) {
		try {
			return DBUtil.instance().addLogin(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; //fails to add, therefore returns null
	}

}
