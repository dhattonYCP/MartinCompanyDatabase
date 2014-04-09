package martinComp.FMC.IFMA.client;

import martinComp.FMC.IFMA.model.User;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {

	void findLogin(String username, String password,
			AsyncCallback<User> callback);

}
