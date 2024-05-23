package collections;

import java.util.*;

/**
 * * @author Sadakar.Pochampalli
 *
 * Map and HashMap are fundamental components of the Java Collections Framework
 * used to store key-value pairs. They allow you to associate a value with a
 * unique key and efficiently retrieve the value using the key. Here's a
 * breakdown of each:
 * 
 * Map:
 * 
 * Map is an interface in the Java Collections Framework that represents a
 * collection of key-value pairs. It does not extend the Collection interface
 * but provides methods to manipulate key-value mappings. Each key in a Map must
 * be unique, and each key can map to at most one value. Common methods provided
 * by the Map interface include put(key, value), get(key), containsKey(key),
 * containsValue(value), remove(key), keySet(), values(), and entrySet().
 * HashMap:
 * 
 * HashMap is a concrete implementation of the Map interface. It uses a hash
 * table data structure to store key-value pairs. Provides constant-time
 * performance for basic operations like put() and get() on average, assuming a
 * good hash function and proper load factor. Does not maintain any order of
 * key-value pairs. Allows null as both keys and values (except for the special
 * case where the key is null, as there can be only one null key in a HashMap).
 */
public class Map_HashMap {

	public static void main(String args[]) {

		// Map interface with map as reference variable
		// new HashMap<Integer, String>() is the object created for Map interface
		Map<Integer, String> map = new HashMap<Integer, String>();

		// Adding elements to the map
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		System.out.println(map);
		// Printing Map elements using for-each loop
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			// m is the loop variable, entrySet is the method of Set Inteface.
			// We can not directly traverse through Map elements so convert it to Set
			// interface, in this case entrySet() is belongs to Set interface
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
