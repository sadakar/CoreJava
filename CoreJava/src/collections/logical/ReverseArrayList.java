package collections.logical;

import java.util.*;

/**
 * 
 * https://www.javatpoint.com/how-to-reverse-arraylist-in-java
 * https://www.geeksforgeeks.org/reverse-an-arraylist-in-java/
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class ReverseArrayList {

	public static void main(String args[]) {

		// list elements
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(list);

		// Reverse list using for loop
		List<Integer> revList = new ArrayList<Integer>();
		for (int i = list.size() - 1; i >= 0; i--) {
			revList.add(list.get(i));
		}
		System.out.println(revList);

		// Using Collections.reverse() method
		Collections.reverse(list);
		System.out.println(list);
	}

}
