package linkedlist;

public class MLinkedList<T> {

	private MNode<T> head;
	private int numElements;

	/* 
	 * Constructor
	 */
	public MLinkedList(){
		head = null;
	}
	
	/* 
	 * Insert element at end
	 */	
	public void insert(T data) {
		this.numElements++;
		
		if (head == null) {
			head = new MNode<T>(data);
			return;
		}

		MNode<T> current = head;
		
		while (current.getNext() != null) {
			current = current.getNext();
		}
		
		current.setNext(new MNode<T>(data));
	}
	
	/* 
	 * Delete first node with element
	 * Return true - if element existed in list
	 * Return false - if element not in list
	 */	
	public boolean deleteFirst(T data) {
		if (head == null) {
			return false;
		}
		
		MNode<T> previous = null;
		MNode<T> current = head;
		
		while (current != null && !current.getData().equals(data)) {
			previous = current;
			current = current.getNext();
		}
		
		// did not find
		if (current == null) {
			return false;
		}
		
		// found is at head
		if (previous == null) {
			this.head = current.getNext();
			this.numElements--;
			return true;
		}
		
		previous.setNext(current.getNext());
		this.numElements--;
		return true;
	}
	
	/*
	 * Reverses linked list
	 */
	public void reverse() {
		if (head == null || head.getNext() == null) {
			return;
		}
		
		MNode<T> previous = null;
		MNode<T> current = head;
		MNode<T> next = head;
		
		while (current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		this.head = previous;
	}
	
	public void print() {
		MNode<T> pointer = head;
		System.out.println("Number of elements:" + numElements);
		System.out.println("Printing Linked List:");
		while (pointer != null) {
			System.out.print(pointer.getData()+"->");
			pointer = pointer.getNext();
		}
		System.out.println();
		System.out.println();
	}
	
}
