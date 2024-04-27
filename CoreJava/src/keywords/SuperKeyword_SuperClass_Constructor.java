package keywords;

/**
 * super keyword is used to refer to the immediate parent class object
 * 
 * To invoke parent class methods
 * 
 * To access parent class fields
 * 
 * To call the parent class constructor
 * 
 * @author Sadakar.Pochampalli
 *
 */
// Super class -- Animal 
class Animal3 {

	String species;

	// Super class Constructor
	Animal3(String species) {
		this.species = species;
	}
}

// Sub class -- Cat
class Cat3 extends Animal3 {
	String color;

	// Sub class constructor
	Cat3(String species, String color) {
		super(species); // calling the constructor of the super class
		this.color=color;
	}

	void display() {
		System.out.println("Species:" + species);
		System.out.println("Color:" + color);
	}
}
// Class to create object
public class SuperKeyword_SuperClass_Constructor {

	public static void main(String args[]) {
		Cat3 c = new Cat3("Tiger","white");
		c.display();
	}
}
