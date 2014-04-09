package martinComp.FMC.IFMA.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import martinComp.FMC.IFMA.model.User;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	public User findLogin(String username, String password);

}
