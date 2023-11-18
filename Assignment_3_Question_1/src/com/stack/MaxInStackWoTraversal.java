package com.stack;

//import java.util.AbstractList;
//import java.util.Vector;
import java.util.Stack;

public class MaxInStackWoTraversal {
	
	public static int checkForMaximum(int peekedValue, int previousMaxValue) {
		return peekedValue>previousMaxValue?peekedValue:previousMaxValue;
	}

	public static void main(String[] args) {	
//		AbstractList<Integer> stack = new Stack<>();
//		Vector<Integer> stack = new Stack<>();
		Stack<Integer> stack = new Stack<>();
		
		int maximumInStack = Integer.MIN_VALUE;
		
		stack.push(1124);
		maximumInStack = checkForMaximum(stack.peek(), maximumInStack);
		stack.push(215);
		maximumInStack = checkForMaximum(stack.peek(), maximumInStack);
		stack.push(125);
		maximumInStack = checkForMaximum(stack.peek(), maximumInStack);
		stack.push(2126);
		maximumInStack = checkForMaximum(stack.peek(), maximumInStack);
		stack.push(2156);
		maximumInStack = checkForMaximum(stack.peek(), maximumInStack);
		
		
		System.out.println("Maximum value in Stack = "+maximumInStack);
	}
}
