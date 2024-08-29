package collections.map.hashmap.treemap;

import java.util.*;

public class SynchronizeHashMap {

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
	}
}
