package _crprepration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _016SortHashSet {

	public static void main(String args[]) {
		
		Set<String> hashSet = new HashSet<>(Arrays.asList("Apple","Banana","Orange","Apple"));
		
		// Set doesn't maintain any order 
		System.out.println(hashSet);
		
		// Convert set to list
		List<String> list = new ArrayList<>(hashSet);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
