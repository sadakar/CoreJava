package _abstraction;

/**
 * https://www.geeksforgeeks.org/interfaces-in-java/
 * 
 * @author Sadakar.Pochampalli
 * 
 * 
 *         Uses of Interfaces in Java Uses of Interfaces in Java are mentioned
 *         below:
 * 
 *         It is used to achieve total abstraction. Since java does not support
 *         multiple inheritances in the case of class, by using an interface it
 *         can achieve multiple inheritances. Any class can extend only 1 class,
 *         but can any class implement an infinite number of interfaces. It is
 *         also used to achieve loose coupling. Interfaces are used to implement
 *         abstraction.
 *
 */
// Interface
interface In1 {

	static final int num = 10; // an interface can have values with public, static and final

	void display();

}

// class implements interface 
public class Interfaces_BasicExample implements In1 {

	public void display() {
		System.out.println("Hi");
	}

	public static void main(String args[]) {
		Interfaces_BasicExample ib = new Interfaces_BasicExample();
		ib.display();
		System.out.println("Number is : " + ib.num);
	}
}
