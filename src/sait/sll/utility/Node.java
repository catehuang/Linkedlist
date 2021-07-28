package sait.sll.utility;

import java.io.Serializable;

/**
 * Node related functions
 *
 */
public class Node implements Serializable {
	private Object element;
	private Node successor;
	
	/**
	 * Node Constructor with two parameters
	 * @param element the object of the node
	 * @param successor the pointer pointing next node
	 */
	public Node(Object element, Node successor) {
		super();
		this.element = element;
		this.successor = successor;
	}

	/**
	 * Node Constructor with one parameter
	 * @param element the object of the node
	 */
	public Node(Object element) {
		super();
		this.element = element;
		this.successor = null;
	}

	/**
	 * Get the object of the node
	 * @return the object of the node
	 */
	public Object getElement() {
		return element;
	}

	/**
	 * Set the object of the node
	 * @param element object of the node
	 */
	public void setElement(Object element) {
		this.element = element;
	}

	/**
	 * Get the next node
	 * @return the node pointed by the node
	 */
	public Node getNext() {
		return successor;
	}

	/**
	 * Set the next node
	 * @param successor the node pointed by the node
	 */
	public void setNext(Node successor) {
		this.successor = successor;
	}
	
}
