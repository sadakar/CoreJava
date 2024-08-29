package _crprepration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator The Comparator interface provides a way to order objects. Unlike
 * Comparable, it allows for multiple comparison strategies by creating
 * different implementations of the Comparator interface.
 * 
 * Key Points:
 * 
 * Multiple comparison logics. Can be used to define custom ordering. The
 * compare method returns: A negative integer if the first argument is less than
 * the second. Zero if the first argument is equal to the second. A positive
 * integer if the first argument is greater than the second.
 */
class Person2 {

	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ") ";
	}
}

class AgeComparator implements Comparator<Person2> {

	@Override
	public int compare(Person2 p1, Person2 p2) {
		return Integer.compare(p1.getAge(), p2.getAge());
	}
}

class NameComparator implements Comparator<Person2> {
	@Override
	public int compare(Person2 p1, Person2 p2) {
		return p1.getName().compareTo(p2.getName());
	}
}

public class _006CompratorInterface_Person {

	public static void main(String args[]) {
		List<Person2> people = new ArrayList<>();
		people.add(new Person2("Alice", 30));
		people.add(new Person2("Bob", 25));
		people.add(new Person2("Charlie", 35));

		// Sorting by age
		Collections.sort(people, new AgeComparator());
		System.out.println("Sorted by age:");
		for (Person2 person : people) {
			System.out.println(person);
		}
		
		// Sorting by name
		Collections.sort(people, new NameComparator());
		System.out.println("Sorted by name:");
		for (Person2 person : people) {
			System.out.println(person);
		}
	}
}
