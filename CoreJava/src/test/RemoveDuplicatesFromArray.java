package test;
import java.util.*;
public class RemoveDuplicatesFromArray {
	
	public static void main(String args[]) {
		int array[] = {10,20,10,40,20,50,60};
		for(int i : array) {
			System.out.println(i);
		}
		
		Set<Integer> set = new HashSet<>();
		for(int num : array) {
			set.add(num);
		}
		System.out.println(set);
	}

}
