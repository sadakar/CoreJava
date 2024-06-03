package logical.matrix;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         In a 2D array in Java, matrix.length gives the number of rows, and
 *         matrix[i].length gives the number of columns in row i. This is useful
 *         for iterating over all elements in the array, especially when the
 *         number of columns might not be the same in each row
 *
 */
public class MatrixDiagonalsPrimarySecondary {

	public static void main(String args[]) {
		int matrix[][] = { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} };

		// Matrix
		for (int i = 0; i < matrix.length; i++) { // matrix.length= number of rows
			for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length = number of rows
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}

		// Primary diagonal
		System.out.println("Primary diagonal");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				// Condition for principal diagonal
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
							}
		}
		
		// Secondary diagonal
		System.out.println("\nSecondary diagonal");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				// Condition for secondary diagonal
				if (i+j == matrix.length-1) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
	}

}
