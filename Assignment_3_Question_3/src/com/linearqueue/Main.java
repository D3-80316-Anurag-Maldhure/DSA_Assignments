package com.linearqueue;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		LinearQueue q = new LinearQueue(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. Exit\n1. Push\n2. pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			//Push
			case 1:
				if(q.isFull())
					System.out.println("Queue OVERFLOW!");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					q.push(data);
				}
				break;
			//Pop
			case 2:
				if(q.isEmpty())
					System.out.println("Queue UNDERFLOW!");
				else
					System.out.println("Popped data : " + q.pop());
				break;
			//Peek
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Peeked data : " + q.peek());
				break;
			}
		}while(choice != 0);
		sc.close();
	}
}
