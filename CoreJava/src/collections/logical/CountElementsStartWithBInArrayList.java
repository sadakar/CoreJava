package collections.logical;

import java.util.Arrays;
import java.util.*;
public class CountElementsStartWithBInArrayList {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>(Arrays.asList("Apple","Banana","Berry","Banana","Orange"));
		System.out.println(list);
		int count=0;
		for(String s:list) {
			if(s.startsWith("B")){
				count++;
			}
		}
		System.out.println("Element count that starts with B="+count);
	}
}
