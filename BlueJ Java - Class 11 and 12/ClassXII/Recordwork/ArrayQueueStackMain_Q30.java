package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 1/8/2023
 */
public class ArrayQueueStackMain_Q30 {
	ArrayStackInt_Q30A stack;
	ArrayQueueInt_Q30B queue;
	Scanner sysIn = new Scanner(System.in);
	boolean st;

	/**
	 * Starts the program by prompting the user to choose between a Stack or a Queue.
	 * If the user chooses Stack, a new ArrayStackInt_Q30A with the specified length is created,
	 * and the user is prompted to input the numbers to be pushed onto the stack.
	 * If the user chooses Queue, a new ArrayQueueInt_Q30B with the specified length is created,
	 * and the user is prompted to input the numbers to be enqueued into the queue.
	 *
	 */
	void start() {
		System.out.println("Choose from the following:");
		System.out.println("1. Stack");
		System.out.println("2. Queue");
		System.out.print("Choice (1/2): ");
		int x = sysIn.nextInt();
		if (x == 1) {
			st = true;
		}
		else if (x == 2) {
			st = false;
		}
		else {
			System.out.println("Invalid choice.");
		}
		System.out.print("Enter the length of the array: ");
		int s = sysIn.nextInt();
		System.out.println("Enter " + s + " numbers.");
		if (st) {
			stack = new ArrayStackInt_Q30A(s);
			for (int i = 0; i < s; i++) {
				stack.push(sysIn.nextInt());
			}
		}
		else {
			queue = new ArrayQueueInt_Q30B(s);
			for (int i = 0; i < s; i++) {
				queue.enqueue(sysIn.nextInt());
			}
		}
	}

	/**
	 * Displays a menu and prompts the user to choose between insertion and deletion operations.
	 * If the user enters an invalid choice, they are prompted again until a valid choice is made.
	 * Depending on the choice and the value of the 'st' variable, the function either pushes a value
	 * onto a stack or enqueues a value into a queue. If the choice is deletion, the function either
	 * pops a value from the stack or dequeues a value from the queue.
	 *
	 */
	void menu() {
		String invalid = "Invalid choice.";
		String choice2 = "Choice (1/2): ";
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
		if (st) {
			if (c == 1) {
				System.out.println("Value to be pushed onto stack: ");
				stack.push(sysIn.nextInt());
			}
			else {
				System.out.println("Value popped from stack: " + stack.pop());
			}
		}
		else {
			if (c == 1) {
				System.out.println("Value to be enqueued into queue: ");
				queue.enqueue(sysIn.nextInt());
			}
			else {
				System.out.println("Value dequeued from queue: " + queue.dequeue());
			}
		}
	}

	public static void main(String[] args) {
		ArrayQueueStackMain_Q30 obj = new ArrayQueueStackMain_Q30();
		obj.start();
		obj.menu();
		obj.sysIn.close();
	}
}
