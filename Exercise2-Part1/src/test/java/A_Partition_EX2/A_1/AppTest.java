package A_Partition_EX2.A_1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */

	@Test
	public void A_PartitionCheckMin() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(90);
		assertEquals(expected, result);
	}
	
	@Test
	public void A_PartitionCheckMinPlusOne() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(91);
		assertEquals(expected, result);
	}
	
	@Test
	public void A_PartitionCheckNominal() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(93);
		assertEquals(expected, result);
	}
	
	@Test
	public void A_PartitionCheckMaxMinusOne() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(99);
		assertEquals(expected, result);
	}
	
	@Test
	public void A_PartitionCheckMax() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(100);
		assertEquals(expected, result);
	}

}
