package test.arrays;

import java.util.Arrays;

public class CharArrayToString {

	public static void main(String args[]) {
		
		// char array to string
		char arr[] = { 's', 'a', 'd', 'h', 'a' };
		String str = new String(arr);
		System.out.println(str);
		
		// string to char array
		String str2 ="Sadakar";
		char arr2[] = str2.toCharArray();
		System.out.println(Arrays.toString(arr2));
	}
}
