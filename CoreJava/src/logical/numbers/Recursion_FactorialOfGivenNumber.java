package logical.numbers;

/**
 * https://www.geeksforgeeks.org/recursion-in-java/
 * 
 * https://www.javatpoint.com/factorial-program-in-java
 * 
 * @author Sadakar.Pochampalli
 *
 *         The classic example of recursion is the computation of the factorial
 *         of a number. The factorial of a number N is the product of all the
 *         numbers between 1 and N. The below-given code computes the factorial
 *         of the numbers: 3, 4, and 5.
 * 
 *         3= 3 *2*1 (6)
 * 
 *         4= 4*3*2*1 (24)
 * 
 *         5= 5*3*2*1 (120)
 */
public class Recursion_FactorialOfGivenNumber {

	// factorial function
	static int factorial(int number) {

		if (number == 0)
			return 1;
		else
			return number * factorial(number - 1); // calling the same function
	}

	public static void main(String args[]) {

		int factorialValue = factorial(5);
		System.out.println("Factorila of 5 is : " + factorialValue);
	}
}
