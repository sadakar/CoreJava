package logical.strings;

/**
 * Split the string into words using the split method with the regular
 * expression \\s+, which matches one or more whitespace characters (spaces,
 * tabs, newlines, etc.).
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class CountNumberOfWordsInAString {

	public static void main(String args[]) {

		String str = " This is a sample sentence to count the number of words ";

		str = str.trim();
		String[] words = {};// Empty array

		// Count the words
		if (str.isEmpty()) {
			System.out.println("Empty String");
		} else {
			words = str.split("\\s"); // Split the string into words based on whitespace
			// and count the number of resulting tokens
			int count = words.length;
			System.out.println("Number of words=" + count);
		}

		// Print the words
		for (String s : words) {
			System.out.println(s);
		}
	}
}
