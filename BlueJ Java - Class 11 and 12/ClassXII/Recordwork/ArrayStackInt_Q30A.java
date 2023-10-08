package ClassXII.Recordwork;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 1/8/2023
 */
public class ArrayStackInt_Q30A {
	private int[] stack;
	private int top;

	ArrayStackInt_Q30A(int capacity) {
		stack = new int[capacity];
		top = -1;
	}

	/**
	 * Checks if the stack is empty.
	 *
	 * @return true if the stack is empty, false otherwise
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * Pushes a value onto the stack.
	 *
	 * @param val the value to be pushed onto the stack
	 */
	public void push(int val) {
		stack[++top] = val;
	}

	/**
	 * Removes and returns the top element of the stack.
	 *
	 * @return the value of the element at the top of the stack,
	 *         or 0 if the stack is empty
	 */
	public int pop() {
		if (!this.isEmpty()) {
			int val = stack[top];
			stack[top--] = 0;
			return val;
		}
		return 0;
	}

	/**
	 * Returns the top element of the stack without removing it.
	 *
	 * @return the top element of the stack
	 */
	public int peek() {
		return stack[top];
	}
}