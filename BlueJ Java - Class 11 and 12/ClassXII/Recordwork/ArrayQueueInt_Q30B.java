package ClassXII.Recordwork;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 1/8/2023
 */
public class ArrayQueueInt_Q30B {
	private int[] queue;
	private int front;
	private int rear;

	ArrayQueueInt_Q30B(int capacity) {
		queue = new int[capacity];
		front = -1;
		rear = -1;
	}

	/**
	 * Checks if the queue is empty.
	 *
	 * @return true if the queue is empty, false otherwise
	 */
	public boolean isEmpty() {
		return front == -1;
	}

	/**
	 * Enqueues an integer value into the queue.
	 *
	 * @param  val  The integer value to be enqueued.
	 */
	public void enqueue(int val) {
		if (rear == -1) {
			front = 0;
		}
		if (rear + 1 < queue.length) {
			queue[++rear] = val;
		}
		else {
			System.out.println("Queue full.");
		}
	}

	/**
	 * Removes and returns the element at the front of the queue.
	 *
	 * @return  the element at the front of the queue
	 */
	public int dequeue() {
		if (this.isEmpty()) {
			System.out.println("Queue empty.");
			return 0;
		}
		int val = queue[front];
		queue[front] = 0;
		if (front == rear) {
			front = -1;
		}
		else {
			front++;
		}
		return val;
	}
}
