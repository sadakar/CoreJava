package _inheritance;

/**
 * When a class inherits another class, it is known as a single inheritance. In
 * the example given below, Dog class inherits the Animal class, so there is the
 * single inheritance.
 */

// super class -- Animal 
class Animal {

	void eat() {
		System.out.println("eating");
	}
}

// sub class -- Dog 
//inheriting the properties of super class i.e., sub class extends super class
class Dog extends Animal {

	void bark() {
		System.out.println("barking");
	}
}

// class to create object for sub class and access the methods of super class using sub class object 
class SingleInheritance {

	public static void main(String args[]) {
		Dog d = new Dog(); // creating object for sub class
		d.bark(); // calling sub class method
		d.eat(); // calling super class method
	}
}
