package ClassXII;

import java.util.Scanner;

/**
 * It takes in the size of the matrix and the elements of the matrix and prints
 * the elements of the matrix in a spiral order, only works for 3x3.
 * 
 * @author Vinaayak Gopala Dasika
 * @version 22/02/2023
 */
public class Spiral {
	// Declaring a 2D array.
	int[][] matrix;

	/**
	 * It takes in the size of the matrix and the elements of the matrix
	 */
	void input() {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter size of the array (must be odd)");
		boolean check = true;
		int x = 0;
		// Checking if the number entered is odd or not.
		while (check) {
			x = S.nextInt();
			if (x % 2 != 0) {
				check = false;
			} 
			else {
				System.out.println("Please enter an odd number.");
			}
		}
		matrix = new int[x][x];
		System.out.println("Enter array elements");
		// A for loop that is used to take in the elements of the matrix.
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				matrix[i][j] = S.nextInt();
			}
		}
	}

	/**
	 * Prints the elements of the matrix in a spiral order.
	 */
	void spiral() {
		// Finding the middle element of the matrix.
		int m = (matrix.length - 1) / 2;
		int c, r = m;
		for (c = m; c >= 0; --c) {
			System.out.print(matrix[r][c] + " ");
		}
		c = 0;
		for (r = m + 1; r <= 2 * m; ++r) {
			System.out.print(matrix[r][c] + " ");
		}
		r = 2 * m;
		for (c = 1; c <= 2 * m; ++c) {
			System.out.print(matrix[r][c] + " ");
		}
		c = 2 * m;
		for (r = 2 * m - 1; r >= 0; --r) {
			// --c;
			System.out.print(matrix[r][c] + " ");
		}
		r = 0;
		for (c = 2 * m - 1; c >= 0; --c) {
			System.out.print(matrix[r][c] + " ");
		}
	}

	public static void main(String[] args) {
		Spiral obj = new Spiral();
		obj.input();
		obj.spiral();
	}
}
