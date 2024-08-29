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
 *         Another way to achieve abstraction.
 * 
 *         Completely "abstract class" with empty bodies
 */

// abstract class
abstract class Animal {

	// abstract method -- only declaration, it doesn't have any body
	public abstract void animalSound();

	// regular method i.e., an abstract class can have regular methods
	public void sleep() {
		System.out.println("Animal is sleeping... zzzz");
	}
}

// sub class - Cat
class Cat extends Animal { // Animal is abstract class and is inherited in sub class Cat

	// implementation of abstract method in sub class
	public void animalSound() {
		System.out.println("The cat says: meow");
	}
}

// class to create object for sub class and call to abstract method 
public class AbstractClassAbstractMethod_Main {

	public static void main(String args[]) {
		Cat myCat = new Cat();
		myCat.animalSound(); // calling abstract method
		myCat.sleep(); // calling regular method
	}
}
