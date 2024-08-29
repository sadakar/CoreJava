package logical.arrays;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         References:
 *         https://www.qafox.com/java-for-testers-interview-questions-and-answers-part-1/
 */
/**
 * Initial values:
max = 100
Iteration 1 (num = 100):
100 > 100 is false, so max remains 100.
Iteration 2 (num = 200):
200 > 100 is true, so max is updated to 200.
Iteration 3 (num = 50):
50 > 200 is false, so max remains 200.
Iteration 4 (num = 650):
650 > 200 is true, so max is updated to 650.
Iteration 5 (num = 1):
1 > 650 is false, so max remains 650.
Iteration 6 (num = 43):
43 > 650 is false, so max remains 650.
After the loop finishes, the maximum value in the array is 650, which is then printed.
 */

/**
 * Initial values: max = 100
 * 
 * Iteration 1 (num = 100):
 * 
 * 100 > 100 is false, so max remains 100.
 * 
 * Iteration 2 (num = 200):
 * 
 * 200 > 100 is true, so max is updated to 200.
 * 
 * Iteration 3 (num = 50):
 * 
 * 50 > 200 is false, so max remains 200.
 * 
 * Iteration 4 (num = 650):
 * 
 * 650 > 200 is true, so max is updated to 650.
 * 
 * Iteration 5 (num = 1):
 * 
 * 1 > 650 is false, so max remains 650.
 * 
 * Iteration 6 (num = 43):
 * 
 * 43 > 650 is false, so max remains 650.
 * 
 * After the loop finishes, the maximum value in the array is 650, which is then
 * printed.
 */
public class MaxAndMinNumbersInArray {

	public static void main(String args[]) {
		final int array[] = { 100, 200, 50, 650, 1, 43 };
		int max = array[0]; // set max number as first number from array
		int min = array[0];
		// Regular for loop
		/*
		 * for (int i = 0; i < array.length; i++) { if (array[i] > max) { max =
		 * array[i]; } }
		 */
		// for each loop with loop variable as num
		for (int num : array) {
			// find max
			if (num > max) {
				max = num;
			}
			// find min
			if (num < min) {
				min = num;
			}
		}

		System.out.println("Maximum number=" + max);
		System.out.println("Minimum number=" + min);
	}
}
