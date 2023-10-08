package ClassXII.Recordwork;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 31/7/2023
 */
public class LinkedList_Q27B {
	private Node_Q27A start;
	private int size;

	LinkedList_Q27B() {
		start = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	void insert(int val, int choice) {
		Node_Q27A newNode = new Node_Q27A(val, null);
		if (choice == 1) {
			newNode.setLink(start);
			start = newNode;
		}
		else if (choice == 2) {
			Node_Q27A save = this.atIndex(size / 2);
			Node_Q27A pointer = save.getLink();
			save.setLink(newNode);
			newNode.setLink(pointer);
		}
		else if (choice == 3) {
			Node_Q27A save = this.atIndex(size - 1);
			save.setLink(newNode);
		}
	}

	void insert(int val) {
		Node_Q27A newNode = new Node_Q27A(val, null);
		Node_Q27A save = null;
		Node_Q27A pointer;
		boolean inserted = false;
		if (this.isEmpty()) {
			start = newNode;
		}
		else if (val <= start.getData()) {
			newNode.setLink(start);
			start = newNode;
		}
		else {
			save = start;
			pointer = start.getLink();
			while (pointer != null) {
				if (val >= save.getData() && val <= pointer.getData()) {
					save.setLink(newNode);
					newNode.setLink(pointer);
					inserted = true;
					break;
				}
				else {
					save = pointer;
					pointer = pointer.getLink();
				}
			}
			if (!inserted) {
				save.setLink(newNode);
			}
		}
		size++;
	}

	void delete(int choice) {
		if (choice == 1) {
			start = start.getLink();
		}
		else if (choice == 2) {
			Node_Q27A save = this.atIndex(size / 2 - 1);
			Node_Q27A pointer = save.getLink().getLink();;
			save.setLink(pointer);
		}
		else if (choice == 3) {
			Node_Q27A save = this.atIndex(size - 2);
			save.setLink(null);
		}
	}

	Node_Q27A atIndex(int index) {
		Node_Q27A pointer = start;
		for (int i = 0; i < index; i++) {
			pointer = pointer.getLink();
		}
		return pointer;
	}

	public String toString() {
		StringBuffer out = new StringBuffer();
		out.append("List: ");
		Node_Q27A pointer = this.start;
		while (pointer.getLink() != null) {
			out.append(pointer.getData() + " -> ");
			pointer = pointer.getLink();
		}
		out.append(pointer.getData());
		return out.toString();
	}
}