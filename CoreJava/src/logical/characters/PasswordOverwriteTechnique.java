package logical.characters;

import java.util.Arrays;

/**
 * To securely wipe or overwrite the data in the password2 char array, you can
 * overwrite its elements with another value, such as '\0' (the null character)
 * or any other character. This will ensure that the sensitive data is not
 * present in memory anymore.
 * 
 * Arrays.fill(password2, '\0'); fills the entire password2 array with the null
 * character '\0'.
 */
public class PasswordOverwriteTechnique {

	public static void main(String args[]) {
		char password2[] = new char[] { 'p', 'a', 's', 's', 'w', 'o', 'r', 'd' };
		System.out.println("Password as characters=" + Arrays.toString(password2));
		
		// Overwrite the password2 with \0 or null
		Arrays.fill(password2, '\0');
		System.out.println("Password after overwriting="+Arrays.toString(password2));
	}
}
