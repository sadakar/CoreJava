package logical.strings;
import java.util.*;
public class InsertUnderScoreBtwLowerAndUpperLetterOfString {
	
	public static void main(String args[]) {
		String str = "ThisIsATestStringWithUppercaseLetters";
		String strWithUnderScore = str.replaceAll("([a-z])([A-Z])", "$1_$2");
		System.out.println("Orginal String="+str);
		System.out.println("String with added underscore="+strWithUnderScore);
	}

}
