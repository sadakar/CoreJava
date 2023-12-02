package accesssmodifiers_default_or_package_private;

// Another class in the same package
public class AnotherClassInSamePackage {

	public static void main(String args[]) {

		// Creating object for DefaultClass
		DefaultClass dc = new DefaultClass();

		// Accessing default (package-private) members within the same package

		dc.defaultField = 42; // accessing default integer variable from DefaultClass
		dc.defaultMethod(); // accessing default method from DefaultClass
	}
}
