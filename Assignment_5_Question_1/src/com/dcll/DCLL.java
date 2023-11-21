package com.dcll;

import java.security.Identity;

public class DCLL {
	public class Node{
		private int data;
		private Node prev;
		private Node next;
		
		public Node(int value) {
			data = value;
			prev = null;
			next = null;
		}
	}
	
	private Node head;
	
	public DCLL() {
		head = null;
	}
	
	
	public void addAtPos(int value, int position) {
		Node newNode = new Node(value);
		
		if(isEmpty()) {
			head = newNode;
			newNode.prev = newNode;
			newNode.next = newNode;
			System.out.println("List is empty(0 nodes) so node added at 1st position");
		}
		else if(head.next == head){
			//make
			newNode.next = head;
			newNode.prev = head;
			
			//break
			head.next = newNode;
			head.prev = newNode;
			System.out.println("List has only 1 node so node added at 2nd position");
		}
		else {
			Node trav = head;
			int currentPosition = 1;
			//come to position (position-1 or position+1 also possible)
			while(currentPosition != position) {
				trav = trav.next;
				currentPosition++;
			}
			
			//make
			newNode.next = trav;
			newNode.prev = trav.prev;
			
			//break
			trav.prev.next = newNode;
			trav.prev = newNode;
			System.out.println("Node added at "+ position+" position");
		}
	}
	
	public void deleteAtPos(int position){
		if(isEmpty()) {
			System.out.println("List is empty so no node deleted!");
			return;
		}
		else if(head.next == head) {
			head = null;
			System.out.println("List has only 1 node so first node deleted");
		}
		else {
			Node trav = head;
			int currentPosition = 1;
			//come to position
			while(currentPosition != position) {
				trav = trav.next;
				currentPosition++;
			}
			
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void fDisplay() {
		if(isEmpty())
			return;
		//1. create trav and start at head
		Node trav = head;
		System.out.print("Forward List : ");
		do {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);	//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void rDisplay() {
		if(isEmpty())
			return;
		//1. create trav and start at last node
		Node trav = head.prev;
		System.out.print("Reverse List : ");
		do {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}while(trav != head.prev);	//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
}
