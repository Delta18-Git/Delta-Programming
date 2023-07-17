package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Write a program to accept a 2-D array and display the elements spirally
 * (inside to outside).
 *
 * @author Vinaayak Gopala Dasika
 * @version 7/4/2023
 */
public class Spiral_Q10 {
	// Declaring a 2D array.
	int[][] matrix;

	/**
	 * It takes in the size of the matrix and the elements of the matrix
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int x = sysIn.nextInt();
		matrix = new int[x][x];
		System.out.println("Enter array elements");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				matrix[i][j] = sysIn.nextInt();
			}
		}
		sysIn.close();
	}
	void spiral() {
		int n = matrix.length - 1;
		int start;
		int endI = n + 1;
		if (n % 2 == 0) {
			start = n / 2;
		} else {
			start = (n - 1) / 2;
		}
		int row = start;
		int col = start;
		for (int i = 1; i <= endI; i++) {
			try {
				if (i % 2 != 0) {
					int nrow = row + i, ncol = col + i;
					for (; row < nrow; row++)
						System.out.print(matrix[row][col] + " ");
					for (; col < ncol; col++)
						System.out.print(matrix[row][col] + " ");
				} else {
					int nrow = row - i, ncol = col - i;
					for (; row > nrow; row--)
						System.out.print(matrix[row][col] + " ");
					for (; col > ncol; col--)
						System.out.print(matrix[row][col] + " ");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		Spiral_Q10 obj = new Spiral_Q10();
		obj.input();
		obj.spiral();
	}
}