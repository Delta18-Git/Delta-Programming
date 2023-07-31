package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 14/6/2023
 */
public class Matrix_Q11 {
	int[][] mat, transmat;

	/**
	 * The function takes user input to create a matrix and populate it with elements.
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter size of the matrix, with number of rows followed by number of columns.");
		int r = sysIn.nextInt();
		int c = sysIn.nextInt();
		mat = new int[r][c];
		transmat = new int[c][r];
		System.out.println("Enter elements.");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = sysIn.nextInt();
			}
			sysIn.close();
		}
	}

	/**
	 * The function checks if a given number is prime or not.
	 * 
	 * @param n The parameter "n" represents the number that we want to check if it is prime
	 *          or not.
	 * @return The method isPrime is returning a boolean value.
	 */
	boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The function "transpose" transposes a matrix by swapping its rows and columns, but only
	 * for elements that are prime numbers.
	 */
	void transpose() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (isPrime(mat[i][j])) {
					transmat[j][i] = mat[i][j];
				}
			}
		}
	}

	/**
	 * The disp() function prints the boundary elements and non-boundary elements of a 2D
	 * array.
	 */
	void disp() {
		System.out.println("BOUNDARY ELEMENTS: ");
		for (int i = 0; i < transmat.length; i++) {
			for (int j = 0; j < transmat[0].length; j++) {
				if (i == 0 || i == transmat.length - 1 || j == 0 || j == transmat[0].length - 1) {
					System.out.print(transmat[i][j] + "\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println("NON-BOUNDARY ELEMENTS: ");
		for (int i = 0; i < transmat.length; i++) {
			for (int j = 0; j < transmat[i].length; j++) {
				if (i != 0 && i != transmat.length - 1 && j != 0 && j != transmat[0].length - 1) {
					System.out.print(transmat[i][j] + "\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matrix_Q11 obj = new Matrix_Q11();
		obj.input();
		obj.transpose();
		obj.disp();
	}
}
