package test;

import java.util.*;
public class ListArrayList {

	public static void main(String args[]) {
		
		// ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(3);
		//list.add(null);
		System.out.println(list);
		
		// Remove duplicates from ArrayList
		Set<Integer> set = new HashSet<Integer>();
		for(int i : list) {
			set.add(i);
		}
		System.out.println(set);
	}
}
