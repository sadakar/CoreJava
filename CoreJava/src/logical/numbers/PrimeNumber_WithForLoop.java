package logical.numbers;
/**
 * A prime number is a number that is divisible by only two numbers: 1 and itself. 
 * 
 * So, if any number is divisible by any other number, it is not a prime number.
 */
import java.util.*;
public class PrimeNumber_WithForLoop {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		for(int i=2;i<=number/2;++i) {
			
			// condition for nonprime number
			if(number%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(number+" is a prime number");
		} else {
			System.out.println(number+" is not a prime number");
		}
		
	}
}
