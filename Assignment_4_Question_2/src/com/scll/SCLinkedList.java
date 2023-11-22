package com.scll;

//Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of all operations.
public class SCLinkedList {

		static class node{
			private int data;
			private node next;
			
			public node(int value) {
				data = value;
				next = null;
			}
		}
		
		private node tail;
		
		public int getTail() {
			return tail.data;
		};
		
		public SCLinkedList() {
			tail = null;
		}
		
		public boolean isEmpty() {
			return tail == null;
		}
		
		public void addFirst(int value) {
			node newNode = new node(value);
			if(isEmpty()) {
				tail = newNode;
				newNode.next = newNode;
			}else {
				newNode.next = tail.next;
				tail.next = newNode;
			}
		}
		
		public void addLast(int value) {
			node newNode = new node(value);
			if(isEmpty()) {
				tail = newNode;
				newNode.next = newNode;
			}else {
				newNode.next = tail.next;
				tail.next = newNode;
				tail = newNode;
			}
		}
		
		public void delFirst() {
			if(isEmpty()) {
				System.out.println("List is Empty");
			}else {
				tail.next = tail.next.next;
			}
		}
		
		public void delLast() {
			if(isEmpty()) {
				System.out.println("List is Empty");
			}else {
				node trav = tail;
				while(trav.next != tail) {
					trav = trav.next;
				}
				trav.next = tail.next;
				tail = trav;
			}
		}
		
		public void addPos(int value, int pos) {
			node newNode = new node(value);
			int size = 0;
			node trav = tail;
			while(trav.next != tail) {
				trav = trav.next;
				size++;
			}
			size++;
			if(isEmpty()) {
				tail = newNode;
				newNode.next = newNode;
			}else if(pos <= 1) {
				addFirst(value);
			}else if(pos > size) {
				addLast(value);
			}else {
				node trav1 = tail;
				for(int i = 1; i < pos; i++) {
					trav1 = trav1.next;
				}
				newNode.next = trav1.next;
				trav1.next = newNode;
			}
		}
		
		public void delPos(int pos) {
			int size = 0;
			node trav = tail;
			while(trav.next != tail) {
				trav = trav.next;
				size++;
			}
			size++;
			if(isEmpty()) {
				System.out.println("List is Empty");
			}else if(pos <= 1) {
				delFirst();
			}else if(pos > size) {
				delLast();
			}else {
				node trav1 = tail;
				for(int i = 1; i < pos; i++) {
					trav1 = trav1.next;
				}
				trav1.next = trav1.next.next;
			}
		}
		
		public void display() {
			if(isEmpty()) {
				System.out.println("List is Empty");
			}else {
				node trav = tail.next;
				while(trav != tail) {
					System.out.println(trav.data);
					trav = trav.next;
				}
				System.out.println(tail.data);
			}
		}
	}
