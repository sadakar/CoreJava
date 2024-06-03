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
		
		//Using Arrays.toString() method
		System.out.println("Array in original order");
		System.out.println(Arrays.toString(arr));
		
		// Using regular for loop
		for(int i=0;i<=arr.length-1;i++) { // start from 0 to length-1 
			System.out.print(arr[i] +" ");
		}
		System.out.println("\nArray in reverse order");
		for(int j=arr.length-1;j>=0;j--) { // start from length-1 to 0
			System.out.print(arr[j] +" ");
		}
	}
}
