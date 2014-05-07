package martinComp.FMC.IFMA.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import martinComp.FMC.IFMA.model.BrotherData;
import martinComp.FMC.IFMA.shared.Login;

public class FakeDatabase implements IDatabase {
	private List<Login> loginList;
	private List<BrotherData> broDataList;

	public FakeDatabase() {
		this.loginList = new ArrayList<Login>();
		this.broDataList = new ArrayList<BrotherData>();
		
		Login user1 = new Login();
		user1.setPassword("abc");
		user1.setUserName("alice");

		Login user2 = new Login();
		user2.setPassword("def");
		user2.setUserName("bob");

		loginList.add(user1);
		loginList.add(user2);
		
		BrotherData data1 = new BrotherData();
		data1.setFirstName("Guy");
		data1.setLastName("One");
		data1.setGPA(1.5);
		data1.setPledgeClass("Alpha");
		
		BrotherData data2 = new BrotherData();
		data2.setFirstName("Dude");
		data2.setLastName("Two");
		data2.setGPA(2.5);
		data2.setPledgeClass("Beta");
		
		BrotherData data3 = new BrotherData();
		data3.setFirstName("Guy");
		data3.setLastName("Three");
		data3.setGPA(4.0);
		data3.setPledgeClass("Gamma");
		
		BrotherData data4 = new BrotherData();
		data4.setFirstName("Dude");
		data4.setLastName("Four");
		data4.setGPA(2.49);
		data4.setPledgeClass("Beta");
		
		broDataList.add(data1);
		broDataList.add(data2);
		broDataList.add(data3);
		broDataList.add(data4);
		
		
	}

	@Override
	public List<Login> getLogin() throws SQLException {
		return new ArrayList<Login>(loginList);
	}

	// making
	@Override
	public Login findLogin(String username, String password) {
		for (Login user : loginList) {
			if (user.getUser().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null; // no such user
	}

	@Override
	public Login addLogin(String username, String password) {
		Login login = new Login();
		login.setUserName(username);
		login.setPassword(password);
		login.setId(loginList.size());
		loginList.add(login);
		return login;
	}

	@Override
	public List<BrotherData> getBroData(String parameter) {
		List<BrotherData> temp = new ArrayList<BrotherData>();
		for(BrotherData e : this.broDataList){
			if(true)temp.add(e);
		}
		return temp;
	}

	@Override
	public BrotherData findBroData(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BrotherData addBroData(String lastName, String firstName,
			String position, String pledgeClass, double GPA) {
		// TODO Auto-generated method stub
		return null;
	}
}
