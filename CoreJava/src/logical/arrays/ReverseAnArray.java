package logical.arrays;

import java.util.Arrays;

/**
 * Print reverse of a given array
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class ReverseAnArray {

	public static void main(String args[]) {
		int arr[]= {10,8,4,6,9};
		
		// Print array using Arrays.toString() method
		System.out.println("Print array using Arrays.toString() method");
		System.out.println(Arrays.toString(arr));
		
		// Print array using regular for loop
		System.out.println("Print array using regular for loop");
		for(int i=0;i<=arr.length-1;i++) { // start from 0 to length-1 
			System.out.print(arr[i] +" ");
		}
		// Print reversed array using regular for loop
		System.out.println("\nPrint array in reverse order using regular for loop");
		for(int j=arr.length-1;j>=0;j--) { // start from length-1 to 0
			System.out.print(arr[j] +" ");
		}
	}
}
