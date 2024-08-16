package test.oops;

public class PrivateAccessModifierDemo {

	private int age;
	
	private PrivateAccessModifierDemo(int age) {
		this.age=age;
	}
	private void displayAge() {
		System.out.println("Dispaly age="+age);
	}
	public static void main(String args[]) {
		
		PrivateAccessModifierDemo p = new PrivateAccessModifierDemo(20);
		p.displayAge();
	}
	
}
