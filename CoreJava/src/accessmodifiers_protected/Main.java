package accessmodifiers_protected;

import accessmodifiers_protected_subclassinanotherpackage.Bird;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         the protected access modifier allows a member (field or method) to be
 *         accessed within its own package or by subclasses in any package.
 *
 */
// Class to create object for sub class and to access protected members of super class by creating object for sub class
public class Main {

	public static void main(String args[]) {

		// Creating object for Bird sub class
		Bird myBird = new Bird("Robin", "Red");

		// Accessing protected members from the sub class Bird
		myBird.eat();
		myBird.displayInfo();
		myBird.makeSound();
	}
}
