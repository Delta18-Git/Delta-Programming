package ClassXII.Recordwork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program the inputs the names of people into two different arrays A and B. A has
 * N names while B has M names, with no duplicates in either.
 *
 * @author Vinaayak Gopala Dasika
 * @version 19/7/2023
 */
public class ArrayMerge_Q12 {
	int M, N;
	String[] A, B, C;

	/**
	 * Checks for duplicates in an array of strings.
	 *
	 * @param  arr  the array of strings to check
	 * @return      true if there are no duplicates, false otherwise
	 */
	static boolean checkDuplicate(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * This function reads input from the user and populates two arrays, A and B.
	 * It prompts the user to enter the number of people for list A and then prompts
	 * the user to enter the names of those people. It checks for duplicate names
	 * in list A and throws a RuntimeException if any duplicates are found. If no
	 * duplicates are found in list A, it prompts the user to enter the number of
	 * people for list B and then prompts the user to enter the names of those people.
	 * It checks for duplicate names in list B and throws a RuntimeException if any
	 * duplicates are found. If duplicates are found in either list A or list B, it
	 * prints an error message to the console.
	 *
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("LIST A:");
		System.out.print("Enter number of people: ");
		M = sysIn.nextInt();
		System.out.println("Enter " + M + " names:");
		A = new String[M];
		for (int i = 0; i < M; i++) {
			A[i] = sysIn.next();
		}
		if (checkDuplicate(A)) {
			System.out.println("LIST B:");
			System.out.print("Enter number of people: ");
			N = sysIn.nextInt();
			System.out.println("Enter " + N + " names:");
			B = new String[N];
			for (int i = 0; i < N; i++) {
				B[i] = sysIn.next();
			}
			if (!checkDuplicate(B)) {
				System.out.println("Duplicate names found.");
				throw new RuntimeException("Duplicate names in list B");
			}
		}
		else {
			System.out.println("Duplicate names found.");
			throw new RuntimeException("Duplicate names in list A");
		}
	}

	/**
	 * Merge two arrays A and B into array C in ascending order.
	 * 
	 */
	void merge() {
		C = new String[M + N];
		for (int i = 0; i < M - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (A[j].compareToIgnoreCase(A[j - 1]) < 0) {
					String temp = A[j - 1];
					A[j - 1] = A[j];
					A[j] = temp;
				}
			}
		}
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (B[j].compareToIgnoreCase(B[j - 1]) < 0) {
					String temp = B[j - 1];
					B[j - 1] = B[j];
					B[j] = temp;
				}
			}
		}
		int c = 0, j = 0, i = 0;
		for (; i < M; i++) {
			for (; j < N; j++) {
				if (A[i].compareToIgnoreCase(B[j]) < 0) {
					C[c++] = A[i];
					break;
				}
				else {
					C[c++] = B[j];
				}
			}
		}
		if (c < M + N) {
			if (j == N) {
				for (int k = c - N; k < M; k++) {
					C[c++] = A[k];
				}
			}
			for (int k = j; k < N; k++) {
				C[c++] = B[k];
			}
		}
	}

	/**
	 * Displays the arrays A, B, and C.
	 *
	 */
	void display() {
		System.out.print("Array A: [");
		for (int i = 0; i < A.length; i++) {
			if (i != A.length - 1)
				System.out.print(A[i] + ", ");
			else
				System.out.print(A[i]);
		}
		System.out.print("]\nArray B: [");
		for (int i = 0; i < B.length; i++) {
			if (i != B.length - 1)
				System.out.print(B[i] + ", ");
			else
				System.out.print(B[i]);
		}
		this.merge();
		System.out.print("]\nArray C: [");
		for (int i = 0; i < C.length; i++) {
			if (i != C.length - 1)
				System.out.print(C[i] + ", ");
			else
				System.out.print(C[i]);
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		ArrayMerge_Q12 obj = new ArrayMerge_Q12();
		obj.input();
		obj.display();
	}
}
