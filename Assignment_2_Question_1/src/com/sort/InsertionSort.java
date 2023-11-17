package com.sort;

import java.util.Arrays;


public class InsertionSort {
	
	public static int insertionSort(int arr[], int N) {
		//1. count number of passes
		//2. take backup of i th element
		//3. compare backup element with all its neighbors
		//4. move j th element one position ahead
		//5. insert backup element at its appropriate position
		int passesCount = 0;
		int comparisonsCount = 0;
		
		for(int i=1; i<N; i++) {
			passesCount++;
			int temp = arr[i];
			int j;
			
			for(j=i-1; j>=0 && arr[j]> temp; j--) {
				comparisonsCount++;
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		
		System.out.println("\nPasses count : " + passesCount);
		return comparisonsCount;
	}

	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		System.out.println("\nComparisons count : " + insertionSort(arr, arr.length));
		
		System.out.println("\nArray after sort : " + Arrays.toString(arr));
		
		
	}
}
