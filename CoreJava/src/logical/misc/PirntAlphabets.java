package logical.misc;

/**
 * Print alaphabets from A to Z
 * @author Sadakar.Pochampalli
 *
 */
public class PirntAlphabets {

	public static void main(String args[]) {
		
		for(int i='A';i<='Z';i++) {
			System.out.printf("%c ", i); // used printf instead of println and %c is used
		}
	}
}
