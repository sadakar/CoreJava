package Keywords;

/**
 * @author Sadakar.Pochampalli
 * 
 *         static keyword is used for memory management. i.e., to save memory.
 *         It is used to define members -- instance variables (fields), methods,
 *         nested classes and blocks.
 * 
 *         -- static variables --
 * 
 *         shared among all the instances of a class
 * 
 *         Initialized only once when the class is loaded
 * 
 *         Accessed through only class name , not through instance of a class
 * 
 *         -- static methods --
 * 
 *         Belongs to the class rather than instances of the class.
 * 
 *         Called using the class name , not through instance of a class.
 * 
 *         -- static blocks --
 * 
 *         Used to initialize the static variables or perform one-time
 *         initialization tasks.
 * 
 *         Executed when the class is loaded.
 * 
 *         -- nested classes --
 * 
 *         A nested class is a class that is nested associated with outer class
 *         but not with instance of the outer class.
 * 
 *         Used to access the static members of the outer class
 * 
 *
 */
public class StaticKeyword_NestedClass { // Outer class

	// static nested class
	static class StaticNestedClass { // inner class with static keyword
		void display() {
			System.out.println("Static nested class text");
		}
	}

	public static void main(String args[]) {

		// Creating object for nested class
		StaticKeyword_NestedClass.StaticNestedClass obj = new StaticKeyword_NestedClass.StaticNestedClass();

		obj.display();

	}
}
