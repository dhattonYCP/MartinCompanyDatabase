package martinComp.FMC.IFMA.modelTest;
import static org.junit.Assert.*;
import martinComp.FMC.IFMA.model.User;

import org.junit.Before;
import org.junit.Test;


public class UserTest {
	User test;
	@Before
	public void setUp(){
		test = new User();
		test.setUserName("Sally");
		test.setPassword("abc123");
		test.setAlertNotification(true);
	}

	@Test
	public void testUser() {
		assertNotEquals("User: Failed to create", test, new User());
	}

	@Test
	public void testGetUsername() {
		assertNotEquals("User: Could not get Username","GenericUsername1",test.getUserName());
		
	}
	@Test
	public void testGetPassword(){
		assertEquals("User:We can't find shit","abc123",test.getPassword());
	}
	@Test
	public void testGetAlertNotification(){
		assertNotEquals("User:boolean failed like a boss",false,test.getAlertNotification());
	}

}

