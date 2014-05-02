package martinComp.FMC.IFMA.client;

import com.google.gwt.core.shared.GWT;

public class RPC_BrotherData {
		public static final BrotherDataServiceAsync brodata = 
				GWT.create(BrotherDataService.class);
}
