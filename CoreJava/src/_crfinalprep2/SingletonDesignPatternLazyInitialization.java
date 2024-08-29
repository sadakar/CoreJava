package _crfinalprep2;

class Singleton{
	private static Singleton instance; // private static inistance
	private Singleton() { // private constructor to avoid class instantiation outside of the class
		
	}
	public static Singleton getInstance() {  // get method to get the instance
		if(instance==null) {  
			instance = new Singleton(); // lazy initilization 
		}
		return instance;
	}
}
public class SingletonDesignPatternLazyInitialization {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton1==singleton2) {
			System.out.println("Singleton demo");
		}
	}
}
