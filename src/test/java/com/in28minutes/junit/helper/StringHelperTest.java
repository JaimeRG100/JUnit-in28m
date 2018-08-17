package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringHelperTest {
	
	private StringHelper helper = new StringHelper();
	
	/*
	@Before
	public void before() {
		helper = new StringHelper();
	}
	*/

	// AACD => CD   ACD => CD   CDEF=>CDEF   CDAA => CDAA
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		//fail(" Not yet implemented");
		
		//assertEquals("ABC","ABC");
		// (expected, actual)
		
		//StringHelper helper = new StringHelper();
		//String actual = helper.truncateAInFirst2Positions("AACD");
		//String expected = "CD";
		//assertEquals(expected, actual);
		
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoAcharacter() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinLastPositions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	// ABCD => false,   ABAB => true,   AB => true,   A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD")); 
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB")); 
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB")); 
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A")); 
	}

}
