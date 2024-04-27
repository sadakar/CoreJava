package logical.loops;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *https://www.qafox.com/java-for-testers-interview-questions-and-answers-part-1/
 */
import java.util.*;
public class PrintStars_InnerForLoop {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		for(int i=0;i<=number;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.println("* ");
			}
			System.out.println();
		}
	}
	
}
