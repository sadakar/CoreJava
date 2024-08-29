package _crfinalprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person8 {
	int age;
	String name;

	public Person8(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person8 [age=" + age + ", name=" + name + "]";
	}
}

class AgeComparator8 implements Comparator<Person8> {

	@Override
	public int compare(Person8 p1, Person8 p2) {

		return Integer.compare(p1.getAge(), p2.getAge());
	}
}

class NameComparator8 implements Comparator<Person8> {

	@Override
	public int compare(Person8 p1, Person8 p2) {

		return p1.getName().compareTo(p2.getName());
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Person8> person8 = new ArrayList<>();
		person8.add(new Person8(35, "Sadakar"));
		person8.add(new Person8(36, "Hasini"));
		person8.add(new Person8(32, "Gopal"));

		Collections.sort(person8, new AgeComparator8());

		for (Person8 person : person8) {
			System.out.println(person);
		}

		System.out.println();
		Collections.sort(person8, new NameComparator8());

		for (Person8 person : person8) {
			System.out.println(person);
		}
	}
}
