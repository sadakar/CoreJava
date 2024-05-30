package test;
import java.util.*;
public class DuplicatesInList {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,40,20));
		System.out.println(list);
		
		Set<Integer> set =new HashSet<>(list);
		System.out.println(set);
		
		List<Integer> duplicates = new ArrayList<Integer>();
		for(Integer i : list) {
			if(!set.add(i)) {
				duplicates.add(i);
			}
			
		}
		System.out.println(set);
	}

}
