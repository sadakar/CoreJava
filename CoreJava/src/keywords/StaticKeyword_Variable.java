package keywords;

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
public class StaticKeyword_Variable {

	static int count = 0; // static variable

	public StaticKeyword_Variable() { // constructor
		count++;
	}

	public static void main(String args[]) {
		// Print the static variable before the instance of the class (object) is
		// created
		System.out.println("Count:" + StaticKeyword_Variable.count); // accessing static variable with class name

		StaticKeyword_Variable v = new StaticKeyword_Variable(); // object 1 and it calls default constructor
		StaticKeyword_Variable v2 = new StaticKeyword_Variable(); // object 2 and it calls default constructor

		// Print the static variable after the instance of the class is created ( two
		// objects created above so two calls)
		System.out.println("Count after creating instances:" + StaticKeyword_Variable.count);// accessing static
																								// variable with class
																								// name
	}
}
