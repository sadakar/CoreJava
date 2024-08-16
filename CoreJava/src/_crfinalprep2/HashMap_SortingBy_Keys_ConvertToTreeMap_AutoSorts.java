package _crfinalprep2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_SortingBy_Keys_ConvertToTreeMap_AutoSorts {

	
	public static void main(String[] args) {
		
		
		// HasMap 
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Hasini", 35);
		hashMap.put("Sadakar", 36);
		hashMap.put("Robert", 30);
		hashMap.put("Jenni", 15);
		
		// Before sorting
		System.out.println("Before sorting:");
		for(Map.Entry<String, Integer> m : hashMap.entrySet()) {
			System.out.println(m.getKey()+","+ m.getValue());
		}
		System.out.println();
		
		// Sorting by keys -- convert HasMap to TreeMap , treemap auto sorts
		// ascending order by keys
		System.out.println("Sorting by keys: -- Default is ascending order");
		Map<String,Integer> treeMap = new TreeMap<>(hashMap);
		for(Map.Entry<String, Integer> m : treeMap.entrySet()) {
			System.out.println(m.getKey()+","+ m.getValue());
		}
		
		System.out.println();
		System.out.println("Sorting by keys: -- descending order");
		Map<String, Integer> treeMap2 = new TreeMap<>(Collections.reverseOrder()); // here use Collections.reverseOrder()
		treeMap2.putAll(hashMap);
		for(Map.Entry<String, Integer> m : treeMap2.entrySet()) {
			System.out.println(m.getKey()+","+ m.getValue());
		}
		
		
		
		
	}
}
