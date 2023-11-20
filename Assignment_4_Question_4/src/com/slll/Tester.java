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
		
		System.out.println("\nReversed LL using recursion: ");
		//As current node, head and tail are not accessible directly
		linkedList.displayReverseWrapper(linkedList);
	}

}
