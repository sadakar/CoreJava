package _crfinalprep2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class should implement Comparable interface
class Person implements Comparable<Person> {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Override compareTo method
	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

}

public class ComparableDemo {

	public static void main(String[] args) {

		List<Person> person = new ArrayList<>();
		person.add(new Person("Sadakar", 36));
		person.add(new Person("Hasini", 35));
		person.add(new Person("Raj", 29));

		// Display data in ascending order
		System.out.println("Ascending by age");
		Collections.sort(person); // Uses Comparable's compareTo method
		for (Person p : person) {
			System.out.println(p);
		}
		
		System.out.println();
		// Display data in descending order
		System.out.println("Descending by age");
		Collections.sort(person, Collections.reverseOrder());
		for (Person p : person) {
			System.out.println(p);
		}
	}
}
