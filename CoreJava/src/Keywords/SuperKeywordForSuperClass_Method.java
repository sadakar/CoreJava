package Keywords;

/**
 * super keyword is used to refer to the immediate parent class object
 * 
 * To invoke parent class methods
 * 
 * To access parent class fields
 * 
 * To call the parent class constructor
 * 
 * @author Sadakar.Pochampalli
 *
 */
// Super class -- Animal 
class Animal {

	void makeSound() {
		System.out.println("Some animal sound");
	}
}

// Sub class -- Cat
class Cat extends Animal {
	void makeSound() {
		super.makeSound(); // Invoking the makeSound() method of super class
		System.out.println("Cat meows");
	}
}

// class to create object and access methods
public class SuperKeywordForSuperClass_Method {
	public static void main(String args[]) {
		Cat c = new Cat();
		c.makeSound();
	}
}