package collections;

import java.util.*;

/**
 * List is an interface that represents an ordered collection of elements where
 * each element has an index. Child interface of Collection interface. Null can
 * be stored, Allows duplicates elements.
 * 
 * Implementation classes : ArrayList, LinkedList, Stack and etc.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class ListInterfaceArrayListClass {

	public static void main(String args[]) {

		// Creating object for List Interface
		// new ArrayList<Integer>() is the object
		List<Integer> l1 = new ArrayList<Integer>();

		// Adding elements for List interface with indexes
		l1.add(0, 1);
		l1.add(1, 2);
		l1.add(2, 3);

		System.out.println("list l1 =" + l1);

		// Adding elements for existing list with integers
		l1.add(6);
		l1.add(7);
		l1.add(8);
		System.out.println("Updated list l1=" + l1);

		// Iterating through List elements using for-each loop (enhanced for loop)
		/**
		 * The loop variable listvalues takes on each value in the List interface in
		 * turn. The enhanced for-each loop is particularly useful when you don't need
		 * the index and just want to iterate over the elements of a collection.
		 */
		for (Integer listvalues : l1) {
			System.out.println(listvalues);
		}

		// Iterating through List elements using traditional for loop
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

	}
}
