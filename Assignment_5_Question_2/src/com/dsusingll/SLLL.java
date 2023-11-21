package com.dsusingll;

public class SLLL {

	static class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	private Node head;
	private Node tail;
	
	public SLLL() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}
	
	//-------------------------------------------------------
	//FOR STACK : 
	
	//addFirst
	public void push(int data) {
		//create new node
		Node newNode = new Node(data);
		//if empty list -> add new node to head
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		//else -> 
		else {
			//new node make .next link to head.next
			newNode.next = head;
			//break head to new node
			head = newNode;
		}
		
	}
	
	//delFirst()
	public void pop() {
		//if list is empty
		if(isEmpty()) {
			System.out.println("Stack Underflow!");
			return;
		}		
		//if list is not empty
		//move head on second node
		System.out.println("Element popped = "+head.data);
		head = head.next;
	}
	
	public void peek() {
		//if list is empty
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return;
		}
		System.out.println("Element at top  = "+head.data);
	}
	
	//-------------------------------------------------------
	//FOR QUEUE : 
	
	//addFirst
	public void offer(int data) {
		//create new node
		Node newNode = new Node(data);
		//if empty list -> add new node to head
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		//else -> 
		else {
			//new node make .next link to head.next
			newNode.next = head;
			//break head to new node
			head = newNode;
		}
		
	}
	
	//delLast
	public void poll() {
		//if list is empty
		if(isEmpty()) {
			System.out.println("Queue Underflow!");
			return;
		}
		//if list has single node
		else if(head.next == null) {
			System.out.println("Element polled = "+head.data);
			//make head equal to null
			head = null;
		}
		//if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			//b. add null into next of second last node
			System.out.println("Element polled = "+trav.next.data);
			trav.next = null;
			tail = trav;
		}
	}
	
	public void peekQ() {
		//if list is empty
		if(isEmpty()) {
			System.out.println("Queue is empty!");
			return;
		}
		Node trav = head;
		while(trav.next != null) {
			//3. go on next node
			trav = trav.next;
		};
		System.out.println("Element at front  = "+trav.data);
	}
	
	//-------------------------------------------------------
	
	public void addLast(int data) {
		//create new node
		Node newNode = new Node(data);
		//if empty list -> add new node to head
		if(isEmpty()) {
			head = newNode;
		}
		//else-> traverse till last node and then add new node
		else {
			Node trav = head;
			while(trav.next!=null) {
				trav = trav.next;
			}
			trav.next = newNode;
			tail = newNode;
		}
	}
	
	public void fDisplay() {
		if(isEmpty())
			return;
		//1. create traversal and start at head
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		};	//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
}