package accessmodifiers_public;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         Members of public class can be accessible from any other class
 * 
 *         Scope is widest
 *
 */
// class with public access modifier
public class PubliClass {

	// public variable
	public int a = 100;

	// public method
	public void display() {
		System.out.println("Sample Text from public method");
	}

	public static void main(String args[]) {

		// Creating object for class
		PubliClass pc = new PubliClass();

		// Accessing public variable
		System.out.println("a=" + pc.a);

		// Accessing public method
		pc.display();
	}
}
