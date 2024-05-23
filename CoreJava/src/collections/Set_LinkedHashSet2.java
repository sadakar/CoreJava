package collections;

import java.util.*;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         a Set is an interface in the Java Collections Framework that
 *         represents a collection of unique elements. Unlike a List, which
 *         allows duplicate elements, a Set does not allow duplicates.
 *         Additionally, the elements in a Set are not ordered, meaning there's
 *         no guarantee about the order in which the elements are stored.
 * 
 *         The Set interface provides methods for adding, removing, and checking
 *         the presence of elements, as well as methods for performing set
 *         operations like union, intersection, and difference.
 * 
 *         Some common implementations of the Set interface in Java include:
 * 
 *         LinkedHashSet:
 * 
 *         Extends HashSet to maintain insertion order of elements. Implemented
 *         as a hash table with a linked list running through it, so it provides
 *         the efficiency of a hash table along with the predictability of
 *         iteration order.
 */
public class Set_LinkedHashSet2 {

	public static void main(String args[]) {

		// Set and HashSet
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(30);

		// Display set elements
		System.out.println(set);
		
		// Iterate through set elements using for each loop
		for (int i : set) {
			System.out.println(i);
		}
		
		// Set of Strings
		Set<String> set2 = new HashSet<String>();
		set2.add("Sadakar");
		set2.add("Hasini");
		set2.add("Sadakar");
		set2.add("Sadakar");
		System.out.println(set2);

	}
}
