package martinComp.FMC.IFMA.client;

import martinComp.FMC.IFMA.shared.Login;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {

	void findLogin(String username, String password,
			AsyncCallback<Login> asyncCallback);

	void addLogin(String username, String password,
			AsyncCallback<Login> callback);
	
}
