package test;
import java.util.*;
public class MapHashMap {
	public static void main(String args[]) {
		
		// Map and HashMap
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(10, "Sadakar");
		map.put(20, "Hasini");
		map.put(30, "Raju");
		map.put(null, null);
		map.put(null, "test");
		
		//Display map
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+"="+m.getValue());
		}
	}

}
