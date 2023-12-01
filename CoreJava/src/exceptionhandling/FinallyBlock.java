package exceptionhandling;

/**
 * finally is a block used with try/catch blocks as an optional
 * 
 * all the code in the finally block is executed irrespective of handling
 * exceptions.
 * 
 * @author Sadakar.Pochampalli
 *
 */

public class FinallyBlock {

	public static void main(String args[]) {
		int number = 100;
		try {
			System.out.println("number=" + number);
		} catch (Exception e) {
			System.out.println("Exception occured");
		} finally { // finally block is executed irrespective of exception occured or not
			System.out.println("Execution of finally block");
		}
	}
}
