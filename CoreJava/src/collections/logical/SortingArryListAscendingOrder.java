package collections.logical;

import java.util.*;

/**
 * https://www.javatpoint.com/how-to-sort-arraylist-in-java
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class SortingArryListAscendingOrder {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,2,1,15,3,12));
		System.out.println("Given List="+list);
		
		Collections.sort(list);
		System.out.println("Ascending Order="+list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Descending Order="+list);
	}
}
