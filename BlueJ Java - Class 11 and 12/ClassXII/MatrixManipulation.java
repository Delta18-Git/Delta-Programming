package ClassXII;

import java.util.Scanner;

/**
 * Write a program to declare a square matrix M[][]
 *
 * @author Vinaayak Gopala Dasika
 * @version 22/2/23
 */
public class MatrixManipulation {
	int[][] M;
	int N, c;

	MatrixManipulation() {
		N = 3;
		M = new int[N][N];
		c = 0;
	}

	MatrixManipulation(int size) {
		N = size;
		M = new int[N][N];
		c = 0;
	}

	static int sizeinput() {
		System.out.println("Enter size of array between 3 and 8, both inclusive.");
		int temp = new Scanner(System.in).nextInt();
		if (temp >= 3 && temp <= 8) {
			return temp;
		}
		else {
			System.out.println("SIZE OUT OF RANGE \nPROGRAM TERMINATING");
		}
		System.exit(-1);
		return -1;
	}

	void matrixinput() {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter positive elements of matrix");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int x = S.nextInt();
				if (x > 0) {
					M[i][j] = x;
				}
				else {
					System.out.println("Negative integer input, please retry.");
					--j;
				}
			}
		}
	}

	void printmatrix() {
		if (c == 0) {
			System.out.println("ORIGINAL MATRIX");
		}
		else if (c == 1) {
			System.out.println("REARRANGED MATRIX");
		}
		c++;
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				System.out.print(M[x][y] + "\t");
			}
			System.out.println();
		}
	}

	void principlesort() {
		int[] temp = new int[N];
		int l = 0;
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < N; b++) {
				if (a == b)
					temp[l++] = M[a][b];
			}
		}
		for (int o = 0; o < N; o++) {
			for (int p = 1; p < N; p++) {
				if (temp[p] > temp[p - 1]) {
					int t = temp[p];
					temp[p] = temp[p - 1];
					temp[p - 1] = t;
				}
			}
		}
		l = 0;
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < N; b++) {
				if (a == b)
					M[a][b] = temp[l++];
			}
		}
	}

	void boundarysum() {
		int sum = 0;
		for (int f = 0; f < N; f++) {
			for (int g = 0; g < N; g++) {
				if (f == 0 || f == (N - 1) || g == 0 || g == (N - 1))
					sum += M[f][g];
			}
		}
		System.out.println("SUM OF BOUNDARY ELEMENTS = " + sum);
	}

	public static void main(String[] args) {
		MatrixManipulation obj = new MatrixManipulation(MatrixManipulation.sizeinput());
		obj.matrixinput();
		obj.printmatrix();
		obj.principlesort();
		obj.printmatrix();
		obj.boundarysum();
	}
}