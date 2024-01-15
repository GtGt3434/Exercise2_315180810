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

	/**
	 * a method that checks if the inputed minimal boundary number in
	 * BVA_CheckPartionGroup method belongs to the partition group A. If yes, a one
	 * successful run will be added, otherwise, a failed run will be added to the
	 * Failure runs of JUnit
	 */
	@Test
	public void A_PartitionCheckMin() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(90);
		assertEquals(expected, result);
	}

	/**
	 * a method that checks if the inputed minimal boundary number + 1 in
	 * BVA_CheckPartionGroup method belongs to the partition group A. If yes, a one
	 * successful run will be added, otherwise, a failed run will be added to the
	 * Failure runs of JUnit
	 */
	@Test
	public void A_PartitionCheckMinPlusOne() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(91);
		assertEquals(expected, result);
	}

	/**
	 * a method that checks if the inputed nominal number in BVA_CheckPartionGroup
	 * method belongs to the partition group A. If yes, a one successful run will be
	 * added, otherwise, a failed run will be added to the Failure runs of JUnit
	 */
	@Test
	public void A_PartitionCheckNominal() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(93);
		assertEquals(expected, result);
	}

	/**
	 * a method that checks if the inputed maximum boundary number + 1 in
	 * BVA_CheckPartionGroup method belongs to the partition group A. If yes, a one
	 * successful run will be added, otherwise, a failed run will be added to the
	 * Failure runs of JUnit
	 */
	@Test
	public void A_PartitionCheckMaxMinusOne() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(99);
		assertEquals(expected, result);
	}

	/**
	 * a method that checks if the inputed minimal boundary number in
	 * BVA_CheckPartionGroup method belongs to the partition group A. If yes, a one
	 * successful run will be added, otherwise, a failed run will be added to the
	 * Failure runs of JUnit
	 */
	@Test
	public void A_PartitionCheckMax() {
		String expected = "A";
		String result = App.BVA_CheckPartionGroup(100);
		assertEquals(expected, result);
	}

}
