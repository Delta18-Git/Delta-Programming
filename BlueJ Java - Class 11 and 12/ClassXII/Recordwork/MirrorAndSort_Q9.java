package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 5/7/2023
 */
public class MirrorAndSort_Q9 {
	int[][] mat, mir;
	int m, n;

	/**
	 * The function takes user input to create a matrix and store it in a 2D array.
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter number of rows of matrix.");
		m = sysIn.nextInt();
		System.out.println("Enter number of columns of matrix.");
		n = sysIn.nextInt();
		mat = new int[m][n];
		mir = new int[m][n];
		System.out.println("Enter elements row wise.");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sysIn.nextInt();
			}
		}
		sysIn.close();
	}

	/**
	 * The function "mirror" creates a mirrored version of a matrix by swapping the elements
	 * of each row.
	 */
	void mirror() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mir[i][j] = mat[i][Math.abs(n - j - 1)];
			}
		}
	}

	/**
	 * The function sorts a 2D array called "mir" based on the values in the middle column.
	 */
	void sort() {
		for (int i = 0; i < mir.length - 1; i++) {
			for (int j = 0; j < mir.length - (1 + i); j++) {
				if (mir[j][n / 2] > mir[j + 1][n / 2]) {
					int temp = mir[j][n / 2];
					mir[j][n / 2] = mir[j + 1][n / 2];
					mir[j + 1][n / 2] = temp;
				}
			}
		}
	}

	/**
	 * The function "display" prints the elements of a 2D array "mir" in a tabular format.
	 */
	void display() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mir[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MirrorAndSort_Q9 obj = new MirrorAndSort_Q9();
		obj.input();
		obj.mirror();
		obj.sort();
		obj.display();
	}
}
