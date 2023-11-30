// Program to define class and object
// Object and Class Example: main within the class

/* What is instance variable in java ? 
A variable which is created inside the class but outside the method is known as an instance variable. 
Instance variable doesn't get memory at compile time. 
It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.
*/
package objectandclass;

public class MainMethodInsideClass {

	int id; // instance variable
	String name; // instance variable

	// creating main method inside the class

	public static void main(String args[]) {

		// Creating an object or instance

		// s is reference variable 
		// new StudentMainMethodInClass() is the object 
		MainMethodInsideClass s = new MainMethodInsideClass(); 

		// printing values of an object

		System.out.println(s.id);
		System.out.println(s.name);
	}

}
