package com.rank;

public class StreamRank {

    public static int findRank(int[] stream, int target) {
        int rank = 0;

        for (int num : stream) {
            if (num <= target) {
                rank++;
            }
        }

        return rank;
    }

    public static void main(String[] args) {
        int[] stream = {10, 20, 15, 3, 4, 4, 1};
        int elementToFindRank = 4;

        int rank = findRank(stream, elementToFindRank);

        System.out.println("Rank of " + elementToFindRank + " is: " + rank);
    }
}

