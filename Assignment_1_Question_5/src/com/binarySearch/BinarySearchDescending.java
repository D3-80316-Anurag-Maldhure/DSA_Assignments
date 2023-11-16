package com.binarySearch;

import java.util.Scanner;

public class BinarySearchDescending {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int[] array = {20, 15, 10, 5, 0, -5, -10, -15, -20};

        System.out.println("Enter the number you want to search in the array : ");
        int key = scanner.nextInt();
        
        int result = binarySearchDescending(array, key, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Key " + key + " found at index " + result);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
	}
	
    private static int binarySearchDescending(int[] array, int key, int left, int right) {
        if (left > right) {
            return -1; // Key not found
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == key) {
            return mid; // Key found
        } else if (array[mid] > key) {
            // Key must be in the left half
            return binarySearchDescending(array, key, mid + 1, right);
        } else {
            // Key must be in the right half
            return binarySearchDescending(array, key, left, mid - 1);
        }
    }
}


    


