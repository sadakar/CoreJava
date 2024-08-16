package test.corejava;

public class StaticVariable {

	static int a =0;
	public StaticVariable() {
		a++;
	}
	
	public static void main(String args[]) {
		
		System.out.println("Before Creating object="+StaticVariable.a);
		StaticVariable sv = new StaticVariable();
		System.out.println("After Creating object="+StaticVariable.a);
		StaticVariable sv2 = new StaticVariable();
		System.out.println("After Creating another object="+StaticVariable.a);
	}
	
}
