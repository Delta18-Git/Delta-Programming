package ClassXII;

import java.util.Scanner;

/**
 * The SuperNumber class converts a decimal number to binary and determines if it is a
 * super number (a number with an even number of 1s in its binary representation).
 *
 * @author Vinaayak Gopala Dasika
 * @version 1.0
 */
public class SuperNumber {
	String binary = "";
	final int base = 2;

	/**
	 * The function takes a decimal number as input and converts it into its binary
	 * representation.
	 */
	void convert() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER TO CHECK IF IT IS A SUPER NUMBER: ");
		int dec = Sc.nextInt();
		System.out.print("BINARY REPRESENTATION OF " + dec);
		while (dec > 0) {
			int d = dec % base;
			dec /= base;
			binary = d + binary;
		}
		System.out.println(" IS: " + binary);
	}

	/**
	 * The function "superno" checks if the number of '1's in a binary string is even.
	 * 
	 * @return The method is returning a boolean value. It returns true if the number of '1'
	 *         characters in the binary string is even, and false otherwise.
	 */
	boolean superno() {
		int out = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1')
				out++;
		}
		return out % 2 == 0;
	}

	/**
	 * The function checks if a number is a super number and prints the corresponding message.
	 */
	void print() {
		if (superno())
			System.out.print("SUPER NUMBER");
		else
			System.out.print("NOT A SUPER NUMBER");
	}

	public static void main(String[] args) {
		SuperNumber obj = new SuperNumber();
		obj.convert();
		obj.print();
	}
}
