package logical.strings;

/**
 * Printing frequency of each character just after its consecutive occurrences
 * 
 * Given a string in such a way that every character occurs in a repeated
 * manner.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class PrintFrequencyOfEachCharConsecutiveOccurances {

	public static void main(String args[]) {
		String str = "aabcccccaaa";
		System.out.println("Given String:" + str);
		StringBuilder result = new StringBuilder();

		int n = str.length();
		for (int i = 0; i < n; i++) {
			// Count occurrences of current character
			int count = 1;
			while (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
				i++;
				count++;
			}
			// Append the character and its count to the result
			result.append(str.charAt(i)).append(count);
		}

		System.out.println("Compressed String or Frequency Of each consuecutive char:" + result.toString());

	}
}
