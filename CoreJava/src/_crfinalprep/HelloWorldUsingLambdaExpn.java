package _crfinalprep;

public class HelloWorldUsingLambdaExpn {

	public static void main(String[] args) {
		
		Runnable printHello = () -> System.out.println("Hello World");
		new Thread(printHello).start();
	}
}
