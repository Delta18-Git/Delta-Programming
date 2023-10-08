package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 31/7/2023
 */
public class LinkedListMain_Q27 {
	LinkedList_Q27B list = new LinkedList_Q27B();
	Scanner sysIn = new Scanner(System.in);

	/**
	 * Starts the program by taking user input, creating a list, and printing the list.
	 *
	 */
	void start() {
		System.out.println("Enter the length of the list.");
		int x = sysIn.nextInt();
		System.out.println("Enter " + x + " numbers.");
		for (int i = 0; i < x; i++) {
			list.insert(sysIn.nextInt());
		}
		System.out.println(list.toString());
	}

	/**
	 * Displays a menu of choices and performs the chosen operation.
	 *
	 */
	void menu() {
		String invalid = "Invalid choice.";
		String choice2 = "Choice (1/2): ";
		String choice3 = "Choice (1/2/3): ";
		System.out.println("Choose from the following:");
		System.out.println("1. Insertion");
		System.out.println("2. Deletion");
		System.out.print(choice2);
		int c = 0;
		while (true) {
			c = sysIn.nextInt();
			if (c > 2 || c < 1) {
				System.out.println(invalid);
				System.out.print(choice2);
			}
			else {
				break;
			}
		}
		System.out.println("Choose from the following:");
		int cc = 0;
		switch (c) {
		case 1:
			System.out.println("1. Insert at the beginning of the list.");
			System.out.println("2. Insert in the middle of the list.");
			System.out.println("3. Insert at the end of the list.");
			System.out.print(choice3);
			while (true) {
				cc = sysIn.nextInt();
				if (cc > 3 || cc < 1) {
					System.out.println(invalid);
					System.out.print(choice3);
				}
				else {
					break;
				}
			}
			System.out.print("Value to be inserted: ");
			int val = sysIn.nextInt();
			list.insert(val, cc);
			System.out.println(list.toString());
			break;
		case 2:
			System.out.println("1. Delete the beginning of the list.");
			System.out.println("2. Delete from the middle of the list.");
			System.out.println("3. Delete the end of the list.");
			System.out.print(choice3);
			while (true) {
				cc = sysIn.nextInt();
				if (cc > 3 || cc < 1) {
					System.out.println(invalid);
					System.out.print(choice3);
				}
				else {
					break;
				}
			}
			list.delete(cc);
			System.out.println(list.toString());
			break;
		default:
			System.out.println(invalid + " End of menu.");
		}
	}

	public static void main(String[] args) {
		LinkedListMain_Q27 obj = new LinkedListMain_Q27();
		obj.start();
		obj.menu();
		obj.sysIn.close();
	}
}