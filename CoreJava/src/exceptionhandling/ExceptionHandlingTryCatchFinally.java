package exceptionhandling;

public class ExceptionHandlingTryCatchFinally {

	public static void main(String args[]) {
		try {
			int result = 10/0;
		}catch(ArithmeticException  e){
			System.out.println("ArithematicException caught:"+e.getMessage());
		}finally {
			System.out.println("Finally block always executed:");
		}
	}
}
