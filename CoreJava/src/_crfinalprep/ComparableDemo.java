package _crfinalprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {

	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Person other) {
		return Integer.compare(this.age, other.age); // Comparision based on age
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}

public class ComparableDemo {
	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person(35,"Sadakar"));
		people.add(new Person(34,"Hasini"));
		people.add(new Person(30,"Ram"));
		
		Collections.sort(people);

		for(Person person : people) {
			System.out.println(person);
		}
		
	}
}
