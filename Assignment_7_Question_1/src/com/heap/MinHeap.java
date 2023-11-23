package com.heap;

import java.util.Arrays;

public class MinHeap {
		
	
		private int SIZE;
		public MinHeap() {
			SIZE = 0;
		}
		
		public void addHeap(int arr[]) {
			//1. increase the size of heap by 1
			SIZE++;
			//2. add element at first empty index of array
			// arr[SIZE] = ele;
			//3. compare newly added element with all its parents
			int ci = SIZE;
			int pi = ci / 2;
			while(pi >= 1) {
				//4. if parent is smaller than child			//<- This check is reversed in case of MaxHeap
				if(arr[pi] < arr[ci])
					break;
				//5. if parent is less than child
				int temp = arr[pi];
				arr[pi] = arr[ci];
				arr[ci] = temp;
				//6. update child and parent index
				ci = pi;
				pi = ci / 2;
			}
		}
		
		public int delHeap(int arr[]) {
			//1. swap first and last element
			int max = arr[1];
			arr[1] = arr[SIZE];
			arr[SIZE] = max;
			//2. decrease size of heap by 1
			SIZE--;
			//3. compare root element of heap will all its descendents
			int pi = 1;
			int ci = 1 * 2;
			while(ci <= SIZE) {
				//4. find index of min child
				if(ci + 1 <= SIZE && arr[ci + 1] < arr[ci]) 		//<- This check is reversed in case of MaxHeap
					ci = ci + 1;
				//5. if parent is greater than minimum child
				if(arr[pi] < arr[ci])
					break;
				//6. if parent is less than minimum child
				int temp = arr[pi];
				arr[pi] = arr[ci];
				arr[ci] = temp;
				//7. update index of parent and child
				pi = ci;
				ci = pi * 2;
			}
			return  max;		
		}
		
		public void createHeap(int arr[]) {
			for(int i = 1 ; i < arr.length ; i++)
				addHeap(arr);
		}
			
		public void deleteHeap(int arr[]) {
			for(int i = 1 ; i < arr.length ; i++)
				delHeap(arr);
		}
		
		public void heapSort(int arr[]) {
			//1. create heap
			createHeap(arr);
			System.out.println("Arr : " + Arrays.toString(arr));
			//2. delete heap
			deleteHeap(arr);
		}

	}


