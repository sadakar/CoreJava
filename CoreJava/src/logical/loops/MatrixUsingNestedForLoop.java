package logical.loops;

import java.util.*;

/**
 * Java program to print the elements of a 2 D array or matrix
 * 
 * @author Sadakar.Pochampalli
 * 
 *         References:
 *         https://www.scientecheasy.com/2021/05/nested-for-loop-in-java.html/
 *         https://www.geeksforgeeks.org/java-nested-loops-with-examples/
 *
 */
public class MatrixUsingNestedForLoop {

	public static void main(String args[]) {

		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matrix.length; i++) { //rows
			for (int j = 0; j < matrix[i].length; j++) { //columns
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
