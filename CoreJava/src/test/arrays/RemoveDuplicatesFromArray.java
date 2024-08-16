package test.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String args[]) {
		int a[]= {1,6,2,1,8,3,1};
		
		Set<Integer> set = new HashSet<>();
		for(int i : a) {
			set.add(i);
		}
		System.out.println(set);
	}
}
