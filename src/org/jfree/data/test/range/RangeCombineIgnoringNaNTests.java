package org.jfree.data.test.range;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

public class RangeCombineIgnoringNaNTests {
	private Range rangeOne;
	private Range rangeTwo;
	private Range rangeNaN;
	
	/*
	 * This method sets rangeOne to a nominal and positive range.
	 */
	@Before
	public void setUpOne() throws Exception { 
		rangeOne = new Range(2.718, 6.28);
	}	
	
	/*
	 * This method sets rangeTwo to a nominal and positive range.
	 */
	@Before
	public void setUpTwo() throws Exception { 
		rangeTwo = new Range(3.14, 9.81);
	}
	
	/*
	 * This method sets rangeNaN to a range with Double.NaN as the bounds.
	 */
	@Before
	public void setUpNaN() throws Exception { 
		rangeTwo = new Range(Double.NaN, Double.NaN);
	}
	
	/*
	 * Test case #77
	 * This test covers combining two nominal and positive ranges from rangeOne and
	 * rangeTwo, which should result in a lower bound of 2.718
	 */
	@Test
	public void testCombineNaNLower77() {
		Range result = Range.combineIgnoringNaN(rangeOne, rangeTwo);
		assertEquals("The minimum bound of the combined range should be 2.718",
				2.718, result.getLowerBound(), .000000001d);
	}
	
	/*
	 * Test case #78
	 * This test covers combining two nominal and positive ranges from rangeOne and
	 * rangeTwo, which should result in a upper bound of 9.81
	 */
	@Test
	public void testCombineNaNUpper78() {
		Range result = Range.combineIgnoringNaN(rangeOne, rangeTwo);
		assertEquals("The upper bound of the combined range should be 6.28",
				6.28, result.getUpperBound(), .000000001d);
	}
	
	/*
	 * Test case #79
	 * This test covers combining a null range and a nominal and positive range from 
	 * rangeTwo, which should result in rangeTwo
	 */
	@Test
	public void testCombineNaNNullOne79() {
		Range result = Range.combineIgnoringNaN(null, rangeOne);
		assertTrue("Result should equal rangeTwo", result.equals(rangeOne));
	}
	
	/*
	 * Test case #80
	 * This test covers combining a null range and a nominal and positive range from 
	 * rangeOne, which should result in rangeOne
	 */
	@Test
	public void testCombineNaNNullTwo80() {
		Range result = Range.combineIgnoringNaN(rangeOne, null);
		assertTrue("Result should equal rangeOne", result.equals(rangeOne));
	}
	
	/*
	 * Test case #81
	 * This test covers combining a NaN range and a NaN range, 
	 * which should result in null
	 */
	@Test
	public void testCombineNaNAndNaN81() {
		Range result = Range.combineIgnoringNaN(rangeNaN, rangeNaN);
		assertTrue("Result should equal null", result == null);
	}
	
	/*
	 * Test case #82
	 * This test covers combining a nominal and positive range from rangeOne
	 * and a null range, which should result in a lower bound of 2.718
	 */
	@Test
	public void testCombineNaNNullTwoUpper82() {
		Range result = Range.combine(rangeOne, null);
		assertEquals("The upper bound of the combined range should be 9.81",
				rangeOne.getLowerBound(), result.getLowerBound(), .000000001d);
	}
	
	/*
	 * Test case #83
	 * This test covers combining a nominal and positive range from rangeOne
	 * and a null range, which should result in a upper bound of 6.28
	 */
	@Test
	public void testCombineNaNNullTwoUpper83() {
		Range result = Range.combine(rangeOne, null);
		assertEquals("The upper bound of the combined range should be 9.81",
				rangeOne.getUpperBound(), result.getUpperBound(), .000000001d);
	}
	
	/*
	 * Test case #84
	 * This test covers combining a null range and a NaN range,
	 * which should result in null
	 */
	@Test
	public void testCombineNaNNullOneNaNTwo84() {
		Range result = Range.combineIgnoringNaN(null, rangeNaN);
		assertTrue("Should be null", result == null);
	}
	
	/*
	 * Test case #85
	 * This test covers combining a NaN range with a null,
	 * which should result in null
	 */
	@Test
	public void testCombineNaNNullOneNaNTwo85() {
		Range result = Range.combineIgnoringNaN(rangeNaN, null);
		assertTrue("Should be null", result == null);
	}
	
	/*
	 * This method resets rangeOne back to a null value.
	 */
	@After
	public void tearDownOne() {
		rangeOne = null;
	}
	
	/*
	 * This method resets rangeTwo back to a null value.
	 */
	@After
	public void tearDownTwo() {
		rangeTwo = null;
	}
	
	/*
	 * This method resets rangeNaN back to a null value.
	 */
	@After
	public void tearDownNaN() {
		rangeNaN = null;
	}



//new mutation tests
	
//	assertTrue("The expanded range", expected.equals(result));

	
	
	/*
	 * Test case 115
	 * testing null null arguments 
	 *
	 */
	@Test
	public void nullNullTest115() {
		
		Range result = Range.combineIgnoringNaN(null, null);
		Range expected = null;
		assertNull("shold be null", result);
	}
	/*
	 * Test case 116
	 * null and NaN as arguments
	 */
	@Test
	public void nullNaNtest116() {
		Range a2 = new Range(Math.sqrt(-4),Math.sqrt(-4));
		Range result = Range.combineIgnoringNaN(null, a2);
		assertNull("shold be null", result);
	}
	
	/*
	 * Test case 117
	 *  NaN and null as arguments
	 */
	@Test
	public void NaNnullTes117() {
		Range a1 = new Range(Math.sqrt(-4),Math.sqrt(-4));
		Range result = Range.combineIgnoringNaN(a1,null);
		assertNull("shold be null", result);
	}
	
	/*
	 * Test case 118
	 *NaN and NaN as arguments
	 */
	@Test
	public void NaNNaNTest118() {
		Range a1 = new Range(Math.sqrt(-4),Math.sqrt(-4));
		Range a2 = new Range(Math.sqrt(-4),Math.sqrt(-4));
		Range result = Range.combineIgnoringNaN(a1, a2);
		Range expected = null;
		assertNull("shold be null", result);
	}
	/*
	 * Test case 119
	 *null and !null as arguments
	 */
	@Test
	public void nullasArgTest119() {
		Range a2 = new Range(0,1);
		Range result = Range.combineIgnoringNaN(null, a2);
		Range expected = new Range(0,1);
		assertTrue("The expanded range", expected.equals(result));
	}
	/*
	 * Test case 120
	 * !null and null as args
	 */
	@Test
	public void nullasArg2Test120() {
		Range a2 = new Range(0,1);
		Range result = Range.combineIgnoringNaN(a2, null);
		Range expected = new Range(0,1);
		assertTrue("The expanded range", expected.equals(result));
	}




}