package dev.gaetanobarreca.arrays.searching.linearsearch;

public class FindElement {
    public static void main(String[] args) {
        int[] numbers = {100, 800, 300, 200, 600, 500, 700, 400};
        int target = 600;

        int index = findElement(numbers, target);

        if(index!= -1){
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    /**
     * Performs a linear search to find the index of a target element in the array.
     * If the element is found, returns its index, otherwise returns -1.
     *
     * @param array The array to search through.
     * @param target The element to find.
     * @return The index of the target element, or -1 if not found.
     */

    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
