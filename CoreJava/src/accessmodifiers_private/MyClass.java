package accessmodifiers_private;

/**
 * 
 * @author Sadakar.Pochampalli'
 * 
 *         Members( instance variables, methods) are accessible with in the same
 *         class.
 * 
 *         Used to hide the implementation details and achieve encapsulation
 *
 */
public class MyClass {

	private int a = 10; // private variable -- can only accessible with in the same class

	private void display() { // private method -- can only be accessible with in the same class
		System.out.println("Hello!");
	}

	public static void main(String args[]) {
		MyClass mc = new MyClass();

		// accessing private variable a with in the class
		System.out.println("a=" + mc.a);

		// accessing private method display() with in the class
		mc.display();
	}
}
