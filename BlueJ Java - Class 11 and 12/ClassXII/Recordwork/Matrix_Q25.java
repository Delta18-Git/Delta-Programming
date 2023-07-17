package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Accept a 2-D array, perform the following: i) find the sum of the diagonal elements ii)
 * replace principle diagonal with 0. iii) Replace upper triangle matrix and replace it
 * with # symbol.
 *
 * @author Vinaayak Gopala Dasika
 * @version 17/5/2023
 */
public class Matrix_Q25 {
	int[][] matrix;
	char[][] charmat;
	int diagsum = 0, n;

	/**
	 * The function "input" prompts the user to enter the size of a 2-D array and its
	 * elements, and stores the input in the "matrix" array.
	 */
	void input() {
		System.out.println("Enter the size of the 2-D array");
		Scanner sysIn = new Scanner(System.in);
		n = sysIn.nextInt();
		System.out.println("Enter the elements");
		matrix = new int[n][n];
		charmat = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sysIn.nextInt();
			}
		}
		sysIn.close();
	}

	/**
	 * The function calculates the sum of all diagonal elements in a square matrix.
	 */
	void diagsum() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == (n - 1)) {
					diagsum += matrix[i][j];
				}
			}
		}
		System.out.println("Sum of all diagonal elements = " + diagsum);
	}

	/**
	 * The function replaces the diagonal elements of a matrix with zeros.
	 */
	void replacediag() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	/**
	 * The function "uppertri" prints the upper triangular elements of a matrix and replaces
	 * the lower triangular elements with '#' characters.
	 */
	void uppertri() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < j) {
					System.out.print(matrix[i][j] + " ");
					charmat[i][j] = '#';
				}
				else {
					System.out.print("  ");
					charmat[i][j] = (char) matrix[i][j];
				}
			}
			System.out.println();
		}
	}

	/**
	 * The function "displayboth" prints the modified array and the character array.
	 */
	/**
	 * The function multiplies two matrices and prints the resulting product.
	 */
	void displayboth() {
		System.out.println("Modified array:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Character array:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(charmat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matrix_Q25 obj = new Matrix_Q25();
		obj.input();
		obj.diagsum();
		obj.uppertri();
		obj.replacediag();
		obj.displayboth();
	}
}