package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author B. M. Chamany
 * @author Vinaayak Gopala Dasika
 * @version 21/6/2023
 */
public class MatrixMultiply_Q8 {
	int p, q, r;
	int[][] a, b, c;

	/**
	 * The function takes user input to determine the dimensions and elements of two matrices.
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter number of rows of matrix 1.");
		p = sysIn.nextInt();
		System.out.println("Enter number of columns of matrix 1.");
		q = sysIn.nextInt();
		System.out.println("Number of rows of matrix 2 = " + q);
		System.out.println("Enter number of columns of matrix 2.");
		r = sysIn.nextInt();
		a = new int[p][q];
		b = new int[q][r];
		c = new int[p][r];
		System.out.println("Enter the elements of 1st matrix row wise.");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				a[i][j] = sysIn.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd matrix row wise.");
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < r; j++) {
				b[i][j] = sysIn.nextInt();
			}
		}
		sysIn.close();
	}

	/**
	 * The function multiplies two matrices and prints the resulting product.
	 */
	void multiply() {
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < r; j++) {
				int sum = 0;
				for (int k = 0; k < q; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		System.out.println("Product: ");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MatrixMultiply_Q8 obj = new MatrixMultiply_Q8();
		obj.input();
		obj.multiply();
	}
}
