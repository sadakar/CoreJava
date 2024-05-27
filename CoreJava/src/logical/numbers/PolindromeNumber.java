package logical.numbers;
import java.util.*;
public class PolindromeNumber {
	public static void main(String args[]) {
		System.out.println("Enter a number in next line:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int revNumber =0;
		int remainder=0;
		
		while(number!=0) {
			
			remainder = number%10;
			revNumber = revNumber*10+remainder;
			number=number/10;
		}
		System.out.println("Given number is="+temp);
		System.out.println("Reverse of number="+revNumber);
		if(temp==revNumber) {
			System.out.println("Given number is polindrome");
		}else {
			System.out.println("Given number is not a polindrome");
		}
	}

}
