package martinComp.FMC.IFMA.client;

import martinComp.FMC.IFMA.db.ItemQuery;
import martinComp.FMC.IFMA.model.MemberData;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MemberDataServiceAsync {

	void retrieveMemberData(ItemQuery request,
			AsyncCallback<MemberData> callback);

}
