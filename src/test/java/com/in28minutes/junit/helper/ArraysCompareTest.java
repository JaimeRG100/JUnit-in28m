package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {
	
	// Arrays.sort

	@Test
	public void testArraysSort_RandomArray() {
		
		int[] numbers = {12, 3, 4, 1};
		int[] expected = {1, 3, 4, 12};
		Arrays.sort(numbers);
		//assertEquals(expected, numbers); // fails because it expected to be the same object
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraysSort_NullArray() {
		int[] numbers = null;
		//int[] numbers = {};  // this does not throw an exception
		Arrays.sort(numbers);
	}
	
	@Test(timeout=1000)
	public void testSort_Performance() {
		int array[] = {12,23,4};
		for(int i=1;i<=1000000;i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
