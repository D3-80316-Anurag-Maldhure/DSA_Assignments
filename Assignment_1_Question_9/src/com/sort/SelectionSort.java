package com.sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {124, 22, 1122, 242, 1251, 453, 21, 56, 12};
		
        System.out.println("Unsorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
		
        int comparisons = selectionSort(array);

        System.out.println("\n\nSorted array using Selection Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nNumber of comparisons: " + comparisons);
	}
	
	public static int selectionSort(int[] array) {
        int comparisons = 0;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return comparisons;
    }
}
