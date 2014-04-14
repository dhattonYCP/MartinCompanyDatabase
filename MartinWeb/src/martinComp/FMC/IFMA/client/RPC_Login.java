package martinComp.FMC.IFMA.client;
import com.google.gwt.core.shared.GWT;
public class RPC_Login {
		public static final LoginServiceAsync login =
				GWT.create(LoginService.class);
}
