package objectandclass;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         Class : A blue print that defines structure and behavior
 * 
 *         Object : An instance of class that represents a real-world entity and
 *         encapsulating data and methods
 *
 */
// Car class
class ClassObject_Car {

	// instance variables
	String brand;
	String model;
	int year;

	// Constructor -- parameterized
	ClassObject_Car(String brand, String model, int year) {
		this.brand = brand; // this keyword is used to identify the class variables (in this case instance
							// variables)
		this.model = model;
		this.year = year;
	}

	// Sample method inside a class
	public void startCar() {
		System.out.println("Car is running");
	}
}

// Class to create object for Car class
class Main2 {
	public static void main(String args[]) {
		// Create an object of the Car class
		ClassObject_Car myCar = new ClassObject_Car("Hyundai", "i20", 2021); // Constructor is called when the object
																				// is created
		// Access the fields
		System.out.println("Brand:"+myCar.brand);
		System.out.println("Model:"+myCar.model);
		System.out.println("Year:"+myCar.year);
		
		// Access the methods
		myCar.startCar();
	}
}
