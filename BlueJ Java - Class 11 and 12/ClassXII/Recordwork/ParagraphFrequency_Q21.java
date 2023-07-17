package ClassXII.Recordwork;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 31/5/2023
 */
public class ParagraphFrequency_Q21 {
	String input;
	String[] words;
	int[] frequency;
	int[] frequency_sorted;
	StringTokenizer sentences;

	/**
	 * The function takes user input of 1-3 sentences, separated by '.' or '?', converts it to
	 * uppercase, checks the number of sentences, and splits the input into words.
	 */
	void input() throws RuntimeException {
		System.out.println("Enter 1-3 sentences, separated by '.' or '?'");
		Scanner sysIn = new Scanner(System.in);
		input = sysIn.nextLine().toUpperCase();
		sysIn.close();
		sentences = new StringTokenizer(input, "?.");
		if (sentences.countTokens() > 3) {
			System.out.println("There are too many sentences.");
			throw new RuntimeException("Too many sentences input.");
		}
		else if (sentences.countTokens() < 1) {
			System.out.println("There are too few sentences.");
			throw new RuntimeException("No sentences input.");
		}
		words = input.split("\\W");
	}

	/**
	 * The countWords() function counts the number of words in an array and prints the result.
	 */
	void countWords() {
		int words = this.words.length - 1;
		System.out.println("There are " + words + " words.");
	}

	/**
	 * The function "arrangeFrequency" calculates the frequency of words in an array, sorts
	 * the frequencies in ascending order, and prints the corresponding words.
	 */
	void arrangeFrequency() {
		frequency = new int[words.length];
		frequency_sorted = new int[frequency.length];
		for (int i = 0; i < words.length; i++) {
			String current = words[i];
			if (current.isEmpty()) {
				frequency[i] = Integer.MAX_VALUE;
				frequency_sorted[i] = Integer.MAX_VALUE;
				continue;
			}
			for (int j = i + 1; j < words.length; j++) {
				if (words[j].equals(words[i])) {
					frequency[i]++;
					frequency_sorted[i]++;
					words[j] = "";
				}
			}
		}
		for (int x = 0; x < frequency.length - 1; x++) {
			for (int y = 0; y < frequency.length - x - 1; y++) {
				if (frequency_sorted[y] > frequency_sorted[y + 1]) {
					int swap = frequency_sorted[y];
					frequency_sorted[y] = frequency_sorted[y + 1];
					frequency_sorted[y + 1] = swap;
				}
			}
		}
		for (int a = 0; a < frequency.length; a++) {
			if (frequency[a] == Integer.MAX_VALUE) {
				continue;
			}
			for (int b = 0; b < frequency_sorted.length; b++) {
				if (frequency[a] == frequency_sorted[b]) {
					System.out.print(words[a] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		ParagraphFrequency_Q21 obj = new ParagraphFrequency_Q21();
		obj.input();
		obj.countWords();
		obj.arrangeFrequency();
	}
}
