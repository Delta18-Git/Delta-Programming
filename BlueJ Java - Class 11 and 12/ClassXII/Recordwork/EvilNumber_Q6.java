package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 1.0
 */
public class EvilNumber_Q6 {
	String binary = "";
	final int base = 2;

	/**
	 * The function takes a decimal number as input, converts it to binary, and checks if it
	 * is an evil number.
	 */
	void convert() {
		Scanner sysIn = new Scanner(System.in);
		System.out.print("ENTER A NUMBER TO CHECK IF IT IS AN EVIL NUMBER: ");
		int dec = sysIn.nextInt();
		System.out.print("BINARY REPRESENTATION OF " + dec);
		while (dec > 0) {
			int d = dec % base;
			dec /= base;
			binary = d + binary;
		}
		System.out.println(" IS: " + binary);
		sysIn.close();
	}

	/**
	 * The function "evilno" checks if the number of '1's in a binary string is odd.
	 * 
	 * @return The method is returning a boolean value. It returns true if the number of '1's
	 *         in the binary string is odd, and false if it is even.
	 */
	boolean evilno() {
		int out = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1')
				out++;
		}
		return out % 2 != 0;
	}

	/**
	 * The function checks if a number is an evil number and prints the corresponding message.
	 */
	void print() {
		if (evilno()) {
			System.out.print("EVIL NUMBER");
		}
		else {
			System.out.print("NOT AN EVIL NUMBER");
		}
	}

	public static void main() {
		EvilNumber_Q6 obj = new EvilNumber_Q6();
		obj.convert();
		obj.print();
	}
}
