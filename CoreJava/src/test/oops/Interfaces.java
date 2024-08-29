package test.oops;

interface Animal5 {
	public void makeSound();
	public void sleep();
}

class Cat5 implements Animal5 {
	public void makeSound() {
		System.out.println("Animal is making sound");
	}

	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

public class Interfaces {
	public static void main(String args[]) {

		Cat5 c = new Cat5();
		c.makeSound();
		c.sleep();
	}

}
