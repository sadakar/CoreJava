package _polymorphism;

/**
 * Polymorphism: Ability of a method to operate on different types or classes.
 * Same method with multiple implementations.
 * 
 * Single action in different ways
 * 
 * Runtime Polymorphism: Dynamic method dispatch : A subclass provides a
 * specific implementation for a method that is already defined in its
 * superclass.
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
 * 
 * What is up-casting ?
 * 
 * If the reference variable of Parent class refers to the object of Child
 * class, it is known as up-casting.
 */

// super class -- Animal 
class Animal {

	// Overriden method
	void makeSound() {
		System.out.println("Some animal sound");
	}
}

// sub class Cat extends Super Class Animal and override the same method name
class Cat extends Animal { // sub class having IS-A relationship i.e., inheritance with
							// extends keyword

	void makeSound() {
		System.out.println("Cat meows");
	}
}

// sub class Dog extends Super Class Animal and override the same method name
class Dog extends Animal {
	// same method name with same parameters -- in this examples parameters are not
	// taken
	void makeSound() {
		System.out.println("Dog barks");
	}
}

// class to create objects and methods 
class RuntimePolymorphism_MethodOverriding {

	public static void main(String[] args) {

		Animal myAnimal = new Animal(); // object for Animal superclass

		// Creating objects for Sub classes Cat and Dog by up-casting

		// If the reference variable of Parent class refers to the object of Child
		// class, it is known as up-casting.

		Animal myCat = new Cat(); // object for Cat sub class by up casting with super class
		Animal myDog = new Dog(); // object for Dog sub class by up casting with super class

		myAnimal.makeSound(); // Overriden method is called from Animal super class
		myCat.makeSound(); // Overriden method is called from Cat sub class
		myDog.makeSound(); // Overriden method is called from Dog sub class
	}
}
