package _crfinalprep2;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_SortingBy_Values_ConvertToList_UseComparatorOnValues {

	public static void main(String[] args) {

		// HasMap
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Hasini", 35);
		hashMap.put("Sadakar", 36);
		hashMap.put("Robert", 30);
		hashMap.put("Jenni", 15);

		// Before sorting
		System.out.println("Before sorting:");
		for (Map.Entry<String, Integer> m : hashMap.entrySet()) {
			System.out.println(m.getKey() + "," + m.getValue());
		}
		System.out.println();

		// Sorting by values -- Coverting HasMap to List
		List<Map.Entry<String, Integer>> list = new LinkedList<>(hashMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		
		// Store sorted map by values in another map 
		Map<String, Integer> sortedMapByValues = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry : list) {
			sortedMapByValues.put(entry.getKey(), entry.getValue());
		}
		
		// Print the sorted sorted map
		System.out.println("After sorting by values: -- default is ascending order");
		for (Map.Entry<String, Integer> m : sortedMapByValues.entrySet()) {
			System.out.println(m.getKey() + "," + m.getValue());
		}

	}
}
