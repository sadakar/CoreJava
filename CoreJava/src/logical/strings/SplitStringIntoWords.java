package logical.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitStringIntoWords {

	public static void main(String args[]) {

		// \w can be used to match word characters ([A-Za-z0-9_]), so that punctuation
		// is removed from the results:
		
		String s = "I want to walk my dog, and why not?";
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		// Use split() method
		System.out.println("\n");
		String s2 = "I want to walk my dog";
		String[] arr = s2.split(" ");

		for (String ss : arr) {
			System.out.println(ss);
		}
	}

}
