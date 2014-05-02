package martinComp.FMC.IFMA.client;

import martinComp.FMC.IFMA.db.ItemQuery;
import martinComp.FMC.IFMA.model.BrotherData;
import martinComp.FMC.IFMA.model.BrotherData;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BrotherDataServiceAsync {

	void retriveBrotherData(ItemQuery request,
			AsyncCallback<BrotherData> callback);


}
