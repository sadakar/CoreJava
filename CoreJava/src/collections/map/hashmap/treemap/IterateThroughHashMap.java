package collections.map.hashmap.treemap;

import java.util.*;

/**
 * How would you iterate over a HashMap in Java?
 * Using for each loop, Map.Entry<Integer,String> interface with entrySet() method.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class IterateThroughHashMap {

	public static void main(String args[]) {
		
		
		HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
		hashMap.put(1, "Banana");
		hashMap.put(2, "Apple");
		hashMap.put(3, "Orange");
		hashMap.put(4, "Grapes");
		
		
		//Iterating through hasmap
		for(Map.Entry<Integer,String> map : hashMap.entrySet()) {
			System.out.println(map.getKey()+"="+map.getValue());
		}
		
	}
}
