package martinComp.FMC.IFMA.sharedTest;

import static org.junit.Assert.*;
import martinComp.FMC.IFMA.shared.FieldVerifier;

import org.junit.Before;
import org.junit.Test;

public class FieldVerifierTest {
	FieldVerifier test;
	String name;
	@Before
	public void setUp() throws Exception {
		test = new FieldVerifier();
		name = "Chad";
	}

	@Test
	public void testIsValidName() {
		assertTrue(test.isValidName(name));
	}

}
