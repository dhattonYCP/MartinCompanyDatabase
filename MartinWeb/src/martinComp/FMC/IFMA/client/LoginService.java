package martinComp.FMC.IFMA.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import martinComp.FMC.IFMA.model.User;
import martinComp.FMC.IFMA.shared.Login;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	User findLogin(String username, String password);

	public Login addLogin(String username, String password);

}
