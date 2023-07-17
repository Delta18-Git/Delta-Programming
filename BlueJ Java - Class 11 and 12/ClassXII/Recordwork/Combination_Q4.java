package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Write a program to enter any number from 2 to 5, both inclusive, and print all the
 * combinations of digits starting from one to that number. There should be one blank
 * space between each digit and each new combination should appear on a new line. Also
 * display the total number of combinations for the given input. Basically, find all
 * permutations of digits.
 *
 * @author Vinaayak Gopala Daska
 * @version 28/6/2023
 */
public class Combination_Q4 {
	int n;
	String num;

	/**
	 * The input() function takes user input for a limit, checks if it is within the specified
	 * bounds, and generates a string of numbers from 1 to the limit.
	 */
	public void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter the limit, within 2 to 5 both inclusive.");
		n = sysIn.nextInt();
		if (n < 2 || n > 5) {
			sysIn.close();
			System.out.println("The number is not in bounds.");
			throw new RuntimeException("The number is not in bounds.");
		}
		sysIn.close();
		StringBuffer numb = new StringBuffer(n);
		for (int i = 1; i <= n; i++) {
			numb.append(i);
		}
		num = numb.toString();
	}

	public static void main(String[] args) {
		Combination_Q4 obj = new Combination_Q4();
		obj.input();
		obj.combination();
	}

	/**
	 * The function calculates the number of combinations possible for a given input.
	 */
	void combination() {
		permutation(num, 0, num.length() - 1);
		System.out.print("Number of combinations = ");
		int f = 1;
		for (int i = 2; i <= n; i++) {
			f *= i;
		}
		System.out.println(f);
	}

	/**
	 * The function generates all possible permutations of a given string.
	 * 
	 * @param str      The string that you want to generate permutations for.
	 * @param startIdx The start index of the substring that we are permuting.
	 * @param endIdx   The endIdx parameter represents the index of the last character in the
	 *                 string.
	 */
	private void permutation(String str, int startIdx, int endIdx) {
		// The condition `if (startIdx == endIdx)` checks if we have reached the end of the
		// string. If
		// the start index is equal to the end index, it means that we have generated a
		// permutation of
		// the entire string. In this case, we print the permutation.
		if (startIdx == endIdx)
			System.out.println(str);
		else {
			for (int i = startIdx; i <= endIdx; i++) {
				// calling user-defined swapping method
				str = swapChar(str, startIdx, i);
				permutation(str, startIdx + 1, endIdx);
				str = swapChar(str, startIdx, i);
			}
		}
	}

	/**
	 * The function swaps two characters in a given string and returns the modified string.
	 * 
	 * @param str The input string that you want to swap characters in.
	 * @param i   The parameter "i" represents the index of the first character to be swapped
	 *            in the string.
	 * @param j   The parameter "j" in the above code represents the index of the second
	 *            character that needs to be swapped with the character at index "i".
	 * @return The method is returning a string after swapping two characters in the input
	 *         string.
	 */
	private String swapChar(String str, int i, int j) {
		char temp;
		// converts string into character array
		char[] chArray = str.toCharArray();
		temp = chArray[i];
		chArray[i] = chArray[j];
		chArray[j] = temp;
		// returns string after swapping
		return String.valueOf(chArray);
	}
}
