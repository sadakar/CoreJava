package logical.matrix;

public class MatrixDiagonalElementsSumExcludingCenterElement {

	public static void main(String args[]) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Print matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}

		// Calculating sum of primary diagonal
		int primaryDiagonalSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					primaryDiagonalSum = primaryDiagonalSum + matrix[i][j];
				}
			}
		}
		System.out.println("Sum of primary diagonal=" + primaryDiagonalSum);

		// Calculating sum of secondary diagonal
		int secondaryDiagonalSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i + j == matrix.length - 1) {
					secondaryDiagonalSum = secondaryDiagonalSum + matrix[i][j];
				}
			}
		}
		System.out.println("Sum of Secondary diagonal=" + secondaryDiagonalSum);

		// Calculating sum of secondary diagonal excluding the center element for 3*3
		// matrix
		int secondaryDiagonalSumExcludingCenterElement = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i != j && i + j == matrix.length - 1) {
					secondaryDiagonalSumExcludingCenterElement = secondaryDiagonalSumExcludingCenterElement
							+ matrix[i][j];
				}
			}
		}
		System.out.println(
				"Sum of Secondary diagonal excluding center element=" + secondaryDiagonalSumExcludingCenterElement);

		int SumOfDigonalExecludingCenterElement = primaryDiagonalSum+secondaryDiagonalSumExcludingCenterElement;
		System.out.println("Sum of diagonals excluding center for a 3*3 matrix="+SumOfDigonalExecludingCenterElement);
	}
}
