package collections;

import java.util.*;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         List is an ordered collection of elements.
 * 
 *         How the LinkedList works? The LinkedList stores its items in
 *         "containers." The list has a link to the first container and each
 *         container has a link to the next container in the list. To add an
 *         element to the list, the element is placed into a new container and
 *         that container is linked to one of the other containers in the list.
 * 
 *         LinkedList can have duplicate values LinkedList can have null values
 * 
 *         How the ArrayList works? The ArrayList class has a regular array
 *         inside it. When an element is added, it is placed into the array. If
 *         the array is not big enough, a new, larger array is created to
 *         replace the old one and the old one is removed.
 * 
 * 
 * 
 *         When To Use Use an ArrayList and When to use LinkedList? for storing
 *         and accessing data use ArrayList, and LinkedList to manipulate data.
 *
 */
public class List_LinkedList {

	public static void main(String args[]) {

		List<String> list = new LinkedList<String>();

		list.add("Sadakar");
		list.add("Sadakar");
		list.add("Amar");
		list.add("Chetan");
		list.add("Bunny");
		list.add(null);

		// Display list with out iterator
		System.out.print("List elements \n" + list);

		// Display list with iterator
		System.out.println("\n List elements using Iterator");
		Iterator itr = list.iterator(); // Iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Display List-LinkedList elements through foreach loop
		System.out.println("\n List elements using foreach loop");
		for (String s : list) {
			System.out.println(s);
		}

		// Display List-LinkedList elements through regular for loop
		System.out.println("\n List elements using regular for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
