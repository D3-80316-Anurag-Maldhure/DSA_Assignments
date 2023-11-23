package com.dlll;

public class Main {

	 public static void main(String[] args) {
	     DoublyLinkedList deque = new DoublyLinkedList();

	     // Adding elements to the front
	     deque.addToFront(3);
	     deque.addToFront(2);
	     deque.addToFront(1);

	     // Adding elements to the rear
	     deque.addToRear(4);
	     deque.addToRear(5);

	     // Display the deque
	     System.out.println("Deque after adding elements: ");
	     deque.display();

	     // Remove elements from the front and rear
	     System.out.println("Removed from front: " + deque.removeFromFront());
	     System.out.println("Removed from rear: " + deque.removeFromRear());

	     // Display the deque after removal
	     System.out.println("Deque after removal: ");
	     deque.display();
	 }
}
