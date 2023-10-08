package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 15/7/2023
 */
public class ArrayInsert_Q16 {
	int[] arr = new int[100];
	int len = Integer.MAX_VALUE;
	Scanner sysIn = new Scanner(System.in);

	
	/**
	 * Prints the elements of an integer array.
	 *
	 * @param  array  the array containing the elements to be printed
	 */
	void printArray(int[] array) {
		System.out.println("Array Elements:");
		for (int i = 0; i < len - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[len - 1]);
	}

	
	/**
	 * Reads user input for the number of elements and the elements themselves.
	 *
	 */
	void input() {
		System.out.print("Enter number of elements: ");
		len = sysIn.nextInt();
		System.out.println("Enter elements:");
		for (int i = 0; i < len; i++) {
			arr[i] = sysIn.nextInt();
		}
		sysIn.close();
	}

	
    /**
     * This function performs the insertion operation in an array.
     *
     */
	void insertion() {
		System.out.println("INSERTION");
		System.out.print("Enter number to be inserted: ");
		int n = sysIn.nextInt();
		System.out.println("Enter position to be inserted to: ");
		int pos = sysIn.nextInt();
		for (int i = len + 1; i > pos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos] = n;
		++len;
	}

	
	/**
	 * Deletes an element from the array based on the user's choice.
	 *
	 */
	void deletion() {
		System.out.println("DELETION");
		System.out.print("Delete by:\n1. Location\n2.Element\nChoice [1/2]: ");
		int c = sysIn.nextInt();
		if (c == 1) {
			System.out.println("Enter position to be deleted at: ");
			int pos = sysIn.nextInt();
			if (pos > len) {
				System.out.println("No element at position " + pos);
			}
			else {
				for (int i = pos; i < len - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[len] = 0;
				--len;
			}
		}
		else if (c == 2) {
			System.out.print("Enter number to be deleted: ");
			int n = sysIn.nextInt();
			int pos = Integer.MIN_VALUE;
			for (int i = 0; i < len; i++) {
				if (arr[i] == n) {
					pos = i;
					break;
				}
			}
			if (pos != Integer.MIN_VALUE) {
				for (int i = pos; i < len - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[len] = 0;
				--len;
			}
		}
	}

	public static void main(String[] args) {
		ArrayInsert_Q16 obj = new ArrayInsert_Q16();
		obj.input();
		obj.insertion();
		obj.printArray(obj.arr);
		obj.deletion();
		obj.printArray(obj.arr);
	}
}