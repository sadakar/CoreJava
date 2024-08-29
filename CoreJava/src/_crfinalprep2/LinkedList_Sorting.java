package _crfinalprep2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Sorting {

	public static void main(String[] args) {

		// Linked List
		List<Integer> list = new LinkedList<Integer>();
		list.add(8);
		list.add(80);
		list.add(18);
		list.add(88);
		list.add(812);

		// Before sorting
		System.out.println("Before sorting: " + list);

		// After sorting -- default -- ascending order
		Collections.sort(list);
		System.out.println("After sorting: -- default is ascending order" + list);

		// After sorting -- default -- descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After sorting: -- descending order" + list);

		// Getting second highest
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(list.get(2));
			break;
		}
	}

}
