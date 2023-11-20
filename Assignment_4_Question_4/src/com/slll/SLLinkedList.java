package com.slll;


public class SLLinkedList {

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
	
	public SLLinkedList() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}
	
	//1. Reverse the ll and traverse to print
	//2. Copy the original ll and reverse the copied ll and traverse to print
	//3. Use a stack
	//4. Use Recursion
	
	//RECURSION
	public void displayReverse(SLLinkedList list, Node head, Node tail, Node current) {
	
		//terminating condition
		if(current==tail) {
			return;
		}
		
		//recursive function
		current = current.next;
		displayReverse(list, head, tail, current);
		System.out.print(current.data + " ");		
	}
	
	//WRAPPER FUNCTION
	public void displayReverseWrapper(SLLinkedList list) {
		displayReverse(list, list.head , list.tail, list.head);
		System.out.print(head.data + " ");
	}
	
	public void addFirst(int data) {
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
	
	public void delFirst() {
		//if list is empty
		if(isEmpty())
			return;
		//if list is not empty
		//move head on second node
		head = head.next;
	}
	
	public void delLast() {
		//if list is empty
		if(isEmpty())
			return;
		//if list has single node
		else if(head.next == null)
			//make head equal to null
			head = null;
		//if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			//b. add null into next of second last node
			trav.next = null;
			tail = trav;
		}
	}
	
	public void display() {
		//create traversal reference and start at head
		Node trav = head;
		System.out.print("\nList : ");
		while(trav != null) {
			//print(visit) current node
			System.out.print(" " + trav.data);
			//go on next node
			trav = trav.next;
		}//repeat step 2 and 3 till last node
		System.out.println("\n\nHead = " + head.data);
		System.out.println("Tail = " + tail.data);
	}
}
