package com.linearqueue;

// linear queue in which front and rear starts at 0

public class LinearQueue {
	private int arr[];
	private int size;
	private int front, rear;						
	
	public LinearQueue(int size) {
		this.size=size;
		arr = new int[size];
		front = rear = 0;							//Change index to 0 instead of -1
	}
	
	public void push(int value) {					//Change in sequence
		//1. add value at rear index
		arr[rear] = value;
		//2. reposition rear
		rear++;
	}
	
	public int pop() {								//Change in sequence
		//1. read and return data of front index
		int value = arr[front];
		//increment front
		front++;
		return value;		
	}
	
	public int peek() {
		// read and return data of front + 1 index
		return arr[front];
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {						//Instead of rear == size-1
		return rear == size;
	}	
}
