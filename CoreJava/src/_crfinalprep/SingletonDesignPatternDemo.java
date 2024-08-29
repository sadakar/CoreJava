package _crfinalprep;

/**
 * Class can have only one instance
 * 
 * Acts as global point of access
 * 
 * lazy initialization -- create object as needed
 * 
 * eager initialization -- create object as the class load
 */

class Singleton {
	private static Singleton instance;

	// private static Singleton instance= new Singleton(); // eager initialization

	private Singleton() {
		// to avoid instantiation from outside
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();// lazy initialization
		}
		return instance;
	}

}

public class SingletonDesignPatternDemo {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}

}
