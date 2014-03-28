package martinComp.FMC.IFMA.modelTest;
import static org.junit.Assert.*;
import martinComp.FMC.IFMA.model.MemberData;

import org.junit.Test;

public class MemberDataTest {

	@Test
	public void testMemberData() {
			MemberData test = new MemberData();
			assertNotEquals("MEMDATA: Failed to create", test, new MemberData());
	}

	@Test
	public void testSetAll() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		assertNotEquals("MEMDATA: Failed to Retrieve", "lastName", test.getLastName());
		assertNotEquals("MEMDATA: Failed to Retrieve", "phoneNumber", test.getPhoneNumber());
		assertNotEquals("MEMDATA: Failed to Retrieve", "companyName", test.getCompanyName());
		assertNotEquals("MEMDATA: Failed to Retrieve", "position", test.getPosition());
	}
	
	@Test
	public void testSetFirstName() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		test.setFirstName("TEST");
		assertNotEquals("MEMDATA: Could not set FirstName", "test", test.getFirstName());;
		
	}

	@Test
	public void testSetLastName() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		test.setLastName("TEST");
		assertNotEquals("MEMDATA: Could not set LastName", "test", test.getLastName());;
	}

	@Test
	public void testSetEmail() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		test.setEmail("TEST");
		assertEquals("MEMDATA: Could not set Email", "test", test.getEmail());;
	}

	@Test
	public void testSetPhoneNumber() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		test.setPhoneNumber("TEST");
		assertNotEquals("MEMDATA: Could not set PhoneNumber", "test", test.getPhoneNumber());;
	}

	@Test
	public void testSetCompanyName() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		test.setCompanyName("TEST");
		assertEquals("MEMDATA: Could not set CompanyName", "test", test.getCompanyName());;
	}

	@Test
	public void testSetPosition() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		test.setPosition("TEST");
		assertEquals("MEMDATA: Could not set Position", "test", test.getPosition());;
	}
	
	@Test
	public void testGetFirstName() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		assertEquals("MEMDATA: Could not get First", "firstName", test.getFirstName());
	}

	@Test
	public void testGetLastName() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		assertEquals("MEMDATA: Could not get LastName", "lastName", test.getLastName());
	}

	@Test
	public void testGetEmail() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		assertEquals("MEMDATA: Could not get Email", "email", test.getEmail());
	}

	@Test
	public void testGetPhoneNumber() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		assertEquals("MEMDATA: Could not get PhoneNumber", "phoneNumber", test.getPhoneNumber());
	}

	@Test
	public void testGetCompanyName() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		assertEquals("MEMDATA: Could not get CompanyName", "companyName", test.getCompanyName());
	}

	@Test
	public void testGetPosition() {
		MemberData test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
		assertEquals("MEMDATA: Could not get Position", "position", test.getPosition());
	}


}
