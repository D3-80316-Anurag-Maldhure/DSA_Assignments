package com.dsusingll;

public class StackAndQueue {

	public static void main(String[] args) {
	
		//STACK - Here addFirst & deleteFirst (or addLast & deleteLast also can be done)
		System.out.println("Stack implementation using SLLL :");
		
		SLLL stack = new SLLL();
		stack.push(100);
		stack.peek();
		stack.push(101);
		stack.push(102);
		stack.push(103);
		stack.push(104);
		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		//QUEUE - Here addFirst & deleteLast (or addLast & deleteFirst also can be done)
		System.out.println("\n\nQueue implementation using SLLL :");
		
		SLLL queue = new SLLL();
		queue.offer(100);
		queue.peekQ();
		queue.offer(101);
		queue.offer(102);
		queue.offer(103);
		queue.offer(104);
		queue.peekQ();
		queue.poll();
		queue.peekQ();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
	}
}
