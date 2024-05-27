package test;
import java.util.*;
public class ListLinkedList {

	public static void main(String args[]) {
		
		// LinkedList
		List<String> list = new LinkedList<String>();
		list.add("Sadakar");
		list.add("Sadakar");
		list.add("Sadakar");
		list.add("Hasini");
		list.add("Hasini");
		list.add("Raju");
		list.add("");
		list.add(null);
		System.out.println(list);
		
		// Remove duplicates from LinkedList
		Set<String> set = new HashSet<String>();
		for(String i : list) {
			set.add(i);
		}
		System.out.println(set);
	}
}
