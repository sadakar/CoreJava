package logical.characters;

import java.util.Arrays;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         https://medium.com/@k.manu00005/why-to-use-char-array-over-a-string-for-storing-passwords-in-java-5846baedf34b#:~:text=So%20storing%20a%20password%20in,after%20its%20work%20is%20complete.
 * 
 *         Strings are immutable:(unchanging over time or unable to be changed.
 *         i.e., fixed, un changable
 * 
 *         Strings are immutable in Java and therefore if a password is stored
 *         as plain text it will be available in memory until Garbage collector
 *         clears it and as Strings are used in String pool for re-usability
 *         there are high chances that it will remain in memory for long
 *         duration, which is a security threat. Strings are immutable and there
 *         is no way that the content of Strings can be changed because any
 *         change will produce new String, while if you use a char[] you can
 *         still set all the elements as blank or zero. So storing a password in
 *         a character array clearly mitigates the security risk of stealing a
 *         password. With an array, the data can be wiped explicitly data after
 *         its work is complete. The array can be overwritten and the password
 *         won’t be present anywhere in the system, even before garbage
 *         collection.
 * 
 * 
 *         2. Security: Any one who has access to memory dump can find the
 *         password in clear text and that’s another reason to use encrypted
 *         password than plain text. So Storing password in character array
 *         clearly mitigates security risk of stealing password. Java itself
 *         recommends using the getPassword() method of JPasswordField of
 *         javax.swing which returns a char[], instead of the deprecated
 *         getText() method which returns passwords in clear text stating
 *         security reasons. It’s good to follow advice from the Java team and
 *         adhere to standards rather than going against them.
 * 
 *         3. Log file safety: With an array, one can explicitly wipe the data ,
 *         overwrite the array and the password won’t be present anywhere in the
 *         system. With plain String, there are much higher chances of
 *         accidentally printing the password to logs, monitors or some other
 *         insecure place, char[] is less vulnerable.
 
 */
public class Password {

	public static void main(String args[]) {
		String password = "MyPassword@123";
		char password2[] = new char[] { 'p', 'a', 's', 's', 'w', 'o', 'r', 'd' };
		System.out.println("Password as String=" + password);
		System.out.println("Password as characters=" + Arrays.toString(password2));
	}
}
