package test;

public class Matrix {
	public static void main(String args[]) {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 9, 9 } };

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println(" ");
		}

		int sum=0;
		for (int i = 0; i < mat.length; i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i==j) {
					System.out.print(mat[i][j]);
					sum=sum+mat[i][j];
				}
			}
		}
		System.out.println("Sum1="+sum);
		
		
		int sum2=0;
		for (int i = 0; i < mat.length; i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i!=j && i+j==mat.length-1) {
					System.out.print(mat[i][j]);
					sum2=sum2+mat[i][j];
				}
			}
		}
		System.out.println("Sum2="+sum2);
	}
}
