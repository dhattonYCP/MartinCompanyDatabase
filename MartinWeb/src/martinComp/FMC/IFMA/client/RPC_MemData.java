package martinComp.FMC.IFMA.client;

import com.google.gwt.core.shared.GWT;

public class RPC_MemData {
	public static final MemberDataServiceAsync memdata =
			GWT.create(MemberDataService.class);
}
