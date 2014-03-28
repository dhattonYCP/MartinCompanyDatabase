package martinComp.FMC.IFMA.modelTest;
import static org.junit.Assert.*;
import martinComp.FMC.IFMA.model.MemberData;
import martinComp.FMC.IFMA.model.User;

import org.junit.Test;

public class UserTest {

	@Test
	public void testUser() {
		User test = new User();
		assertNotEquals("USER: Failed to create", test, new MemberData());
	}

	@Test
	public void testGetUsername() {
		User test = new User();
		test.set("GenericUsername1");
		
		
	}

}

