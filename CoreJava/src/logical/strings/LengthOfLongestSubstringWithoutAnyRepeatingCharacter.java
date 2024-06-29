package logical.strings;

import java.util.*;

/**
 * To find the longest substring without repeating characters in Java, you can
 * use a sliding window approach. This approach maintains a window defined by
 * two pointers, and a set to track characters within the current window. As you
 * iterate through the string, you adjust the window to maintain the constraint
 * that all characters within the window are unique.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class LengthOfLongestSubstringWithoutAnyRepeatingCharacter {

	public static int lengthOfLongestSubstring(String s) {
		// Base case
		if (s == null || s.length() == 0) {
			return 0;
		}

		int maxLength = 0;
		int left = 0;
		Set<Character> uniqueChars = new HashSet<>();

		for (int right = 0; right < s.length(); right++) {
			char currentChar = s.charAt(right);

			// If character is already in the set, remove characters from the left
			while (uniqueChars.contains(currentChar)) {
				uniqueChars.remove(s.charAt(left));
				left++;
			}

			// Add the current character to the set
			uniqueChars.add(currentChar);

			// Update the max length of substring found
			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String s1 = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s1)); // Output: 3 ("abc")

		String s2 = "bbbbb";
		System.out.println(lengthOfLongestSubstring(s2)); // Output: 1 ("b")

		String s3 = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s3)); // Output: 3 ("wke")

		String s4 = "";
		System.out.println(lengthOfLongestSubstring(s4)); // Output: 0

		String s5 = "dvdf";
		System.out.println(lengthOfLongestSubstring(s5)); // Output: 3 ("vdf")
	}
}
