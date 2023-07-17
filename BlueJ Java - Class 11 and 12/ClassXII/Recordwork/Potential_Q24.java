package ClassXII.Recordwork;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * The class takes a sentence as input, calculates the potential of each word based on the
 * sum of ASCII values of its characters, and then sorts and prints the words in ascending
 * order of their potential.
 * 
 * @author Vinaayak Gopala Dasika
 * @version 24/5/2023
 */
public class Potential_Q24 {
	String S;

	/**
	 * The function prompts the user to enter a sentence and checks if it ends with a full
	 * stop, question mark, or exclamation mark. If not, it throws a RuntimeException.
	 */
	void input() throws RuntimeException {
		System.out.println("Enter a sentence, ending with a full stop, question mark or exclamation mark only.");
		Scanner sysIn = new Scanner(System.in);
		S = sysIn.nextLine();
		if (S.charAt(S.length() - 1) != '.' && S.charAt(S.length() - 1) != '?' && S.charAt(S.length() - 1) != '!') {
			System.out.println("The sentence doesn't end with a full stop, question mark or exclamation mark.");
			throw new RuntimeException("Improper sentence termination.");
		}
		sysIn.close();
	}

	/**
	 * The function "potential" takes a string input, calculates the potential of each word
	 * based on the sum of ASCII values of its characters, and then prints the words along
	 * with their potentials in ascending order.
	 */
	void potential() {
		StringTokenizer tokenizer = new StringTokenizer(S, ".?! ");
		String[] words = new String[tokenizer.countTokens()];
		int[] potential = new int[words.length];
		int[] potential_sorted = new int[words.length];
		int i = 0;
		while (tokenizer.hasMoreTokens()) {
			words[i++] = tokenizer.nextToken();
		}
		int x;
		for (x = 0; x < words.length; x++) {
			int l = words[x].length();
			for (int y = 0; y < l; y++) {
				int val = words[x].charAt(y);
				potential[x] = potential[x] + val;
				potential_sorted[x] = potential_sorted[x] + val;
			}
		}
		for (x = 0; x < words.length; x++) {
			if (x != (words.length - 1)) {
				System.out.print(words[x] + "=" + potential[x] + ", ");
			}
			else {
				System.out.println(words[x] + "=" + potential[x]);
			}
		}
		for (x = 0; x < potential.length - 1; x++) {
			for (int y = 0; y < potential.length - x - 1; y++) {
				if (potential_sorted[y] > potential_sorted[y + 1]) {
					int swap = potential_sorted[y];
					potential_sorted[y] = potential_sorted[y + 1];
					potential_sorted[y + 1] = swap;
				}
			}
		}
		for (int j = 0; j < potential.length; j++) {
			for (int k = 0; k < potential_sorted.length; k++) {
				if (potential[k] == potential_sorted[j]) {
					System.out.print(words[k] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Potential_Q24 obj = new Potential_Q24();
		obj.input();
		obj.potential();
	}
}
