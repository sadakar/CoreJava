package test.oops;

class Car2 {

	String brand;
	String model;
	int year;

	public Car2(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void start() {
		System.out.println("Car is running");
	}
}

public class ObjClassCarDemo {

	public static void main(String args[]) {
		Car2 myCar = new Car2("Huyndai", "i20", 2021);
		System.out.println("Brand=" + myCar.brand);
		System.out.println("Model=" + myCar.model);
		System.out.println("Year=" + myCar.year);
		myCar.start();
	}

}
