package accessmodifiers_protected_subclassinanotherpackage;

import accessmodifiers_protected.Animal;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         the protected access modifier allows a member (field or method) to be
 *         accessed within its own package or by subclasses in any package.
 *
 */
// sub class in another package
public class Bird extends Animal {

	private String color;

	// Constructor
	public Bird(String name, String color) {
		super(name); // Calling the super class constructor
		this.color = color;
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
	}

	public void makeSound() {
		System.out.println(name + "is chirping");
	}
}
