package logical.arrays;

import java.util.Arrays;

public class DisplayStringArray {

	public static void main(String args[]) {
		
		// String array
		String strarr[] = {"John","Sadakar","Hasini"};
		
		//Display using for each loop
		for(String s : strarr) {
			System.out.print(s +" ");
		}
		System.out.println("\n");
		
		// Display string array
		System.out.println(Arrays.toString(strarr));
		
		// Sort array
		Arrays.sort(strarr);
		System.out.println(Arrays.toString(strarr));
	}
}
