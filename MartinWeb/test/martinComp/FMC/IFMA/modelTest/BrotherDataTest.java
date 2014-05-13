package martinComp.FMC.IFMA.modelTest;

import static org.junit.Assert.*;
import martinComp.FMC.IFMA.shared.BrotherData;

import org.junit.Before;
import org.junit.Test;

public class BrotherDataTest {
	BrotherData test;
	@Before
	public void setUp() throws Exception {
		test = new BrotherData();
		test.setId(9025);
		test.setFirstName("Dalton");
		test.setLastName("Wagman");
		test.setPledgeClass("Kappa");
		test.setGPA("2.5");
		test.setPosition("Member");
	}

	@Test
	public void testBrotherData() {
		assertNotEquals("BrotherData: Brother not found",test,new BrotherData());
	}
	@Test
	public void testSetId() {
		test.setId(4856);
		assertEquals("New id works",4856,test.getId());
		assertNotEquals("Old id did not take",9025,test.getId());
	}

	@Test
	public void testSetLastName() {
		test.setLastName("Bechtold");
		assertEquals("Found his big","Bechtold",test.getLastName());
		assertNotEquals("No test for him","Wagmon",test.getLastName());
	}

	@Test
	public void testSetFirstName() {
		test.setFirstName("Chad");
		assertEquals("Found his big","Chad",test.getFirstName());
		assertNotEquals("No test for him","Dalton",test.getFirstName());
	}

	@Test
	public void testSetPosition() {
		test.setPosition("Chaplin");
		assertEquals("Go Little","Chaplin",test.getPosition());
		assertNotEquals("Back to where he started","Member",test.getPosition());
	}

	@Test
	public void testSetPledgeClass() {
		test.setPledgeClass("Iota");
		assertEquals("Found his big","Iota",test.getPledgeClass());
		assertNotEquals("Nope","Kappa",test.getPledgeClass());
	}

	@Test
	public void testSetGPA() {
		test.setGPA("2.45");
		assertEquals("Tough break","2.45",test.getGPA());
		assertNotEquals("Least its not here","1.02",test.getGPA());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Found him","Wagman",test.getLastName());
		assertNotEquals("Not his big","Bechtold",test.getLastName());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("Found him","Dalton",test.getFirstName());
		assertNotEquals("Not his big","Chad",test.getFirstName());
	}

	@Test
	public void testGetPosition() {
		assertEquals("Sounds right", "Member",test.getPosition());
		assertNotEquals("One day","Secrutary",test.getPosition());
	}

	@Test
	public void testGetPledgeClass() {
		assertEquals("Found him","Kappa",test.getPledgeClass());
		assertNotEquals("Not his big","Iota",test.getPledgeClass());
	}

	@Test
	public void testGetGPA() {
		assertEquals("Yay","2.5",test.getGPA());
		assertNotEquals("Nope","2.49",test.getGPA());
	}

	@Test
	public void testGetId() {
		assertEquals("success",9025,test.getId());
		assertNotEquals("No id match",4856,test.getId());
	}

}
