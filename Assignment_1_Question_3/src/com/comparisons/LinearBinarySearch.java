package com.comparisons;

import java.util.Scanner;

public class LinearBinarySearch {

	public static void main(String[] args) {
		int key = -1;
		int numberOfComputations = 0;
		
		int[] arr = new int[] {12,24,36,48,60,72,84,96,108,120};
		
		System.out.println("The array elements are : ");
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nEnter the number you want to search: ");
		key = scanner.nextInt();
		
		System.out.println("---------------------------------------------------");
		numberOfComputations = linearSearch(arr, key);
		System.out.println("LINEAR SEARCH RESULTS =>");
		System.out.println("Number of computations done : " + numberOfComputations);
		
		numberOfComputations = 0;
		System.out.println("---------------------------------------------------");
		numberOfComputations = binarySearch(arr, key, 0, arr.length, numberOfComputations);
		System.out.println("BINARY SEARCH RESULTS =>");
		System.out.println("Number of computations done : " + numberOfComputations);
		
		scanner.close();

	}
	
	public static int linearSearch(int[] array, int key) {
		int computations = 0;
		for(int i=0 ; i < array.length; i++) {
			computations++;
			if(array[i] == key) {
				return computations;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] array, int key, int left, int right, int computations) {
		if(left>right)
			return -1;
		int mid = (left+right)/2;
		computations++;
		if(array[mid] == key) {
			return computations;
		}
		else if (array[mid] > key) {
			 return binarySearch(array, key, left, mid-1, computations);
		}
		else {
			 return binarySearch(array, key, mid+1, right, computations);
		}
	}
}
