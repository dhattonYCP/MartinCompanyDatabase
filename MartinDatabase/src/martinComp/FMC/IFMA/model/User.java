package martinComp.FMC.IFMA.model;
public class User {
		private String password;
		private String user;
		
		public void setUserName(String user){
			this.user = user;
		}

		public String getUserName() {
			return user;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}

