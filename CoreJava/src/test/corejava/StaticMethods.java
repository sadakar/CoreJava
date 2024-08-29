package test.corejava;

public class StaticMethods {

	public static void display() {
		System.out.println("Displaying sample text from static method");
	}
	public static void main(String args[]) {
		System.out.println("Hello from main method");
		StaticMethods.display();
	}
}
