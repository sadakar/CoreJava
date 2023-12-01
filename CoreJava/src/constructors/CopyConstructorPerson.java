package constructors;

/**
 * Copy constructor : A constructor that creates a new object by copying the
 * attributes of an exiting object of same type.
 * 
 * Copy constructor takes an object of the same class as a parameter and
 * initializes the new object with the values from exiting object.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class CopyConstructorPerson {

	// instance variables
	private String name;
	private int age;

	// Parameterized constructor
	public CopyConstructorPerson(String name, int age) {
		this.name = name; // this is a keyword that refers to the current instance of the class. It is
							// often used to differentiate instance variables from local variables when they
							// have the same name.
		this.age = age;
	}

	// Copy constructor
	public CopyConstructorPerson(CopyConstructorPerson originalPerson) {
		this.name = originalPerson.name;
		this.age = originalPerson.age;
	}

	// Getter methods -- as the instance variables are declared as private we can
	// not directly access them, have to use getter methods.
	// get name instance variable
	public String getName() {
		return name;
	}

	// get age instance variable
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		// Creating object for copy constructor
		CopyConstructorPerson p1 = new CopyConstructorPerson("Sadakar", 35);

		// Copy constructor : Creating a new object p2 using the copy of existing object
		// p1
		CopyConstructorPerson p2 = new CopyConstructorPerson(p1);

		// Display values from parameterized constructor and copy constructor
		System.out.println("Person1: Name=" + p1.getName() + " " + "Age=" + p1.getAge());
		System.out.println("Person2(Copy of Person1): Name=" + p2.getName() + " " + "Age=" + p2.getAge());
	}
}
