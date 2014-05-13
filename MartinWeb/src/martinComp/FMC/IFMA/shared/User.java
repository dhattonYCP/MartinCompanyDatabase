package martinComp.FMC.IFMA.shared;

import java.io.Serializable;
public class User implements Serializable {
		private static final long serialVersionUID = 1L;
		private String password;
		private String user;
		private boolean alertNotification;
		
		public void setUserName(String user){
			this.user = user;
		}

		public String getUserName() {
			return user;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getPassword() {
			return password;
		}

		public void setAlertNotification(boolean alertNotification){
			this.alertNotification = alertNotification;
		}
		public boolean getAlertNotification(){
			return alertNotification;
		}
}

