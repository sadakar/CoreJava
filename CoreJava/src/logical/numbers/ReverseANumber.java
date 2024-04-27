package logical.numbers;
/**
 * 
 * @author Sadakar.Pochampalli
 * 
 * % -- module operator
 * "/" -- division operator
 *
 */
public class ReverseANumber {

	public static void main(String args[]) {
		int number =123;
		int reverseNumber =0;
		System.out.print("Number="+number);
		while(number!=0) {
			
			int remainder = number % 10; // module operator
			reverseNumber = reverseNumber*10 + remainder;
			number = number/10; // division operator
		}
		System.out.println("\nReverse Number="+reverseNumber);
	}
}
