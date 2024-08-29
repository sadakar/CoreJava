package collections;

import java.util.*;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         * Difference between HashMap and TreeMap ?
 *         https://www.javatpoint.com/difference-between-hashmap-and-treemap
 * 
 *         HashMap: Implements the Map interface based on a hash table. Allows
 *         null keys and values. Provides constant-time performance for basic
 *         operations (get and put). Does not maintain any order of keys.
 * 
 * 
 *         TreeMap: Implements the Map interface based on a Red-Black tree. Does
 *         not allow null keys (throws NullPointerException). Provides log(n)
 *         time cost for get, put, and other operations. Maintains a sorted
 *         order of keys, according to their natural ordering or by a specified
 *         comparator.
 * 
 *         TM provides an efficient means of storing key value pairs in sorted
 *         order. contains values based on key. Contains only unique elements.
 *         TM can not have a null key but can have multiple null values. Non
 *         synchronized. Maintains ascending order.
 *
 */
public class Map_TreeMap {

	public static void main(String args[]) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		System.out.println(map);
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
