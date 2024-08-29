package test.corejava;

public class StaticNestedClass {

	static class StaticInnerNestedClass{
		
		public void display() {
			System.out.println("Displaying text from Innner Nested class");
		}
	}
	public static void main(String args[]) {
		StaticNestedClass.StaticInnerNestedClass obj = new StaticNestedClass.StaticInnerNestedClass();
		obj.display();
	}
}
