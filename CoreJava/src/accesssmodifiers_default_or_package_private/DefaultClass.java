package accesssmodifiers_default_or_package_private;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         the default access modifier (also known as package-private) is used
 *         when no access modifier is explicitly specified.
 * 
 *         Members with default access are accessible only within the same
 *         package.
 */

// For this class no access modifier is specified i.e., default class
class DefaultClass {

	int defaultField; // no access specifier is mentioned for integer variable so it is default field
						// (package-private)

	void defaultMethod() {  // no access specifier is mentioned for this method so it is default method
		System.out.println("This is a default method");
	}
}
