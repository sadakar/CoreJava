package logical.matrix;
/**
 * 
 * @author Sadakar.Pochampalli
 * 
 * Print m*n matrix
 *
 */
public class Matrix {

	public static void main(String args[]) {
		int matrix[][] = { { 1, 2, 3, 4 }, { 4, 5, 6, 5 }, { 7, 8, 9, 6 } }; // 3 rows , 4 columns

		for (int i = 0; i < matrix.length; i++) { //matrix.length= number of rows
			for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length = number of rows
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
