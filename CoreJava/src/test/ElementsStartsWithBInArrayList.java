package test;
import java.util.*;
public class ElementsStartsWithBInArrayList {
	
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("Banana","Apple","Berry","Cherry","Besties"));
		int count=0;
		for(String str: list) {
			if(str.startsWith("B")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
