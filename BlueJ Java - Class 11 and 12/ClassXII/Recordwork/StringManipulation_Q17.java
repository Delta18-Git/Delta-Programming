package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 15/7/2023
 */
public class StringManipulation_Q17 {
	String in;
	String[] words;
	boolean[] palindrome;

	/**
	 * The function takes a string and a boolean value as input, and returns a new string
	 * where the characters are reversed and if the boolean value is true, any vowel in the
	 * original string is replaced with the letter 'A' at the end of the new string.
	 * 
	 * @param a     The parameter "a" is a string that represents the input string that we
	 *              want to reverse.
	 * @param vowel The "vowel" parameter is a boolean value that determines whether or not to
	 *              append an 'A' character to the reversed string if the original character
	 *              is a vowel. If "vowel" is true, an 'A' character will be appended for
	 *              vowels, otherwise the original character will be appended
	 * @return The method is returning a string that is the reverse of the input string 'a'.
	 */
	String reverse(String a, boolean vowel) {
		StringBuffer aa = new StringBuffer(a);
		for (int i = a.length() - 1; i >= 0; i--) {
			char c = Character.toUpperCase(a.charAt(i));
			if (vowel && (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
				aa.append('A');
			}
			else {
				aa.append(a.charAt(i));
			}
		}
		return aa.toString();
	}

	/**
	 * The function takes a string as input and shifts each letter in the string two positions
	 * to the right, wrapping around from 'Z' to 'A' and replacing vowels with 'A'.
	 * 
	 * @param a The parameter "a" is a string that represents the input string.
	 * @return The method is returning a modified version of the input string 'a'.
	 */
	String shift(String a) {
		StringBuffer aa = new StringBuffer(a);
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			boolean alphabet = Character.isLetter(c);
			if (alphabet) {
				if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
					c = 'A';
				}
				else if (c >= 'Y') {
					int offset = 26 - 2;
					c -= offset;
				}
				else {
					c += 2;
				}
			}
			aa.append(c);
		}
		return aa.toString();
	}

	/**
	 * The function checks if a given string is a palindrome by comparing it to its reverse.
	 * 
	 * @param a The parameter "a" is a string that represents the input value that we want to
	 *          check if it is a palindrome.
	 * @return The method is returning a boolean value. It returns true if the given string is
	 *         a palindrome (reads the same forwards and backwards), and false otherwise.
	 */
	boolean palindrome(String a) {
		if (reverse(a.toLowerCase(), false).equals(a.toLowerCase())) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * The function "longest" takes an array of strings as input and returns the longest
	 * string in the array.
	 * 
	 * @param arr An array of strings
	 * @return The longest string in the array.
	 */
	String longest(String[] arr) {
		String lon = "";
		int maxlen = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (maxlen < arr[i].length()) {
				lon = arr[i];
				maxlen = lon.length();
			}
		}
		return lon;
	}

	/**
	 * The function initializes a string input, splits it into words, and creates a boolean
	 * array to store whether each word is a palindrome or not.
	 */
	void init() {
		System.out.println("Enter a string of characters.");
		Scanner sysIn = new Scanner(System.in);
		in = sysIn.nextLine();
		sysIn.close();
		words = in.split("\\W");
		palindrome = new boolean[words.length];
	}

	/**
	 * The function "manip" performs various manipulations on a given input string and array
	 * of words.
	 */
	void manip() {
		StringBuffer out = new StringBuffer(in);
		for (int i = 0; i < palindrome.length; i++) {
			palindrome[i] = palindrome(words[i]);
		}
		for (int i = 0; i < words.length; i++) {
			if (i + 1 % 2 == 0) {
				out.append(shift(words[i]));
			}
			else {
				out.append(reverse(words[i], true));
			}
		}
		String big = longest(words);
		System.out.println("PALINDROMES: ");
		for (int i = 0; i < palindrome.length; i++) {
			if (palindrome[i]) {
				System.out.println(words[i]);
			}
		}
		System.out.println("Longest word: " + big);
		System.out.println("Manipulated String: " + out.toString());
	}

	public static void main(String[] args) {
		StringManipulation_Q17 obj = new StringManipulation_Q17();
		obj.init();
		obj.manip();
	}
}
