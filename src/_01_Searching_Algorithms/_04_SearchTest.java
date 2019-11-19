package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//_00_LinearSearch
		//1. use the assertEquals method to test your linear search method.
		String[] test1 = {"hi", "yeet", "something", "matee"};
		String[] test2 = {"SCR", "350", "331", "68"};
		String[] test3 = {"GCR", "2019", "wen", "???"};
		
		assertEquals(1, _00_LinearSearch.linearSearch(test1, "yeet"));
		assertEquals(3, _00_LinearSearch.linearSearch(test2, "68"));
		assertEquals(0, _00_LinearSearch.linearSearch(test3, "GCR"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] test1 = {0, 1, 2, 3};
		int[] test2 = {4, 5, 6, 7};
		int[] test3 = {68, 331, 350, 707};
		assertEquals(2, _01_BinarySearch.binarySearch(test1, 0, test1.length-1, 2));
		assertEquals(0, _01_BinarySearch.binarySearch(test2, 0, test2.length-1, 4));
		assertEquals(1, _01_BinarySearch.binarySearch(test3, 0, test3.length-1, 331));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] test1 = {0, 1, 2, 3};
		int[] test2 = {4, 5, 6, 7};
		int[] test3 = {68, 331, 350, 707};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(test1, 2));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(test2, 4));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(test3, 331));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] test1 = {0, 1, 2, 3};
		int[] test2 = {4, 5, 6, 7};
		int[] test3 = {68, 331, 350, 707};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(test1, 2));
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(test2, 4));
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(test3, 331));
	}
}
