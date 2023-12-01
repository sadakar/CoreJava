package Polymorphism;

/**
 * Polymorphism: Ability of a method to operate on different types or classes.
 * Same method with multiple implementations.
 * 
 * Single action in different ways
 * 
 * Runtime Polymorphism: A subclass provides a specific implementation for a
 * method that is already defined in its superclass.
 * 
 * Methods will have same signature in super and sub classes i.e., methods must
 * have same parameters in super and sub classes
 * 
 * Must be as IS-A relationship (inheritance)
 * 
 * Object type is determined at runtime and appropriate method is called based
 * on the actual object type.
 * 
 * It resolved at run time
 */

// super class -- Animal 
class Animal {

	// same method name with same parameters -- in this examples parameters are not
	// taken
	void makeSound() {
		System.out.println("Some animal sound");
	}
}

// sub class -- Cat with same method name
class Cat extends RuntimePolymorphismMethodOverriding { // sub class having IS-A relationship i.e., inheritance with
														// extends keyword

	// same method name with same parameters -- in this examples parameters are not
	// taken
	void makeSound() {
		System.out.println("Cat meows");
	}
}

// sub class -- Dog with same method name
class Dog extends RuntimePolymorphismMethodOverriding {
	// same method name with same parameters -- in this examples parameters are not
	// taken
	void makeSound() {
		System.out.println("Dog barks");
	}
}

// class to create objects and methods 
class RuntimePolymorphismMethodOverriding {
	public static void main(String[] args) {

		Animal myAnimal = new Animal(); // object for Animal superclass
		Cat myCat = new Cat(); // object for Cat sub class
		Dog myDog = new Dog(); // object for Dog sub class

		myAnimal.makeSound();
		myCat.makeSound();
		myDog.makeSound();
	}
}
