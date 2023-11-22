package com.scll;

public class Main {

	public static void main(String[] args) {
		SCLinkedList list = new SCLinkedList();
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
		list.addLast(80);
		list.display();
		
		System.out.println("Tail -> " + list.getTail());
		
		list.delFirst();
		System.out.println("Tail -> " + list.getTail());
		list.delLast();
		System.out.println("Tail -> " + list.getTail());
		
		list.addPos(5, 4);
		
		list.delPos(5);
		
		list.display();
		System.out.println("Tail -> " + list.getTail());

	}

}
