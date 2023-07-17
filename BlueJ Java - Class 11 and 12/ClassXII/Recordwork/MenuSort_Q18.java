package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Write a menu driven program to apply bubble, selection and insertion sort for an
 * integer array and a string.
 *
 * @author Vinaayak Gopala Dasika
 * @version 1.0
 */
public class MenuSort_Q18 {
	Scanner sysIn = new Scanner(System.in);

	/**
	 * The bubbleSort function sorts an array of integers in ascending order using the bubble
	 * sort algorithm.
	 * 
	 * @param arr The parameter "arr" is an array of integers that needs to be sorted using
	 *            the bubble sort algorithm.
	 * @return The method `bubbleSort` returns an array of integers.
	 */
	int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - (1 + i); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * The insertionSort function sorts an array of integers in ascending order using the
	 * insertion sort algorithm.
	 * 
	 * @param arr The parameter "arr" is an array of integers that needs to be sorted using
	 *            the insertion sort algorithm.
	 * @return The method `insertionSort` returns an array of integers.
	 */
	int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * The selectionSort function sorts an array of integers in ascending order using the
	 * selection sort algorithm.
	 * 
	 * @param arr The parameter "arr" is an array of integers that needs to be sorted using
	 *            the selection sort algorithm.
	 * @return The method is returning the sorted array.
	 */
	int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				// Find the index of the minimum element in the remaining unsorted portion of
				// the array
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Swap the minimum element with the first unsorted element
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		return arr;
	}

	/**
	 * The function implements the bubble sort algorithm to sort an array of strings in
	 * ascending order.
	 * 
	 * @param arr The parameter "arr" is an array of strings that needs to be sorted using the
	 *            bubble sort algorithm.
	 * @return The method is returning a sorted array of strings.
	 */
	String[] bubbleSort(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - (1 + i); j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * The insertionSort function sorts an array of strings in ascending order using the
	 * insertion sort algorithm.
	 * 
	 * @param arr An array of strings that needs to be sorted using the insertion sort
	 *            algorithm.
	 * @return The method is returning a sorted array of strings.
	 */
	String[] insertionSort(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j].compareTo(arr[j - 1]) < 0) {
					String temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * The selectionSort function sorts an array of strings in ascending order using the
	 * selection sort algorithm.
	 * 
	 * @param arr The parameter "arr" is an array of strings that needs to be sorted using the
	 *            selection sort algorithm.
	 * @return The method is returning a sorted array of strings.
	 */
	String[] selectionSort(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			String temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		return arr;
	}

	/**
	 * The function "displayArray" prints the elements of an integer array, separated by
	 * commas.
	 * 
	 * @param arr The parameter "arr" is an array of integers.
	 */
	void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.print(arr[i]);
		}
		System.out.println();
	}

	/**
	 * The function "displayArray" takes in an array of strings and prints each element
	 * separated by commas.
	 * 
	 * @param arr The parameter "arr" is an array of type String.
	 */
	void displayArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.print(arr[i]);
		}
		System.out.println();
	}

	/**
	 * The function takes user input to create an array of integers.
	 * 
	 * @return The method is returning an array of integers.
	 */
	int[] inputInt() {
		System.out.println("Enter the number of elements to enter.");
		int size = Integer.parseInt(sysIn.nextLine());
		int[] arr = new int[size];
		System.out.println("Enter the elements.");
		for (int i = 0; i < size; i++) {
			arr[i] = sysIn.nextInt();
		}
		return arr;
	}

	/**
	 * The function takes user input to create an array of strings with a specified size.
	 * 
	 * @return The method is returning an array of strings.
	 */
	String[] inputString() {
		System.out.println("Enter the number of elements to enter.");
		int size = sysIn.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter the elements.");
		for (int i = 0; i < size; i++) {
			arr[i] = sysIn.nextLine();
		}
		return arr;
	}

	/**
	 * The start() function prompts the user to choose between sorting a String Array or an
	 * Integer Array and then calls the respective functions based on the user's choice.
	 */
	void start() {
		System.out.println("Choose whether to sort a String Array or a Integer Array (sysIn/i)");
		char si = sysIn.next().toLowerCase().charAt(0);
		switch (si) {
		case 's':
			System.out.println("String Array selected.");
			stringArray();
			break;
		case 'i':
			System.out.println("Integer Array selected.");
			integerArray();
			break;
		default:
			System.out.println("Invalid option chosen.");
			start();
		}
	}

	/**
	 * The function takes an input string array, prompts the user to choose a sorting
	 * technique, and then sorts and displays the array based on the chosen technique.
	 */
	void stringArray() {
		String[] input = inputString();
		System.out.println("Choose the sorting technique.");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Selection Sort");
		System.out.println("3. Insertion Sort");
		int choice = sysIn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Bubble Sort selected.");
			System.out.println("Original Array:");
			displayArray(input);
			System.out.println("Sorted Array:");
			displayArray(bubbleSort(input));
			break;
		case 2:
			System.out.println("Selection Sort selected.");
			System.out.println("Original Array:");
			displayArray(input);
			System.out.println("Sorted Array:");
			displayArray(selectionSort(input));
			break;
		case 3:
			System.out.println("Insertion Sort selected.");
			System.out.println("Original Array:");
			displayArray(input);
			System.out.println("Sorted Array:");
			displayArray(insertionSort(input));
			break;
		default:
			System.out.println("Invalid option chosen.");
			stringArray();
		}
	}

	/**
	 * The function takes an input integer array, prompts the user to choose a sorting
	 * technique, and then sorts and displays the array based on the chosen technique.
	 */
	void integerArray() {
		int[] input = inputInt();
		System.out.println("Choose the sorting technique.");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Selection Sort");
		System.out.println("3. Insertion Sort");
		int choice = sysIn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Bubble Sort selected.");
			System.out.println("Original Array:");
			displayArray(input);
			System.out.println("Sorted Array:");
			displayArray(bubbleSort(input));
			break;
		case 2:
			System.out.println("Selection Sort selected.");
			System.out.println("Original Array:");
			displayArray(input);
			System.out.println("Sorted Array:");
			displayArray(selectionSort(input));
			break;
		case 3:
			System.out.println("Insertion Sort selected.");
			System.out.println("Original Array:");
			displayArray(input);
			System.out.println("Sorted Array:");
			displayArray(insertionSort(input));
			break;
		default:
			System.out.println("Invalid option chosen.");
			integerArray();
		}
		sysIn.close();
	}

	public static void main(String[] args) {
		MenuSort_Q18 obj = new MenuSort_Q18();
		obj.start();
	}
}
