package martinComp.FMC.IFMA.db;
import java.util.ArrayList;
import martinComp.FMC.IFMA.model.MemberData;

public class FakeDatabase implements IDatabase {

	
	private ArrayList<MemberData> memData;
	private RequestHandler request;

	public FakeDatabase() {
		memData = new ArrayList<MemberData>();
		request = new RequestHandler();
		
	}

	@Override
	public ArrayList<MemberData> retrieveListData(RequestHandler request){
		return request.retrieveListData();
	}

	@Override
	public void sendData(RequestHandler request) {
		memData.add(request.addData());
	}

}
