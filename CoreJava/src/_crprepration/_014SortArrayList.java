package _crprepration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _014SortArrayList {

	public static void main(String args[]) {
		List<String> arryList = new ArrayList<>(Arrays.asList("Hasini","Sadakar","Jhon"));
		
		// ascending order
		Collections.sort(arryList);
		
		for(String s : arryList) {
			System.out.println(s);
		}
		System.out.println("\n");
		// descending order
		Collections.reverse(arryList);
		for(String s: arryList) {
			System.out.println(s);
		}
	}
}
