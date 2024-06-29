package logical.arrays;

import java.util.Arrays;

public class DisplayStringArray {

	public static void main(String args[]) {
		
		// String array
		String strarr[] = {"John","Sadakar","Hasini"};
		
		// Display string array
		System.out.println(Arrays.toString(strarr));
		
		// Sort array
		Arrays.sort(strarr);
		System.out.println(Arrays.toString(strarr));
	}
}
