package _crfinalprep2;

/**
 * Abstract class demo 
 */
// abstract class
abstract class Animal {

	String name; // variable in abstract class 

	// abstract method
	public abstract void makeSound();

	// Constructor
	public Animal(String name) {
		this.name = name;
	}

	// Concrete method
	public void sleep() {
		System.out.println("Animal is sleeping");
	}

}
// Derived/Sub class
class Dog extends Animal {

	// calling super class constructor in sub class
	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Dog is barking");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		Dog d = new Dog("Johney"); // Creating object for sub class 
		d.makeSound(); // Calling abstract method
		d.sleep(); // calling concreate method of abstract class
	}
}
