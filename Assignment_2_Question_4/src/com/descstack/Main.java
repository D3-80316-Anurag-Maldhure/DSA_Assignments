package com.descstack;

import java.util.Scanner;

public class Main {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		
		DescendingStack dStack = new DescendingStack(5);
		
		int choice=0;
		scanner = new Scanner(System.in);
		
		do {
			System.out.println("Choose a operation for (D)Stack : ");
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. isEmpty\n4. isFull\n5. Peek");
			System.out.println("Enter your choice : ");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("\nBye!");
				break;
			case 1:
				if(dStack.isFull()) {
					System.out.println("Stack OVERFLOW!");
				}
				else {
					System.out.print("Enter data to be inserted : ");
					int value = scanner.nextInt();
					dStack.push(value);
				}
				break;
			case 2:
				if(dStack.isEmpty()==true) {
					System.out.println("Stack UNDERFLOW!");
				}
				else {
					dStack.pop();
				}
				break;

			case 3:
				if(dStack.isEmpty()) {
					System.out.println("Stack is empty");
				}
				else {
					System.out.println("Stack is NOT empty");
				}
				break;
				
			case 4:
				if(dStack.isFull()) {
					System.out.println("Stack is full");
				}
				else {
					System.out.println("Stack is NOT full");
				}
				break;
			case 5:
				if(dStack.isEmpty()) {
					System.out.println("Stack is empty!");
				}
				else {
					System.out.println("Element at top = "+dStack.peek());
				}
				break;

			default:
					System.out.println("Enter a valid choice! ");
				break;
			}
			
		}while(choice!=0);
	}
}
