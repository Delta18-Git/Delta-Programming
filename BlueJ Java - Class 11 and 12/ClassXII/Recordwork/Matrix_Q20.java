package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 7/6/2023
 */
public class Matrix_Q20 {
	int[][] matrix;

	/**
	 * The function initializes a square matrix of a given size and populates it with user
	 * input.
	 */
	void init() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter the size of the square matrix.");
		int n = sysIn.nextInt();
		if (n < 4) {
			System.out.println("Size must be greater than 3.");
			throw new RuntimeException("Size lesser than 4.");
		}
		matrix = new int[n][n];
		System.out.println("Enter " + n * n + " elements.");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sysIn.nextInt();
			}
		}
		sysIn.close();
	}

	/**
	 * The menu function displays a menu of options, prompts the user for input, and performs
	 * the corresponding action based on the user's choice.
	 */
	void menu() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Choose an option: ");
		System.out.println("1 - Swap the 'i'th and last row of the matrix.");
		System.out.println("2 - Display the highest value from each column of the matrix.");
		System.out.println("3 - Display the lowest value from each row of the matrix.");
		System.out.print("Your choice (1/2/3): ");
		int n = sysIn.nextInt();
		switch (n) {
		case 1:
			this.swap();
			break;
		case 2:
			this.maxVal();
			break;
		case 3:
			this.minVal();
			break;
		default:
			System.out.println("Invalid option selected.");
			this.menu();
		}
		System.out.print("Run again? (Y/N): ");
		char c = sysIn.next().toUpperCase().charAt(0);
		switch (c) {
		case 'Y':
			this.menu();
			break;
		case 'N':
			sysIn.close();
			break;
		default:
			System.out.println("Invalid option, assumed to be no.");
			sysIn.close();
		}
	}

	/**
	 * The function "display" prints the elements of a 2D integer array in a tabular format.
	 * 
	 * @param mat The parameter "mat" is a two-dimensional array of integers.
	 */
	void display(int[][] mat) {
		System.out.println("Output: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * The function `swap` takes user input for a row number, swaps that row with the last row
	 * in a matrix, and then displays the updated matrix.
	 */
	void swap() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter the row to be swapped.");
		int k = sysIn.nextInt();
		k--;
		sysIn.close();
		int[][] matrix2 = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				matrix2[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			int temp = matrix[k][i];
			matrix2[k][i] = matrix2[matrix.length - 1][i];
			matrix2[matrix.length - 1][i] = temp;
		}
		this.display(matrix2);
	}

	/**
	 * The function "maxVal" finds the maximum value in each column of a matrix and prints it
	 * out.
	 */
	void maxVal() {
		for (int i = 0; i < matrix.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < matrix.length; j++) {
				max = Math.max(matrix[j][i], max);
			}
			System.out.println("The greatest number in column " + i + 1 + " is: " + max);
		}
	}

	/**
	 * The function "minVal" finds the lowest number in each row of a matrix and prints it
	 * out.
	 */
	void minVal() {
		for (int i = 0; i < matrix.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < matrix.length; j++) {
				min = Math.min(matrix[i][j], min);
			}
			System.out.println("The lowest number in row " + i + 1 + " is: " + min);
		}
	}

	public static void main(String[] args) {
		Matrix_Q20 obj = new Matrix_Q20();
		obj.init();
		obj.menu();
	}
}
