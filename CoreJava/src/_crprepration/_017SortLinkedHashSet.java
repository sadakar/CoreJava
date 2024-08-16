package _crprepration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _017SortLinkedHashSet {

	public static void main(String args[]) {
		
		Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Apple","Orange","Orange","Banana"));
		
		// Set doesn't maintain any order 
		System.out.println(linkedHashSet);
		
		// Convert set to list
		List<String> list = new ArrayList<>(linkedHashSet);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
