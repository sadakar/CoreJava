package collections;

import java.util.*;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         What is List ? List is an ordered collection of elements.
 * 
 *         What is ArrayList ? The ArrayList class is a resizable array, which
 *         can be found in the java.util package.
 * 
 *         https://www.w3schools.com/java/java_arraylist.asp
 * 
 *         What is the difference between Array and ArrayList ? The difference
 *         between a built-in array and an ArrayList in Java, is that the size
 *         of an array cannot be modified (if you want to add or remove elements
 *         to/from an array, you have to create a new one). While elements can
 *         be added and removed from an ArrayList whenever you want.
 * 
 *         Example-1: {10,50,60,3,1,10,null}
 * 
 *         Example-2: {"Sadakar","Hasini","Raju","Souji"}
 * 
 *         List can have duplicate values
 * 
 *         List can have null values
 * 
 *         List index starts from 0-- same as arrays index
 */

public class List_ArrayList {

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
		
		Iterator itr = list.iterator(); //Iterator 
		
		while (itr.hasNext()) {
			System.out.print(" " + itr.next());
		}

		System.out.println("\n List elements foreach loop");
		// Iterating through for each loop
		for (Integer l : list) {
			System.out.print(" " + l);
		}
		System.out.println("\n List elements regular for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" " + list.get(i)); // Use get method with index to get the values.
		}
	}

}
