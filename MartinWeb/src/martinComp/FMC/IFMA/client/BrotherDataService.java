package martinComp.FMC.IFMA.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import martinComp.FMC.IFMA.model.Brother;
import martinComp.FMC.IFMA.db.ItemQuery;

@RemoteServiceRelativePath("brodata")
public interface BrotherDataService extends RemoteService {
	public Brother retriveBrotherData(ItemQuery request);
}
