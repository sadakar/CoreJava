package exceptionhandling;

/**
 * Single try block and multiple catch blocks
 * 
 * Yes, multiple catch blocks can exist but specific approaches should come
 * prior to the general approach because only the first catch block satisfying
 * the catch condition is executed. The given code illustrates the same:
 * 
 * 
 * Here, the second catch block will be executed because of division by 0 (i /
 * x). In case x was greater than 0 then the first catch block will execute
 * because for loop runs till i = n and array index are till n-1
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class SingleTryMultipleCatchBlocks {

	public static void main(String args[]) {

		try {
			int n = 1000, x = 1;
			int array[] = new int[n];
			/*
			 * int array[] = new int[n]; Declares an integer array named array and creates a
			 * new array object with a length of n elements. In this case, the array has
			 * 1000 elements (indices 0 through 999). The elements are initialized to their
			 * default value, which is 0 for integers.
			 */
			for (int i = 0; i <= n; i++) {
				array[i] = i / x;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1st block = ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("2nd block = ArithmeticException");
		} catch (Exception e) {
			System.out.println("3rd block = Exception");
		}

	}
}
