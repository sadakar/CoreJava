package _crprepration;

/**
 * Functional Interface A functional interface is an interface that contains
 * exactly one abstract method. They can have multiple default or static methods
 * but only one abstract method. Functional interfaces are the foundation of
 * lambda expressions and method references in Java.
 * 
 * Key Points:
 * 
 * Marked with @FunctionalInterface annotation (optional but recommended). Can
 * have only one abstract method. Can have multiple default and static methods.
 * 
 * apply() method
 */
@FunctionalInterface
interface MyFunctionalInterface{
	void execute();
	default void defaultMethod() {
		System.out.println("Default method");
	}
	static void staticMethod() {
		System.out.println("Static method");
	}
}
public class _007FunctionalInterface {
	
	public static void main(String args[]) {
		
		MyFunctionalInterface fun = () -> System.out.println("Executing lambda expression");
		fun.execute();// executing labmda expression
		fun.defaultMethod();
		MyFunctionalInterface.staticMethod();
	}

}
