package collections;

import java.util.*;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         HasMap is a class that implements Map interface. Allows to store key
 *         and value pair where key should be unique.
 * 
 *         HashMap<K,V> where K-Key and V-Value
 * 
 *         HasMap contains values based on the Key.
 * 
 *         Contains unique keys.
 * 
 *         May have one null key and multiple null values
 * 
 *         No synchronized
 * 
 *         Maintains no order default capacity is 16 with a load factor of 0.75
 *
 */
public class HashMapExample {

	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Apple");
		map.put(12, "Orange");
		map.put(null, "Banana"); // element with null key
		map.put(3, "Jack fruite");
		map.put(4, null);

		System.out.println(map);

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
