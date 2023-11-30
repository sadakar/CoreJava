package collections;
import java.util.*;
public class MapInterfaceHasMapClass {

	public static void main(String args[]) {
		
		// Map interface with map as reference variable
		// new HashMap<Integer, String>() is the object created for Map interface
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Adding elements to the map
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		
		// Printing Map elements using for-each loop
		for(Map.Entry<Integer, String> m : map.entrySet()) { 
			//m is the loop variable, entrySet is the method of Set Inteface.
			// We can not direct traverse through Map eleemnts so convert it to Set interface, in this case entrySet() is belongs to Set interface
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
