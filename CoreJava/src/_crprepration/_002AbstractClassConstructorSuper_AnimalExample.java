package _crprepration;

// abstract class, constructor, concrete method
abstract class Animal { // abstract class
	String name;

	// Constructor in the abstract class
	protected Animal(String name) {
		this.name = name;
	}

	// abstract method (no implementation)
	public abstract void makeSound();

	// Concrete method(with implementation)
	public void sleep() {
		System.out.println(name + "Animal is sleeping");
	}
}

class Dog extends Animal { // Sub class
	// Constructor in the sub class
	public Dog(String name) {
		super(name);
	}

	// Implementation of abstract method
	@Override
	public void makeSound() {
		System.out.println(name + "says: Woof, woof");
	}

}

public class _002AbstractClassConstructorSuper_AnimalExample {

	public static void main(String args[]) {
		Dog dog = new Dog("Buddy");
		dog.makeSound();
		dog.sleep();
	}
}
