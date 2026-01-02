package arrays;

public class _2darrays {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		System.out.println("2D Array Elements:");
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}

		// Row-wise sum
		for (int i = 0; i < matrix.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				rowSum += matrix[i][j];
			}
			System.out.println("Sum of row " + i + ": " + rowSum);
		}

		// Column-wise sum
		for (int j = 0; j < matrix[0].length; j++) {
			int colSum = 0;
			for (int i = 0; i < matrix.length; i++) {
				colSum += matrix[i][j];
			}
			System.out.println("Sum of column " + j + ": " + colSum);
		}

//		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] transpose = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		System.out.println("Transpose of the matrix:");
		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[i].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
