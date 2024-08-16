package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * In Java, the Comparator interface is used to define a custom order for
 * objects that do not have a natural ordering, or when you want to sort objects
 * in a way different from their natural order. The Comparator interface has a
 * single method, compare, which takes two objects and returns an integer to
 * determine their order.
 */
public class Main {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		// Sorting using AgeComparator
		Collections.sort(people, new AgeComparator());

		// Print sorted list
		for (Person person : people) {
			System.out.println(person);
		}
	}
}
