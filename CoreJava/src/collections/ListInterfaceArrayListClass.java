package collections;

import java.util.*;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         What is List ? List is an ordered collection of elements.
 * 
 *         Example-1: {10,50,60,3,1}
 * 
 *         Example-2: {"Sadakar","Hasini","Raju","Souji"}
 * 
 *         List can have duplicate values
 * 
 *         List can have null values
 *         
 *         List index starts from -- same as arrays index
 */

public class ListInterfaceArrayListClass {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<Integer>(); // List is interface and this interface is being implemented by
														// ArrayList class

		// Add integer objects to the list
		list.add(10);
		list.add(30);
		list.add(3);
		list.add(3); // 3 duplicate value
		list.add(null); // list can store null values -- but can not be like add()

		// Printing the list
		System.out.println("Just print the list");
		System.out.println(list);
		
		// Traversing list through iterator and while loop
		System.out.println("List elements -- Iterator and while loop");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(" " + itr.next());
		}

		System.out.println("\n List elements foreach loop");
		// Iterating through for each loop
		for(Integer l : list) {
			System.out.print(" "+l);
		}
		System.out.println("\n List elements regular for loop");
		for(int i=0;i<list.size();i++) {
			System.out.print(" "+list.get(i)); // Use get method with index to get the values. 
		}
	}

}
