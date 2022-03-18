package org.jfree.data.test.range;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;

public class RangeExpandToInclude {

	
	/**
	 * test 57
	 * tests a value that expands upper bound
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void mormalRangeUpperTest57(){ 
		Range ran = new Range(-10,0);
		Range actualRange = Range.expandToInclude(ran,2); // return the upper lower value which should be above max value 
		Range expectedRange = new Range(-10,2); // indicates overflow below maximum  negative double value
		
		assertTrue("scale to engulf by upper bound ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	
	/**
	 * test 58
	 * test a value that expands lower bound
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void normalRangeLowerTest58(){ 
		Range ran = new Range(0,10);
		Range actualRange = Range.expandToInclude(ran,-2); // return the upper lower value which should be above max value 
		Range expectedRange = new Range(-2, 10); // indicates overflow below maximum  negative double value
		
		assertTrue("scale to engulf by lower bound ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	/**
	 * test 59
	 * test with a null range retuirns range with upper and lower are value
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void nullRangeTest59(){ 
		Range ran = null;
		Range actualRange = Range.expandToInclude(ran, 2); // return the upper lower value which should be above max value 
		Range expectedRange = new Range(2, 2); // indicates overflow below maximum  negative double value
		
		assertTrue("range containing value as lower and upper ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	/**
	 * test 60
	 * upper bound is same as value returns original range
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void vlaueEqualsUpperBound60(){ 
		Range ran = new Range(-10,10);
		Range actualRange = Range.expandToInclude(ran,10); // return the upper lower value which should be above max value 
		Range expectedRange = ran; // indicates overflow below maximum  negative double value
		
		assertTrue("returns original range ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	
	/**
	 * test 61
	 * lower bound is same as value returns original range
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void vlaueEqualsLowerBound61(){ 
		Range ran = new Range(-10,10);
		Range actualRange = Range.expandToInclude(ran,-10); // return the upper lower value which should be above max value 
		Range expectedRange = ran; // indicates overflow below maximum  negative double value
		
		assertTrue("returns original range ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	
	//new mutation tests
	
	
	/**
	 * test 111
	 * include in middle of range
	 * 
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void middleofRange111(){ 
		Range ran = new Range(-10,10);
		Range actualRange = Range.expandToInclude(ran,0);  
		Range expectedRange = ran; 
		
		assertTrue("returns original range ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	/**
	 * test 112
	 * include at end on range 
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void includeSameAsRange112(){ 
		Range ran = new Range(10,10);
		Range actualRange = Range.expandToInclude(ran,10);  
		Range expectedRange = ran; 
		
		assertTrue("returns original range ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	/**
	 * test 113
	 * include above range
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void includeOutsideRange113(){ 
		Range ran = new Range(10,10);
		Range actualRange = Range.expandToInclude(ran,11);  
		Range expectedRange = ran; 
		
		assertFalse("returns original range ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	/**
	 * test 114
	 * include below range
	 */
	@Test(timeout = 1000) // a timeout of 1000
	public void includeBelowRange114(){ 
		Range ran = new Range(10,10);
		Range actualRange = Range.expandToInclude(ran,1);  
		Range expectedRange = ran; 
		
		assertFalse("returns new range ", expectedRange.equals(actualRange)); // assert equals 
	}
	
	
	
	
	
	
}//end class
