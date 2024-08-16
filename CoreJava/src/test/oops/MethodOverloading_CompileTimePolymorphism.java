package test.oops;

public class MethodOverloading_CompileTimePolymorphism {

	public void display(int a) {
		System.out.println(a);
	}
	public void display(int a, int b) {
		System.out.println(a+" "+b);
	}
	public void display(String  name) {
		System.out.println(name);
	}
	
	public static void main(String args[]) {
		
		MethodOverloading_CompileTimePolymorphism mo = new MethodOverloading_CompileTimePolymorphism();
		mo.display(20);
		mo.display(30,40);
		mo.display("Sadakar");
	}
	
}
