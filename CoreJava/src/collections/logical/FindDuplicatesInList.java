package collections.logical;
import java.util.*;
/**
 * Finding Duplicates Using Collections
 * https://www.baeldung.com/java-list-find-duplicates
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class FindDuplicatesInList {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,10,40,20));
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicates = new ArrayList<>();
		
		for(Integer i: list) {
			if(!set.add(i)) {
				duplicates.add(i);
			}
		}
		System.out.println("Set:"+set);
		System.out.println("Duplicates:"+duplicates);
	}

}
