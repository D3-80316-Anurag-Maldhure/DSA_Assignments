package com.heap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int calculateMode(int[] array) {
        // Create a Hashtable to store frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the element(s) with maximum frequency
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Collect elements with the maximum frequency (modes)
        // If there are multiple modes, this will return only one of them.
        int mode = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mode = entry.getKey();
                break; // If you want to find all modes, you can remove the break statement.
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 2, 6, 2, 7, 8, 2, 9, 2};

        int mode = calculateMode(array);

        System.out.println("Mode of the array: " + mode);
    }
}

