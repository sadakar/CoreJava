package test;

public class CountWordsInAString {

	public static void main(String args[]) {
		String str ="Count number of words in a string";
		
		String[] words = str.split("\s");
		System.out.println(words.length);
	}
}
