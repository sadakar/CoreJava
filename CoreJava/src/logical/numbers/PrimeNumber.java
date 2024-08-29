package logical.numbers;

import java.util.*;

/**
 * Prime number is a number that is greater than 1 and divided by 1 or itself
 * only. In other words, prime numbers can't be divided by other numbers than
 * itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 * 
 * @author Sadakar.Pochampalli
 * 
 * Reference: https://www.programiz.com/java-programming/examples/prime-number
 *
 */
public class PrimeNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		System.out.println("Enter number");
		int number = sc.nextInt();

		/*
		 * Note that we are looping from 2 to number/2. It is because a number is not
		 * divisible by more than its half.
		 */
		for (int i = 2; i <= number / 2; ++i) {

			// condition for nonprime number
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

	}
}
