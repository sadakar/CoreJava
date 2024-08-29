package exceptionhandling;

/**
 * The Throwable class is the superclass of all errors and exceptions in Java.
 * It has two main subclasses: Error and Exception.
 * 
 */
public class ThrowableClass {

	public static void main(String args[]) {
		try {
			display();
		} catch (Throwable t) {
			System.out.println("Throwable caught:" + t.getMessage());
		}

	}
	public static void display() throws Throwable {
		throw new Throwable("This is throwable:");
	}
}
