package logical.strings;
/**
 * Reverse the words in a given string
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class ReverseWordsInAString {

	public static void main(String args[]) {
		String str = "Hello world, this a java";

		// Split the string into words
		String words[] = str.split("\s");

		// Initialize a StringBuilder to build the reversed string
		StringBuilder reversed = new StringBuilder();

		// Loop through the words array in reverse order
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i != 0) {
				reversed.append(" ");
			}
		}
		System.out.println(str);
		System.out.println(reversed);
	}
}
