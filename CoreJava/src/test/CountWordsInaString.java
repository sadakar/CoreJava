package test;
import java.util.*;
public class CountWordsInaString {
	public static void main(String args[]) {
		String str ="Hello, this is Sadakar Pochampalli";
		str.trim();
		
		if(str.trim().isEmpty()) {
			System.out.println("Empty String");
		}else {
			String[] words = str.trim().split("\\s");
			int count = words.length;
			System.out.println("Words in string="+count);
		}
	}

}
