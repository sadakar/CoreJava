package collections;
import java.util.*;
/**
 * 
 * @author Sadakar.Pochampalli
 * 
 * TM provides an efficient means of storing key value pairs in sorted order. 
 * contains values based on key. 
 * Contains only unique elements. 
 * TM can not have a null key but can have multiple null values. 
 * Non synchronized. 
 * Maintains ascending order. 
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
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
