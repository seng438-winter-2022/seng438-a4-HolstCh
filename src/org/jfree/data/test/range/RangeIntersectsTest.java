package org.jfree.data.test.range;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;

public class RangeIntersectsTest {

	/**
	 * test 66
	 * ranges intersect
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void normalIntersectionTest66(){ 
		Range ran = new Range(-10,1);
		boolean intersect = ran.intersects(0,2); // return the upper lower value which should be above max value 
		
		assertTrue("ranges intersect ",intersect ); // assert equals 
	}
	
	/**
	 * test 67
	 * ranges do not intersect
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void noIntersectionTest67(){ 
		Range ran = new Range(-10,1);
		boolean intersect = ran.intersects(2,10); // return the upper lower value which should be above max value 
		
		assertFalse("ranges intersect ",intersect ); // assert equals 
	}
	
	/**
	 * test 68
	 * ranges intersect
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void closeButNoIntersectionTest68(){ 
		Range ran = new Range(-10,2);
		boolean intersect = ran.intersects(2,10); // return the upper lower value which should be above max value 
		
		assertFalse("ranges intersect ",intersect ); // assert equals 
	}
	
	/**
	 * Test case #93
	 * Ranges intersect, but intersects() receives a Range object
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void normalIntersectionTestWithRangeObject93(){ 
		Range ran = new Range(-10,1);
		boolean intersect = ran.intersects(ran);
		
		assertTrue("ranges intersect ", intersect);
	}
	
	//tests added for mutation testing
	
	/**
	 * Test case 107
	 * test range with large inpouts for intersects
	 * 
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void newTest107(){ 
		Range ran = new Range(0,1);
		boolean intersect = ran.intersects(-1,1);
		
		assertTrue("ranges intersect ", intersect);
	}

	/**
	 * Test case 108
	 * test basic range with inpouts out of range
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void newTest108(){ 
		Range ran = new Range(1,1);
		boolean intersect = ran.intersects(-1,-0.5);
		
		assertFalse("ranges intersect ", intersect);
	}
	
	/**
	 * Test case 109
	 * inpouts at bottom of range
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void newTest109(){ 
		Range ran = new Range(0,1);
		boolean intersect = ran.intersects(0,0);
		
		assertFalse("ranges intersect ", intersect);
	}
	/**
	 * Test case 110
	 * inpouts below range
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void newTest110(){ 
		Range ran = new Range(0,1);
		boolean intersect = ran.intersects(-1,-1);
		
		assertFalse("ranges intersect ", intersect);
	}
	
	
	
	
	
	

}
