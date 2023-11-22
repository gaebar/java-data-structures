package dev.gaetanobarreca.arrays.searching.binarysearch;

import java.util.Arrays;

// "Divide and Conquer" Algorithm
// Time Complexity: O(log n)
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        int numberToFind = 7;
        int index = binarySearch(numbers, numberToFind);
        System.out.println("The number " + numberToFind + " is at index " + index);

        // Same result using Java's built-in binary search method
        System.out.println(Arrays.binarySearch(numbers, numberToFind));
    }
    private static int binarySearch(int[] numbers, int numberToFind) {

        // Create two pointers, one at the beginning of the array and one at the end of the array.
        int low = 0;
        int high = numbers.length - 1;

        // While the low pointer is less than or equal to the high pointer:
        while (low <= high) {

            // Create a pointer in the middle of the array.
            int middle = (low + high) / 2;

            // If the element at the middle pointer is equal to the number we are looking for, return the middle pointer.
            if (numbers[middle] == numberToFind) {
                return middle;
            }
            // If the element at the middle pointer is less than the number we are looking for, move the low pointer to middle + 1.
            if (numbers[middle] < numberToFind) {
                low = middle + 1;
            }

            // If the element at the middle pointer is greater than the number we are looking for, move the high pointer to middle - 1.
            if (numbers[middle] > numberToFind) {
                high = middle - 1;
            }
        }

        // If we get to the end of the array and haven't found the number, return -1.
        return -1;
    }

}
