package logical.strings;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         Use character arrary concept to store the reversed string
 * 
 *         Use pointers to store the last value into first and first value in to
 *         last.
 */
public class ReverseAString_UsingCharacterArray {

	public static void main(String args[]) {

		String str = "Welcome"; // String to reverse
		
		System.out.println("String : "+str);

		int i = 0; // pointer for start
		int j = str.length() - 1; // pointer for end --> 7-1=6

		// Character array to store reversed string
		char revString[] = new char[j + 1]; // means new Char[7] -- Set length of reversed String
		
		// Looping and reversing
		while(i<=j) {  // 0<=6
			
			revString[j]=str.charAt(i);
			revString[i]=str.charAt(j);
			i++;
			j--;
		}
		// Printing the reversed string
		System.out.println("Reversed String : "+String.valueOf(revString));

	}
}
