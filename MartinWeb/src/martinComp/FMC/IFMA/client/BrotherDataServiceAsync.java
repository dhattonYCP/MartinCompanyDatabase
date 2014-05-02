package martinComp.FMC.IFMA.client;

import martinComp.FMC.IFMA.db.ItemQuery;
import martinComp.FMC.IFMA.model.Brother;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BrotherDataServiceAsync {

	void retriveBrotherData(ItemQuery request, AsyncCallback<Brother> callback);

}
