package comparable.naturalsorting.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

	private String name;

	private int age;
	
	//Constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// Implement the compareTo method
	
	@Override
	public int compareTo(Student other) {
		
		// Compare based on age
		if(this.age<other.age) {
			return -1;
		} else if (this.age > other.age) {
			return 1;
		} else { return 0;}
	}
	
	// Overrride toString for easy printing 
	@Override
	public String toString() {
		return "Student { name='"+ name + "', age="+age+'}';
	}

}
