package martinComp.FMC.IFMA.modelTest;

import static org.junit.Assert.*;
import martinComp.FMC.IFMA.model.SortType;
import org.junit.Test;

public class SortTypeTest {
	@Test
	public void testGetSequence() {
		SortType test = SortType.ASCEND_ALPHA;
		assertNotEquals("SORTTYPE: Sequence Incorrect" ,test.getSequence(), "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
}
