package collections;

import java.util.*;

/**
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
 *         HashSet:
 * 
 *         Implemented using a hash table data structure. Offers constant-time
 *         performance for basic operations (add, remove, contains), assuming a
 *         good hash function and proper load factor. Does not maintain any
 *         order of elements.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class Set_HashSet {

	public static void main(String args[]) {
		
		// Set and HashSet
		Set<String> set = new HashSet<String>();
		set.add("Sadakar");
		set.add("Sadakar");
		set.add("Hasini");
		set.add("Raju");
		System.out.println(set);
		
		// Iterating through Set
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
