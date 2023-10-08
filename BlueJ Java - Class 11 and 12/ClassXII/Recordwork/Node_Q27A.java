package ClassXII.Recordwork;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 31/7/2023
 */
public class Node_Q27A {
	private int data;
	private Node_Q27A link;

	Node_Q27A() {
		link = null;
		data = 0;
	}

	Node_Q27A(int d, Node_Q27A n) {
		data = d;
		link = n;
	}

	/**
	 * Sets the link of the Node_Q27A.
	 *
	 * @param  l  the Node_Q27A to set as the link
	 */
	public void setLink(Node_Q27A l) {
		link = l;
	}

	/**
	 * Sets the data value of the object.
	 *
	 * @param  d  the new data value
	 */
	public void setData(int d) {
		data = d;
	}

	/**
	 * A method that returns the link of the Node_Q27A object.
	 *
	 * @return the link of the Node_Q27A object
	 */
	public Node_Q27A getLink() {
		return link;
	}

	/**
	 * A method that returns the data value of the object.
	 * 
	 * @return the data value
	 */
	public int getData() {
		return data;
	}
}
