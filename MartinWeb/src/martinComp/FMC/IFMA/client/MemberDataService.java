package martinComp.FMC.IFMA.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import martinComp.FMC.IFMA.model.MemberData;
import martinComp.FMC.IFMA.db.ItemQuery;

@RemoteServiceRelativePath("memdata")
public interface MemberDataService  extends RemoteService {
	public MemberData retrieveMemberData(ItemQuery request);
}
