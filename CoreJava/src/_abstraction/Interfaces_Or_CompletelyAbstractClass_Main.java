package _abstraction;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         Hiding certain details and showing only essential information to the
 *         user is called abstraction.
 * 
 *         Implementation is done in two ways : Abstract classes, Interfaces
 * 
 *         Abstract class:
 * 
 *         Can not be used to create objects and an abstract class must be
 *         inherited from another class.
 * 
 *         An abstract class can have abstract method and regular methods.
 * 
 *         Abstract method:
 * 
 *         declared with out an implementation in an abstract class.
 * 
 *         Interfaces:
 * 
 *         * keyword: implements
 * 
 *         Another way to achieve abstraction.
 * 
 *         Completely "abstract class" with empty bodies i.e., method does not
 *         have a body
 */
// interface  -- like a super class but not called as class rather called as interface. 
interface Animal4 {

	public void animalSound(); // interface method that does not have any body

	public void sleep();// interface method that does not have any body
}

// sub class that  "implements" interface
class Pig implements Animal4 {

	// body for interface method : animalSound()
	public void animalSound() {
		System.out.println("The pig says : wee.. wee..");
	}

	// body for interface method: sleep()
	public void sleep() {
		System.out.println("Pig is sleeping.. zzzzz");
	}
}

// class to create object for sub class and call interface methods
public class Interfaces_Or_CompletelyAbstractClass_Main {

	public static void main(String args[]) {
		Pig myPig = new Pig();
		myPig.animalSound(); // Calling interface method : animalSound()
		myPig.sleep(); // Calling interface method : sleep()
	}
}
