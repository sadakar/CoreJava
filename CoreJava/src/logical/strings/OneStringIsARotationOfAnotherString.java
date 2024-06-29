package logical.strings;

/**
 * To check if one string is a rotation of another in Java, you can leverage the
 * fact that a rotated version of a string will always be a substring of the
 * concatenation of that string with itself. For example, if you concatenate the
 * string ABCD with itself, you get ABCDABCD, which contains all possible
 * rotations of ABCD.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class OneStringIsARotationOfAnotherString {

	public static boolean isRotation(String s1, String s2) {
		// Check if lengths are different or either string is null
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}

		// Concatenate s1 with itself
		String concatenated = s1 + s1;

		// Check if s2 is a substring of concatenated string
		return concatenated.contains(s2);
	}

	public static void main(String args[]) {

		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println("Is \"" + s2 + "\" a rotation of \"" + s1 + "\"? " + isRotation(s1, s2));
		
		
		String s3 = "hello";
        String s4 = "lohel";
        System.out.println("Is \"" + s4 + "\" a rotation of \"" + s3 + "\"? " + isRotation(s3, s4));

        String s5 = "rotation";
        String s6 = "tationro";
        System.out.println("Is \"" + s6 + "\" a rotation of \"" + s5 + "\"? " + isRotation(s5, s6));

        String s7 = "abc";
        String s8 = "acb";
        System.out.println("Is \"" + s8 + "\" a rotation of \"" + s7 + "\"? " + isRotation(s7, s8));
	}
}
