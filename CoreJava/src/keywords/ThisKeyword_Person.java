package keywords;

/**
 * this is a keyword that refers to the current instance of the class. It is
 * often used to differentiate instance variables from local variables when they
 * have the same name.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class ThisKeyword_Person {

	// instance varialbes
	String name;
	int age;
	float salary;

	// Parameterized constructor
	public ThisKeyword_Person(String name, int age, float salary) { // local variables
		this.name = name; // this.name is the instance variable whereas name is the local variable of
							// constructor
		this.age = age;
		this.salary = salary;
	}

	public static void main(String args[]) {
		ThisKeyword_Person p = new ThisKeyword_Person("Sadakar", 35, 10000);
		System.out.println("Person Details: Name=" + p.name + " " + "Age=" + p.age + " " + "Salary= " + p.salary);
	}
}
