package logical;
/**
 * 
 * @author Sadakar.Pochampalli
 * 
 * % -- module operator
 * "/" -- division operator
 *
 */
public class Number_ReverseANumber {

	public static void main(String args[]) {
		int number =123;
		int reverseNumber =0;
		System.out.print("Number="+number);
		while(number!=0) {
			
			int remainder = number % 10;
			reverseNumber = reverseNumber*10 + remainder;
			number = number/10;
		}
		System.out.println("\nReverse Number="+reverseNumber);
	}
}
