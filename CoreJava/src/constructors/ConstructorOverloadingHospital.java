package constructors;

/**
 * Constructor is a special method that is called when an object for the class
 * is created.
 * 
 * Constructor overloading is the process of creating multiple constructors in
 * the class with same name varying in number of parameters
 * 
 * @author Sadakar.Pochampalli
 *
 */

public class ConstructorOverloadingHospital {

	// instance variables
	int var1, var2; // for doctors and nurses
	double var3; // for doctor salary

	// Constructor with two parameters
	public ConstructorOverloadingHospital(int doctors, int nurses) {
		var1 = doctors;
		var2 = nurses;
	}

	// Constructor with one parameter
	public ConstructorOverloadingHospital(int doctors) {
		var1 = doctors;
	}

	// Constructor with one parameter
	public ConstructorOverloadingHospital(double salary) {
		var3=salary;
	}
	public static void main(String args[]) {
		// Creating objects and calling the constructors 
		ConstructorOverloadingHospital h1 = new ConstructorOverloadingHospital(10,20); // object h1 is created with 2 parameters
		ConstructorOverloadingHospital h2 = new ConstructorOverloadingHospital(30); // object h2 is created with 1 parameter
		ConstructorOverloadingHospital h3 = new ConstructorOverloadingHospital(50000.0);// object h3 is created with 1 parameter
		
		// Printing the values of constructor
		System.out.println("Hospital 1: Doctors = " + h1.var1 + ", Nurses = " + h1.var2);
        System.out.println("Hospital 2: Doctors = " + h2.var1);
        System.out.println("Hospital 3: Salaries = " + h3.var3);
	}
}
