package com.nthoccurance;

public class nThOccurance {

	public static void main(String[] args) {
		int[] array = {2, 4, 6, 2, 8, 2, 10, 12, 2};

        int target = 2;
        int nthOccurrence = 4;

        int result = linearSearchNthOccurrence(array, target, nthOccurrence);

        if (result != -1) {
            System.out.println("The " + nthOccurrence + "th occurrence of " + target + " is at index " + result);
        } else {
            System.out.println("The " + nthOccurrence + "th occurrence of " + target + " is not found in the array.");
        }
	}

	 public static int linearSearchNthOccurrence(int[] array, int target, int n) {
	        int count = 0;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                count++;

	                // Nth occurrence found
	                if (count == n) {
	                    return i; 
	                }
	            }
	        }
	        // Nth occurrence not found
	        return -1; 
	    }
}


   
