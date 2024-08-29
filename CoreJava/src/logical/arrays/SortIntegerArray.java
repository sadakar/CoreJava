package logical.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortIntegerArray {

	public static void main(String args[]) {
		int arr[] = { 10, -5, 0, 2, 3 };

		// print array
		System.out.println("Original array");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		// print sorted array -- default is ascending order
		System.out.println("\nArray after sorting -- default is ascending order");
		Arrays.sort(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}

		// Reverse array is nothing but ascending order

		/*
		 * NOTE : We can not use Arrays.sort(arr, Collections.reverseOrder()) with
		 * primitive type int rather Integer array can be sorted with Collections.
		 *  Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		 *   Arrays.sort(arr, Collections.reverseOrder());
		 * 
		 */

		System.out.println("\nArray in descending order");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
