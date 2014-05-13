package martinComp.FMC.IFMA.client;


import martinComp.FMC.IFMA.shared.BrotherData;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("brodata")
public interface BrotherDataService extends RemoteService {
	public BrotherData retriveBrotherData(String parameter);
	BrotherData addBrotherData(String lastName, String firstName,
			String position, String pledgeClass, String GPA);
}
