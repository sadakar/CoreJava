package logical.strings;

public class CheckIfStringIsAPanagram {

	public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(str);
        
        if (isPangram) {
            System.out.println("\"" + str + "\" is a pangram.");
        } else {
            System.out.println("\"" + str + "\" is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        if (str.length() < 26) {
            return false; // A pangram must have at least 26 characters
        }

        boolean[] alphabet = new boolean[26];
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean b : alphabet) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
