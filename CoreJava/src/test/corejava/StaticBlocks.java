package test.corejava;

public class StaticBlocks {

	static {
		System.out.println("Dispalying this text from static block");
	}
	public static void main(String args[]) {
		System.out.println("Displaying this text from main method");
	}
}
