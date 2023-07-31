package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Write a program to calculate the frequency of characters and words in a given string,
 * and displays the number of words, vowels, and uppercase letters in the string.
 *
 * @author Vinaayak Gopala Dasika
 * @version 21/6/2023
 */
public class Frequency_Q19 {
	String input = "";
	char[] char_string;
	int[] char_frequency;
	String[] words_string;
	int[] words_frequency;
	int words_number = 0;
	int vowels_number = 0;
	int upper_number = 0;

	/**
	 * The function prompts the user to enter a string and stores the input in a variable.
	 */
	void input() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Enter a string.");
		input = sysIn.nextLine();
		sysIn.close();
	}

	/**
	 * The function initializes arrays to store the characters and words from an input string,
	 * as well as their respective frequencies.
	 */
	void init() {
		char_string = input.toCharArray();
		char_frequency = new int[char_string.length];
		words_string = input.split("\\W");
		words_number = words_string.length;
		words_frequency = new int[words_number];
	}

	/**
	 * The function counts the number of uppercase characters and vowels in a given string.
	 */
	void charNumber() {
		char temp;
		for (int i = 0; i < char_string.length; i++) {
			if (Character.isUpperCase(char_string[i])) {
				upper_number++;
			}
			temp = Character.toUpperCase(char_string[i]);
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
				vowels_number++;
			}
		}
	}

	/**
	 * The function calculates the frequency of each character in a given string and stores it
	 * in an array.
	 */
	void charFreq() {
		char current;
		for (int i = 0; i < char_string.length; i++) {
			current = char_string[i];
			if (current == '‪') {
				char_frequency[i] = Integer.MAX_VALUE;
				continue;
			}
			for (int j = i + 1; j < char_string.length; j++) {
				if (char_string[j] == char_string[i]) {
					char_frequency[i]++;
					/*
					 * U+202A is used as a marker to indicate that the character at index `j` has already been
					 * counted in the frequency calculation and should be skipped in future iterations.
					 */
					char_string[j] = '‪';
				}
			}
		}
	}

	/**
	 * The function "wordFreq" calculates the frequency of each word in an array of strings
	 * and stores the frequencies in another array.
	 */
	void wordFreq() {
		String current;
		for (int i = 0; i < words_string.length; i++) {
			current = words_string[i];
			if (current.isEmpty()) {
				words_frequency[i] = Integer.MAX_VALUE;
				continue;
			}
			for (int j = i + 1; j < words_string.length; j++) {
				if (words_string[j].equalsIgnoreCase(words_string[i])) {
					words_frequency[i]++;
					words_string[j] = "";
				}
			}
		}
	}

	/**
	 * The display function prints out various statistics about the input text, such as the
	 * number of words, number of vowels, number of uppercase letters, and the frequency of
	 * each character and word.
	 */
	void display() {
		System.out.println("Number of words = " + words_number);
		System.out.println("Number of vowels = " + vowels_number);
		System.out.println("Number of uppercase letters = " + upper_number);
		for (int a = 0; a < char_frequency.length; a++) {
			if (char_frequency[a] == Integer.MAX_VALUE) {
				continue;
			}
			System.out.println(char_string[a] + " - " + (char_frequency[a] + 1));
		}
		for (int a = 0; a < words_frequency.length; a++) {
			if (words_frequency[a] == Integer.MAX_VALUE) {
				continue;
			}
			System.out.println(words_string[a] + " - " + (words_frequency[a] + 1));
		}
	}

	public static void main(String[] args) {
		Frequency_Q19 obj = new Frequency_Q19();
		obj.input();
		obj.init();
		obj.charNumber();
		obj.charFreq();
		obj.wordFreq();
		obj.display();
	}
}
