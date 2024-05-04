package collections;
import java.util.*;
/**
 * 
 * @author Sadakar.Pochampalli
 *
 * Convert list to Set 
 * Set doesn't allow duplicate values
 */
public class RemoveDuplicatesFromArrayList {

	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,10,1,2,2,3,3,10,3,4,5,5));
		System.out.println(list);
		
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		System.out.println(set);
	}
}
