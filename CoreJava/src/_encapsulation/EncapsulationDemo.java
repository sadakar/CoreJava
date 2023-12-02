package _encapsulation;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         Bundling of data(attributes)/instance variables and methods(or
 *         functions) into a single unit.
 * 
 *         Data hiding : declare data member as private
 * 
 *         Accessor methods(getter methods), Mutator methods(setter methods)
 */
// Student class 
class Student {

	// data members
	private String name; // hiding the data with private access modifier/specifier

	// Set the data for the hidden data members using Mutator methods (seter
	// methods)

	public void setName(String name) { // setter method
		this.name = name;
	}

	public String getName() { // getter method, it would mostly have return type
		return name;
	}
}

// Class to create object for Student class
class EncapsulationDemo {

	public static void main(String args[]) {

		Student s = new Student(); // Creating object for the Student class with s as reference variable

		// Setting name
		s.setName("Sadakar");

		// Get name and print
		System.out.println("Name:" + s.getName());
	}
}
