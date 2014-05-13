package martinComp.FMC.IFMA.control;

import martinComp.FMC.IFMA.shared.Login;

public class LoginController {
	private Login instance;

	public Login getInstance() {
		return instance;
	}

	public void setInstance(Login instance) {
		this.instance = instance;
	}
}
