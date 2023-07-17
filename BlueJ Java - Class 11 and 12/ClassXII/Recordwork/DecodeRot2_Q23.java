package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 24/5/2023
 */
public class DecodeRot2_Q23 {
	String S;
	StringBuilder out = new StringBuilder(200);

	/**
	 * The function prompts the user to enter a sentence, converts it to uppercase, checks if
	 * it exceeds 200 characters, and throws a RuntimeException if it does.
	 */
	void input() throws RuntimeException {
		System.out.println("Enter a sentence.");
		Scanner sysIn = new Scanner(System.in);
		S = sysIn.nextLine().toUpperCase();
		if ((S.length()) > 200) {
			System.out.println("The sentence can only accept 200 characters.");
			sysIn.close();
			throw new RuntimeException("Too many characters in input.");
		}
		sysIn.close();
	}

	/**
	 * The function splits a given string by "KK" and then applies a ROT2 encryption to each
	 * word, converting the letters to the next two letters in the alphabet (wrapping around
	 * from 'Y' to 'A'), and finally converts all but the first letter of each word to
	 * lowercase and appends a space after each word.
	 */
	void splitRot() {
		String[] words = S.split("KK");
		String[] rot2 = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			rot2[i] = "";
			for (int j = 0; j < word.length(); j++) {
				char letter = word.charAt(j);
				boolean alphabet = Character.isLetter(letter);
				if (alphabet) {
					if (letter >= 'Y') {
						int offset = 26 - 2;
						letter -= offset;
					}
					else {
						letter += 2;
					}
					rot2[i] += letter;
				}
			}
		}
		for (int i = 0; i < rot2.length; i++) {
			String current = rot2[i];
			if (current.equals("")) {
				out.append("");
				continue;
			}
			for (int j = 0; j < current.length(); j++) {
				char ch = current.charAt(j);
				if (j != 0) {
					ch = Character.toLowerCase(ch);
				}
				out.append(ch);
			}
			out.append(" ");
		}
	}

	public static void main(String[] args) {
		DecodeRot2_Q23 obj = new DecodeRot2_Q23();
		obj.input();
		obj.splitRot();
		System.out.println(obj.out.toString());
	}
}
