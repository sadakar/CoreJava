package logical.numbers;

/**
 * 
 * @author Sadakar.Pochampalli
 * Reference: https://www.qafox.com/java-for-testers-interview-questions-and-answers-part-1/
 */
import java.util.*;
public class SwappingTwoNumbers {

	public static void main(String args[]) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping \n x="+x+"\n y="+y);
		z=x;
		x=y;
		y=z;
		System.out.println("After swapping \n x="+x+"\n y="+y);
	}
}
