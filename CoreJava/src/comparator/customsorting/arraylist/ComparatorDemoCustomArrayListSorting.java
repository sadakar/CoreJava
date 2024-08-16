package comparator.customsorting.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *  Sort based on 2nd digit of each number
 */
/**
 * In Java, the Comparator interface is used to define a custom order for
 * objects that do not have a natural ordering, or when you want to sort objects
 * in a way different from their natural order. The Comparator interface has a
 * single method, compare, which takes two objects and returns an integer to
 * determine their order.
 */
public class ComparatorDemoCustomArrayListSorting {

	public static void main(String args[]) {

		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer i, Integer j) {
				if (i % 10 > j % 10)
					return 1;
				else
					return -1;
			}
		};

		List<Integer> nums = new ArrayList<>();
		nums.add(43);
		nums.add(1);
		nums.add(72);
		nums.add(29);

		// natural sorting technique with sort method of Collections class
		Collections.sort(nums);
		System.out.println(nums);

		Collections.sort(nums, com);
		System.out.println(nums);
	}
}
