package logical.arrays;

/**
 * 
 * @author Sadakar.Pochampalli
 *
 *         References:
 *         https://www.qafox.com/java-for-testers-interview-questions-and-answers-part-1/
 */
public class LargestNumberInArray {

	public static void main(String args[]) {
		final int array[] = { 100, 200, 50, 650, 1, 43 };
		int max = array[0]; // set max number as first number from array
		
		// Regular for loop
		/*
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		*/
		// for each loop
		for (int num : array) { 
            if (num > max) {
                 max = num;
             }             
         }
		
		System.out.println("Maximum number=" + max);
	}
}
