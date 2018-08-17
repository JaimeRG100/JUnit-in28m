package com.in28minutes.junit.helper;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	private StringHelper helper = new StringHelper();

	// AACD => CD   ACD => CD   CDEF=>CDEF   CDAA => CDAA
	
	@Parameters
	public static Collection testConditions() {
		// {input, output}
		String expectedOutputs[][] = 
		{{"AACD", "CD"}, {"ACD", "CD"},
		 {"CDEF", "CDEF"}, {"CDAA", "CDAA"}};
		return Arrays.asList(expectedOutputs);
	}
	
	private String input;
	private String expectedOutput;
	
	

	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {		
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
	}
	
}
