package martinComp.FMC.IFMA.shared;

import java.io.Serializable;


/**
 * This class should include any instructions for the user logging in
 * requires, login, logout, and password instructions
 *
 */
public class Login implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String user;
	private String password;

	public Login() {

	}

	public void setId(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setUserName(String user){
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
