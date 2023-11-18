package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseUsingStack {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7};
		
		System.out.println("Before using stack : ");
		System.out.println(Arrays.toString(arr));
		
		Stack<Integer> stack  = new Stack<>();

		for(int integer :arr) {
			stack.push(integer);
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stack.pop();
		}
		
		System.out.println("\nAfter using stack : ");
		System.out.println(Arrays.toString(arr));
	}

}
