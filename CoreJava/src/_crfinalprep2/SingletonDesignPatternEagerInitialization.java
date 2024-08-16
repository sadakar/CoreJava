package _crfinalprep2;

class Singleton2{
	private static Singleton2 instance = new Singleton2(); // private static inistance with eager initialization
	private Singleton2() { // private constructor to avoid class instantiation outside of the class
		
	}
	public static Singleton2 getInstance() {  // get method to get the instance
		return instance;
	}
}
public class SingletonDesignPatternEagerInitialization {

	public static void main(String[] args) {
		Singleton2 singleton1 = Singleton2.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		
		if(singleton1==singleton2) {
			System.out.println("Singleton demo");
		}
	}
}
