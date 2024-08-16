package _crprepration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable The Comparable interface imposes a natural ordering on the objects
 * of each class that implements it. The class itself must implement the
 * Comparable interface and override the compareTo method.
 * 
 * Key Points:
 * 
 * Single comparison logic. Typically used when a natural ordering is needed.
 * The compareTo method returns: A negative integer if this object is less than
 * the specified object. Zero if this object is equal to the specified object. A
 * positive integer if this object is greater than the specified object.
 */
public class _005ComparableInterface_Person implements Comparable<_005ComparableInterface_Person> {

	private String name;
	private int age;

	public _005ComparableInterface_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(_005ComparableInterface_Person other) {
		return Integer.compare(this.age, other.age); // Comparison based on age
	}

	@Override
	public String toString() {
		return name + " (" + age + ") ";
	}

	public static void main(String args[]) {
		List<_005ComparableInterface_Person> people = new ArrayList<>();
		people.add(new _005ComparableInterface_Person("Sadakar", 36));
		people.add(new _005ComparableInterface_Person("Hasini", 25));
		people.add(new _005ComparableInterface_Person("John", 50));

		Collections.sort(people); // Uses Comparable's compareTo method

		for (_005ComparableInterface_Person person : people) {
			System.out.println(person); // ascending order
		}
	}
}
