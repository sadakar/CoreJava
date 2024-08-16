package _crfinalprep2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Person class to store objects
class Person2 {

	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

}

// Comparator -- by age.
class AgeComparator implements Comparator<Person2> {

	@Override
	public int compare(Person2 o1, Person2 o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}

// Main class
public class ComparatorDemo {

	public static void main(String[] args) {
		List<Person2> person2 = new ArrayList<>();
		person2.add(new Person2("Sadakar", 36));
		person2.add(new Person2("Hasini", 32));
		person2.add(new Person2("Ram", 45));

		// ascending order
		System.out.println("Ascending order");
		Collections.sort(person2, new AgeComparator());
		for (Person2 p : person2) {
			System.out.println(p);
		}

		// Descending order
		System.out.println("Descending order");
		Collections.sort(person2, Collections.reverseOrder(new AgeComparator()));
		for (Person2 p : person2) {
			System.out.println(p);
		}
	}
}
