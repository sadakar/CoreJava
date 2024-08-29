package _crprepration;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _015SortLinkedList {

	public static void main(String args[]) {

		List<String> linkedList = new LinkedList<>(Arrays.asList("Hasini", "Sadakar", "John"));

		// ascending order
		Collections.sort(linkedList);
		for (String s : linkedList) {
			System.out.println(s);
		}

		System.out.println("\n");
		// descending order
		Collections.reverse(linkedList);
		for (String s : linkedList) {
			System.out.println(s);
		}
	}
}
