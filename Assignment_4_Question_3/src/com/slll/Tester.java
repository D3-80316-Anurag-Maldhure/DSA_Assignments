package com.slll;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		SLLinkedList list = new SLLinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
		list.addLast(80);
		
		list.display();
		System.out.println();
		System.out.println("Enter Node after Which New Node is to be Added : ");
		int value = sc.nextInt();
		System.out.println("Enter Value of New Node To be Created : ");
		int value2 = sc.nextInt();
		list.addAfterNode(value2, value);
		
		list.display();
		
		System.out.println();
		System.out.println("Enter Node before Which New Node is to be Added : ");
		int val = sc.nextInt();
		System.out.println("Enter Value of New Node To be Created : ");
		int val2 = sc.nextInt();
		list.addBeforeNode(val2, val);
		
		list.display();
		
		sc.close();
		
	}

}
