package martinComp.FMC.IFMA.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import martinComp.FMC.IFMA.model.BrotherData;
import martinComp.FMC.IFMA.db.ItemQuery;

@RemoteServiceRelativePath("brodata")
public interface BrotherDataService extends RemoteService {
	public BrotherData retriveBrotherData(ItemQuery request);
}
