package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 31/5/2023
 */
public class CodeCheck_Q22 {
	// This array contains the allowed characters for the code.
	final static char[] codeChars = { 'A', 'C', 'E', 'G', 'I', 'K' };
	String code = "";
	int length = 0;

	/**
	 * The function takes user input for a code and its length, checks if the length matches the code, and
	 * throws an exception if it doesn't.
	 */
	void inputCode() throws RuntimeException {
		Scanner sysIn = new Scanner(System.in);
		System.out.print("N=");
		length = sysIn.nextInt();
		System.out.print("CODE: ");
		sysIn.nextLine();
		code = sysIn.nextLine();
		if (code.length() != length) {
			System.out.println("Length exceeded!");
			sysIn.close();
			throw new RuntimeException("Length doesn't match length of code.");
		}
		sysIn.close();
	}

	/**
	 * The function checks the validity of a string by comparing each character in the input string with a
	 * set of code characters and returns true if all characters are valid.
	 * 
	 * @param input The input parameter is a String that represents the input to be checked for validity.
	 * @return The method is returning a boolean value.
	 */
	boolean checkValidity(String input) {
		for (int ch = 0; ch < input.length(); ch++) {
			int count = 0;
			for (int in = 0; in < codeChars.length; in++) {
				if (input.charAt(ch) != codeChars[in]) {
					count++;
				}
			}
			if (count == codeChars.length) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The function checks the validity of a code and displays whether it is valid or invalid.
	 */
	void displayValidity() {
		if (checkValidity(code)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		CodeCheck_Q22 obj = new CodeCheck_Q22();
		obj.inputCode();
		obj.displayValidity();
	}
}
