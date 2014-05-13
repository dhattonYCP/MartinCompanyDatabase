package martinComp.FMC.IFMA.modelTest;

import static org.junit.Assert.*;
import martinComp.FMC.IFMA.shared.Login;

import org.junit.Before;
import org.junit.Test;

public class LoginTest {
	Login test;
	@Before
	public void setUp(){
		test = new Login();
		test.setId(9025);
		test.setUserName("Bob");
		test.setPassword("abc123");
		
	}
	@Test
	public void testLogin() {
		assertNotEquals("Login: Failed to create",test,new Login());
	}
	@Test
	public void testGetId(){
		assertEquals("Success",9025,test.getId());
		assertNotEquals("Failed: no such ID",4683,test.getId());
	}
	@Test
	public void testGetUsername(){
		assertEquals("Success","Bob",test.getUser());
		assertNotEquals("Faild: no such user","alice",test.getUser());
	}
	@Test 
	public void testGetPassword(){
		assertEquals("Success","abc123",test.getPassword());
		assertNotEquals("Failed: password does not match","ads545",test.getPassword());
	}

}
