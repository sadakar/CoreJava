package logical.loops;

/**
 * References: https://www.geeksforgeeks.org/for-each-loop-in-java/
 * 
 * @author Sadakar.Pochampalli
 *
 *
 *         It starts with the keyword for like a normal for-loop.
 * 
 *         Instead of declaring and initializing a loop counter variable, you
 *         declare a variable that is the same type as the base type of the
 *         array, followed by a colon, which is then followed by the array name.
 * 
 *         In the loop body, you can use the loop variable you created rather
 *         than using an indexed array element.
 */
public class ForEachLoop {

	public static void main(String args[]) {
		
		// array declaration
		int array[] = { 10,3,50,100};
		
		// print array elements using for each loop
		for(int element : array) {
			System.out.println(element+ " ");
		}
	}
}
