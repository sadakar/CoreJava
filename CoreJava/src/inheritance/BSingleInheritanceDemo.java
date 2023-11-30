package inheritance;
/*
 * When a class inherits another class, it is known as a single inheritance. 
 * In the example given below, Dog class inherits the Animal class, so there is the single inheritance.
 */
class Animal { // super calss

	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{ // sub class extends super class
	void bark() {
		System.out.println("barking");
	}
}

class BSingleInheritanceDemo {

	public static void main(String args[]) {
	Dog d = new Dog(); // creating object for sub class
	d.bark(); // calling sub class method
	d.eat(); // calling super class method
	}
}
