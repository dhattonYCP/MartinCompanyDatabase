package martinComp.FMC.IFMA.db;

import java.util.ArrayList;

import martinComp.FMC.IFMA.model.MemberData;

public interface IDatabase {

	public ArrayList<MemberData> retrieveListData(RequestHandler request);
	public void sendData(RequestHandler request);
	
}
