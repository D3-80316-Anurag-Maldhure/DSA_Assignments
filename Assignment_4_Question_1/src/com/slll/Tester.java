package com.slll;

public class Tester {
	
	public static void main(String[] args) {
		SLLinkedList linkedList = new SLLinkedList();
		
		linkedList.addFirst(100);
		linkedList.addFirst(101);
		linkedList.addFirst(102);
		
		linkedList.addLast(201);
		linkedList.addLast(202);
		linkedList.addLast(203);
		
		linkedList.display();
		
		linkedList.delFirst();
		
		linkedList.display();
		
		linkedList.delLast();
		
		linkedList.display();
	}
	
}
