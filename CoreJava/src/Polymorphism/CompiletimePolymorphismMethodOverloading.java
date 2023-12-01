package Polymorphism;

/**
 * Polymorphism: Ability of a method to operate on different types or classes.
 * Same methodwith multiple implementations.
 * 
 * Compile time polymorphism (Method overloading):
 * 
 * A class can have multiple methods with the same name but different parameters
 * list.
 * 
 * During compile time appropriate method is called based on number and types of
 * arguments passed to the method.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class CompiletimePolymorphismMethodOverloading {

	// same method with 1 parameter
	public void display(int num) {
		System.out.println("Same method with int parameter=" + num);
	}

	// same method with 2 parameters of int type
	public void display(int num1, int num2) {
		System.out.println("Same method with two int parameters=" + num1 + " " + num2);
	}

	// same method with 1 parameter of String type
	public void display(String message) {
		System.out.println("Same method with String parameter=" + message);
	}

	public static void main(String args[]) {

		// Creating object for the class
		CompiletimePolymorphismMethodOverloading mo = new CompiletimePolymorphismMethodOverloading();

		// Calling method with 1 parameter
		mo.display(10);

		// Calling method with 2 parameters
		mo.display(30, 50);

		// Calling method with 1 parameter of String type
		mo.display("Hello! This is Sadakar");
	}
}
