package logical.misc;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         Yes, we can overload the main method
 * 
 *         JVM (Java Virtual Machine) always looks for the standard public
 *         static void main(String[] args) method to start the execution of a
 *         Java program. If you provide multiple main methods, only the one with
 *         the standard signature will be recognized as the entry point.
 *
 */
public class MainMethodOverloading {

	public static void main(int args[]) {
		System.out.println("Overloaded integer array main method");
	}

	public static void main(String args[]) {
		System.out.println("Main Method");
	}

	public static void main(char[] args) {
		System.out.println("Overloaded character arry main method");
	}

	public static void main(double[] args) {
		System.out.println("Overloaded Double array main method");
	}
}
