package collections.map.hashmap.treemap;

import java.util.*;

/**
 * Write a code to sort a HashMap by its keys.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class SortHashMapUsingKeys {

	public static void main(String args[]) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(40, "Banana");
		hashMap.put(1, "Apple");
		hashMap.put(31, "Orange");
		hashMap.put(2, "Grapes");
		hashMap.put(10, "Watermelon");
		// Iterating through hasmap and displaying them
		System.out.println("Hash Map Elements\n");
		for (Map.Entry<Integer, String> map : hashMap.entrySet()) {
			System.out.println(map.getKey() + "=" + map.getValue());
		}

		// HashMap doesn't display elements in the order so convert HashMap into TreeMap
		// TreeMap auto sorts the elements into ascending order.
		System.out.println("Hash Map Elements\n");
		TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
		for (Map.Entry<Integer, String> map : treeMap.entrySet()) {
			System.out.println(map.getKey() + "=" + map.getValue());
		}

	}
}
