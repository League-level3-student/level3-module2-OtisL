package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void swap() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
	}

	@Test
	void sort() {
		int[] z = { 7, 3, 5, 9, 2 };
		int[] q = { 2, 3, 5, 7, 9 };
		sortIntArray(z);
		assertArrayEquals(q, z);
	}

	@Test
	void middle() {
		int[] m = { 7, 3, 9, 5, 2 };
		assertEquals(5, findMiddle(m));
	}

	// 1. Complete the method so that the first two elements of the array are
	// swapped
	public static void swapArrayOfTwo(int[] arr) {
		int first = arr[0];
		int second = arr[1];
		arr[1] = first;
		arr[0] = second;

	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int first = arr[i];
					int second = arr[i + 1];
					arr[i + 1] = first;
					arr[i] = second;
					swap=true;
				}
			}
		}
	}

	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		return arr[arr.length/2];
	}
	}
