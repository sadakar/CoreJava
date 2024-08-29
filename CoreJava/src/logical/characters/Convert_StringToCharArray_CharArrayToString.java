package logical.characters;

import java.util.Arrays;

public class Convert_StringToCharArray_CharArrayToString {

	public static void main(String args[]) {
		
		// String to char array
		String str ="This is a string";
		char charArray[] = str.toCharArray();
		System.out.println("String to char array:"+Arrays.toString(charArray));
		
		// Char array to String
		char charArray2[] = {'h','e','l','l','o'};
		String str2 = new String(charArray2);
		System.out.println("Char Array to String:"+str2);
	}
}
