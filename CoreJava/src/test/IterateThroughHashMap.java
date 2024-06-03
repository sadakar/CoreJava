package test;
import java.util.*;
public class IterateThroughHashMap {
	
	public static void main(String args[]) {
		
		// Map with HashMap
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(10, "Sadakar");
		map.put(2, "Hasini");
		map.put(4, "Souji");
		
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// Sort HashMap
		
		Map<Integer, String> tmap = new TreeMap<Integer,String>(map);
		for(Map.Entry<Integer, String> t : tmap.entrySet()) {
			System.out.println(t.getKey()+" "+t.getValue());
		}
	}

}
