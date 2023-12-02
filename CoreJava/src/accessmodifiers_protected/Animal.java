package accessmodifiers_protected;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         the protected access modifier allows a member (field or method) to be
 *         accessed within its own package or by subclasses in any package.
 *
 */
// super class
public class Animal {

	// protected variable
	protected String name;

	// protected constructor
	protected Animal(String name) {
		this.name = name;
	}

	// protected method
	protected void eat() {
		System.out.println(name + " is eating");
	}
}
