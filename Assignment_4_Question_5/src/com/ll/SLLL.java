package com.ll;

public class SLLL {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
	private Node tail;
	
	public SLLL() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addNode(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}else {
			Node trav = head;
			while(trav != null) {
				if(newNode.data < head.data) {
					addFirst(value);
					return;
				}else if(newNode.data > tail.data) {
					addLast(value);
					return;
				}else if(trav.data == newNode.data) {
					newNode.next = trav.next;
					trav.next = newNode;
					return;
				}else if(trav.data < newNode.data && newNode.data < trav.next.data) {
					newNode.next = trav.next;
					trav.next = newNode;
					return;
				}else{
					trav = trav.next;
				}
			}
		}
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void addAfterNode(int value2, int value) {
		Node newNode = new Node(value2);
		Node exist = new Node(value);
		Node trav = head;
		while(trav.next != tail) {
			if(trav.data == exist.data) {
				newNode.next = trav.next;
				trav.next = newNode;
				return;
			}else {
				trav = trav.next;
			}
		}
	}
	
	public void addBeforeNode(int value2, int value) {
		Node newNode = new Node(value2);
		Node exist = new Node(value);
		Node fast = head.next;
		Node slow = head;
		if(exist.data == head.data) {
			addFirst(value2);
		}else if(exist.data == tail.data) {
			addLast(value2);
		}else {
			while(fast.next != tail) {
				if(exist.data == fast.data) {
					newNode.next = fast;
					slow.next = newNode;
					return;
				}else {
					fast = fast.next;
					slow = slow.next;
				}
			}
		}
	}
	
	public void delFirst() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}else {
			head = head.next;
		}
	}
	
	public void delLast() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}else {
			Node trav = head;
			while(trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
			tail = trav.next;
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("List Is Empty");
		}else {
			Node trav = head;
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}while(trav != null);
		}
	}	
}

