package dev.gaetanobarreca.arrays.searching;

public class MaxMinFinder {
    public static void main(String[] args) {
        int[] numbers = {34, 78, 2, 45, 1, 99, 23};

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);
    }

    /**
     * Implements a linear search to find the maximum value in an array.
     * It works by iterating through each element of the array and comparing it
     * with the current known maximum. If a larger value is found, it becomes
     * the new maximum. This continues until the end of the array.
     *
     * @param array An array of integers to search through.
     * @return The maximum value found in the array.
     */
    public static int findMax(int[] array) {
        // Linear Search Algorithm
        // Start by assuming the first element is the max.
        int max = array[0];

        // Iterate through the array starting from the first index.
        for(int i =0; i < array.length; i++){
            // If the current element is greater than the current max,
            // it becomes the new max.
            if(array[i] > max){
                max = array[i];
            }
        }

        // Return the largest value found.
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for(int i=0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    // Explanation of Linear Search:
    // Linear search is a method for finding a particular value in a list that checks each element in sequence
    // until the desired value is found or the list ends. In the context of this file, it's used to iterate through
    // an array to find the maximum or minimum element. This search algorithm is straightforward and does not
    // require the array to be sorted, making it suitable for unsorted data. However, it's less efficient on larger
    // arrays because it may require checking each element until the end of the array.

    // Alternatives to Linear Search:
    // For larger or sorted arrays, more efficient algorithms can be used:
    // 1. Binary Search: Highly efficient for sorted arrays, as it repeatedly divides the search interval in half.
    // 2. Hashing: Utilizes hash tables for fast lookups, ideal for scenarios where frequent searching is required.
    // 3. Search Trees: Data structures like binary search trees or AVL trees provide efficient search operations.
    // Each of these alternatives offers performance benefits over linear search in specific use cases.

}
