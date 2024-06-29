package logical.strings;

import java.util.Arrays;

/**
 * To determine if two strings are anagrams in Java, you need to compare whether
 * both strings contain the exact same characters with the same frequencies. One
 * common approach is to sort the characters of both strings and compare the
 * sorted versions. Another approach is to count the occurrences of each
 * character in both strings and then compare the counts.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class TwoStringsAnagramsOrNot {

	public static void main(String args[]) {

		// Strings 
		String str1 = "listen";
		String str2 = "silent";
		
		// if the length of the strings are not same then they are not anagrams
		
		if(str1.length()!=str2.length()) {
			System.out.println("Strings are not anagrams");
		}
		
		// Convert the strings to char array and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		// Sort the char array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if (Arrays.equals(charArray1, charArray2)==true) {
			System.out.println("Strings are anagrams");
		}else {
			System.out.println("String are not anagrams");
		}
		
		
	}
}
