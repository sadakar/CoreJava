package test;
import java.util.*;
public class DuplicatesInList {

	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,10,30,40,20,50,4,4));
		
		Set<Integer> set = new HashSet<Integer>();
		
		List<Integer> duplicates= new ArrayList<Integer>();
		
		for(Integer num: list) {
			
			if(!set.add(num)) {
				duplicates.add(num);
			}
		}
		System.out.println("Set="+set);
		System.out.println("Duplicates="+duplicates);
	}
}
