package martinComp.FMC.IFMA.client;

import com.google.gwt.core.shared.GWT;

public class RPC {
	public static final BrotherDataServiceAsync brodata = 
			GWT.create(BrotherDataService.class);
	public static final LoginServiceAsync login =
			GWT.create(LoginService.class);
}
