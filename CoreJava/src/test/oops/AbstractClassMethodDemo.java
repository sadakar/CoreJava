package test.oops;

// abstract class -- this can not be instanciated 
abstract class Animal3{
	
	// abstract method
	public abstract void makeSound();
	
	// concrete or regular method
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}
class Cat3 extends Animal3{
	public void makeSound() {
		System.out.println("Animal is making sound");
	}
	public void display() {
		System.out.println("Display");
	}
}
public class AbstractClassMethodDemo {

	public static void main(String args[]) {
		Cat3 c = new Cat3();
		c.makeSound();
		c.sleep();
		c.display();
	}
}
