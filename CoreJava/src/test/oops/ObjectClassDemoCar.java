package test.oops;

class Car {

	// instance variables
	String brand;
	String model;
	int year;

	// constructor
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// method
	public void start() {
		System.out.println("Starting the car");
	}
}

public class ObjectClassDemoCar {

	public static void main(String args[]) {
	// Create object 
	Car myCar = new Car("Toyota","carmory",2022);
	
	// Access fields 
	System.out.println("Brand="+myCar.brand);
	System.out.println("Model="+myCar.model);
	System.out.println("Year="+myCar.year);
	myCar.start();
	}
}
