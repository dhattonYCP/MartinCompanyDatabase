package martinComp.FMC.IFMA.client;


import martinComp.FMC.IFMA.model.BrotherData;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("brodata")
public interface BrotherDataService extends RemoteService {
	public BrotherData retriveBrotherData(String parameter);
}
