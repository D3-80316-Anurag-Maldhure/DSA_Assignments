package com.heap;

import java.util.Arrays;

public class MinHeapSortMain {

	public static void main(String[] args) {
		int arr[] = {0, 6, 14, 3, 26, 8, 18, 21, 9, 5};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		MinHeap h = new MinHeap();
		
		h.heapSort(arr);
		
		System.out.println("Array After sort : " + Arrays.toString(arr));

	}

}