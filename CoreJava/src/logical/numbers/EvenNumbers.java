package logical.numbers;

import java.util.*;

/**
 * if the number is divisible by 2 then it is even
 * 
 * https://stqatools.com/java-programs-for-selenium/#1534078415996-09a88d10-617a
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class EvenNumbers {

	public static void main(String args[]) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
