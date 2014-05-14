package martinComp.FMC.IFMA.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import martinComp.FMC.IFMA.shared.Login;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	public Login findLogin(String username, String password);

	public Login addLogin(String username, String password);

}
