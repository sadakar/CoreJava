package _crprepration;

class Singleton {

	// private static variable to hold the single instance
	private static Singleton instance;

	// Private Constructor to prevent instantiation from outside
	private Singleton() {
		// Optional : Initialization code
	}

	// Static method to get the single instance of Singleton class
	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton(); // Lazy initialization
		}
		return instance;
	}
	// Optional: Other methods and properties of Singleton class
}
public class _018SingletonDemo{
	
	public static void main(String args[]) {
		
		// Getting singleton instance
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		// Both references point to the same instance 
		System.out.println(singleton1==singleton2);
	}
}