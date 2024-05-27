package test;
import java.util.*;
public class CountACharactersInaString {

	public static void main(String args[]) {
		String str ="Sadakar Pochampalli";
		char ch ='a';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}
}
