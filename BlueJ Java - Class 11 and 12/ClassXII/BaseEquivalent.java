package ClassXII;

import java.util.Scanner;

/**
 * The BaseEquivalent class in Java allows the user to input two numbers and determines if
 * they are equivalent in any base.
 *
 * @author Vinaayak Gopala Dasika
 * @version 14/6/2023
 */
public class BaseEquivalent {
	int[] num1, num2;
	String n1, n2;

	BaseEquivalent() {
		num1 = new int[20];
		num2 = new int[20];
		n1 = "";
		n2 = "";
	}

	/**
	 * The function prompts the user to enter two numbers and stores them in variables n1 and
	 * n2.
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter two numbers.");
		n1 = sysIn.next().toUpperCase();
		n2 = sysIn.next().toUpperCase();
		sysIn.close();
	}

	/**
	 * The function base_change takes a number represented as a string and a base, and
	 * converts it to its decimal equivalent.
	 * 
	 * @param num  The parameter "num" is a String representing a number in a given base.
	 * @param base The "base" parameter represents the base of the number system that the
	 *             input "num" is in. For example, if "num" is a binary number, the base would
	 *             be 2. If "num" is a hexadecimal number, the base would be 16.
	 * @return The method is returning the sum of the converted number in the specified base.
	 */
	int base_change(String num, int base) {
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			int j;
			if (ch < 'A' || ch > 'Z') {
				j = Integer.parseInt("" + ch);
			}
			else {
				j = (ch - 'A') + 10;
			}
			int mult = (int) Math.pow(base, num.length() - i - 1.0);
			sum += j * mult;
		}
		return sum;
	}

	/**
	 * The function "basecalc" takes a string as input and returns the maximum value found in
	 * the string, considering both numeric and alphabetic characters.
	 * 
	 * @param n The parameter `n` is a string representing a number in a certain base.
	 * @return The method is returning the maximum value found in the given string 'n'.
	 */
	int basecalc(String n) {
		int chk = Integer.MIN_VALUE;
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			int j;
			if (ch < 'A' || ch > 'Z') {
				j = Integer.parseInt("" + ch);
			}
			else {
				j = (ch - 'A') + 10;
			}
			chk = Math.max(j, chk);
		}
		return chk;
	}

	/**
	 * The function `calcarray` calculates the base conversion of two numbers and checks if
	 * there is a base in which the numbers are equal.
	 */
	void calcarray() {
		for (int i = basecalc(n1); i <= 20; i++) {
			num1[i - 1] = base_change(n1, i);
		}
		for (int i = basecalc(n2); i <= 20; i++) {
			num2[i - 1] = base_change(n2, i);
		}
		boolean flag = false;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (num1[i] == num2[j]) {
					System.out.println(n1 + " (base " + (i + 1) + ") = " + n2 + " (base " + (j + 1) + ")");
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		if (!flag) {
			System.out.println(n1 + " is not equal to " + n2 + "in any base.");
		}
	}

	public static void main(String[] args) {
		BaseEquivalent obj = new BaseEquivalent();
		obj.input();
		obj.calcarray();
	}
}
