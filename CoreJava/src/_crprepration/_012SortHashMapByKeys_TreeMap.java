package _crprepration;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _012SortHashMapByKeys_TreeMap {

	public static void main(String args[]) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("John", 25);
		hashMap.put("Alice", 30);
		hashMap.put("Bob", 20);
		
		// TreeMap to sort the map by keys
		TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);
		
		// Printing the sorted map
		for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}
