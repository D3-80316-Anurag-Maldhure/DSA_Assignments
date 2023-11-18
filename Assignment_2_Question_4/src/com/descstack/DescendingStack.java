package com.descstack;

public class DescendingStack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public DescendingStack(int size) {
		SIZE = size;
		arr = new int[size];
		top = size;
	}
	
	public void push(int data) {
		//increment top
		top--;
		
		//push data into top
		arr[top] = data;
	}
	
	public void pop(){
		//update top
		top ++;
	}
	
	public int peek() {
		//read/return value of top index
		return arr[top];
	}
	
	public boolean isEmpty(){
		return top == SIZE;
	}
	
	public boolean isFull(){
		return top == 0;
	}
	
}
