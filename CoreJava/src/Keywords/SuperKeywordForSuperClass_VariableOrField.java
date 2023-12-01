package Keywords;

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
class Animal2 {
	String color = "Brown";
}

// Sub class -- Cat
class Cat2 extends Animal2 {
	String color = "white";

	void displayColor() {
		System.out.println("Cat Color:" + this.color);
		System.out.println("Animal Color:" + super.color); // Accessing the color field of super class
	}
}

// Class to create object
public class SuperKeywordForSuperClass_VariableOrField {
	public static void main(String args[]) {
		Cat2 c = new Cat2();
		c.displayColor();
	}

}
