package exceptionhandling;

/**
 * The throws keyword is used in method signatures to declare that a method can
 * throw one or more exceptions.
 */
public class ThrowsKeyword {

	public static void main(String args[]) {

		try {
			display();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static void display() throws Exception {
		throw new Exception("This is an exception");
	}
}
