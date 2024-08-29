package comparable.naturalsorting.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java Comparable interface is used to order the objects of the user-defined
 * class. This interface is found in java.lang package and contains only one
 * method named compareTo(Object). It provides a single sorting sequence only,
 * i.e., you can sort the elements on the basis of single data member only. For
 * example, it may be rollno, name, age or anything else.
 * 
 * compareTo(Object obj) method public int compareTo(Object obj): It is used to
 * compare the current object with the specified object. It returns
 * 
 * positive integer, if the current object is greater than the specified object.
 * negative integer, if the current object is less than the specified object.
 * zero, if the current object is equal to the specified object.
 */
public class Main {

	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Sadakar",30));
		students.add(new Student("Hasini",25));
		students.add(new Student("Ram",35));
		
		// Sorting using the natural order defined by Comparable
		Collections.sort(students);
		
		// Print the sorted list
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
