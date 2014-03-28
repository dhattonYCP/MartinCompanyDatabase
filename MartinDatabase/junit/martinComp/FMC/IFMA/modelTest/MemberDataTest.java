package martinComp.FMC.IFMA.modelTest;

import static org.junit.Assert.*;
import martinComp.FMC.IFMA.model.MemberData;

import org.junit.Before;
import org.junit.Test;

public class MemberDataTest {

	MemberData test;
	
	@Before
	public void setUp() {
		test = new MemberData();
		test.setAll("lastName", "firstName", "email", "phoneNumber", "companyName", "position");
	}
	
	@Test
	public void testMemberData() {
			assertNotEquals("MEMDATA: Failed to create", test, new MemberData());
	}

	@Test
	public void testSetAll() {
		test.setAll("lastName1", "firstName1", "email1", "phoneNumber1", "companyName1", "position1");
		assertEquals("MEMDATA: Failed to Retrieve", "firstName1", test.getFirstName());
		assertEquals("MEMDATA: Failed to Retrieve", "lastName1", test.getLastName());
		assertEquals("MEMDATA: Failed to Retrieve", "email1", test.getEmail());
		assertEquals("MEMDATA: Failed to Retrieve", "phoneNumber1", test.getPhoneNumber());
		assertEquals("MEMDATA: Failed to Retrieve", "companyName1", test.getCompanyName());
		assertEquals("MEMDATA: Failed to Retrieve", "position1", test.getPosition());
	}
	
	@Test
	public void testSetFirstName() {
		test.setFirstName("test");
		assertEquals("MEMDATA: Could not set FirstName", "test", test.getFirstName());;
		
	}

	@Test
	public void testSetLastName() {
		test.setLastName("test");
		assertEquals("MEMDATA: Could not set LastName", "test", test.getLastName());;
	}

	@Test
	public void testSetEmail() {
		test.setEmail("test");
		assertEquals("MEMDATA: Could not set Email", "test", test.getEmail());;
	}

	@Test
	public void testSetPhoneNumber() {
		test.setPhoneNumber("test");
		assertEquals("MEMDATA: Could not set PhoneNumber", "test", test.getPhoneNumber());;
	}

	@Test
	public void testSetCompanyName() {
		test.setCompanyName("test");
		assertEquals("MEMDATA: Could not set CompanyName", "test", test.getCompanyName());;
	}

	@Test
	public void testSetPosition() {
		test.setPosition("test");
		assertEquals("MEMDATA: Could not set Position", "test", test.getPosition());;
	}
	
	@Test
	public void testGetFirstName() {
		assertEquals("MEMDATA: Could not get First", "firstName", test.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("MEMDATA: Could not get LastName", "lastName", test.getLastName());
	}

	@Test
	public void testGetEmail() {
		assertEquals("MEMDATA: Could not get Email", "email", test.getEmail());
	}

	@Test
	public void testGetPhoneNumber() {
		assertEquals("MEMDATA: Could not get PhoneNumber", "phoneNumber", test.getPhoneNumber());
	}

	@Test
	public void testGetCompanyName() {
		assertEquals("MEMDATA: Could not get CompanyName", "companyName", test.getCompanyName());
	}

	@Test
	public void testGetPosition() {
		assertEquals("MEMDATA: Could not get Position", "position", test.getPosition());
	}

}
