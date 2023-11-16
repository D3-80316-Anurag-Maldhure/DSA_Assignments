package com.nonrepeating;

public class NonRepeating {
	
	public static void main(String[] args) {
		
		int[] array =  new int[] { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		System.out.println("Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		boolean flag = false;
		
		for(int i=0; i< array.length-1; i++) {
			flag = false;
			for(int j=0; j<array.length; j++) {
				if(i!=j && array[i]==array[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("\n\nFirst non repeating element = " + array[i]);
				break;
			}
		}
	}
}
