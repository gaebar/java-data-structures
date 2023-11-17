package dev.gaetanobarreca.arrays;

import java.util.Arrays;

// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
public class TheArrays {
    public static void main(String[] args) {
        // To declare an array, define the variable type with square brackets.
        // To create an array with a fixed size, use the 'new' keyword.
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        // To print all the elements of an array, use Arrays.toString().
        System.out.println("All 5 colors: " + Arrays.toString(colors));

        // To access a specific element of an array, use the index.
        System.out.println("First color: " + colors[0]);

        // Elements of an array that are not explicitly initialized are set to null (for object arrays).
        // To assign a value to an element of an array, use the index.
        colors[2] = "Yellow";
        System.out.println("Updated colors: " + Arrays.toString(colors));

        // The size of an array is fixed after creation. Use ArrayList for a resizable array.
        int[] numbers = {100, 800, 300, 200, 600, 500, 700, 400};

        // To get the number of elements in an array, use the .length property.
        System.out.println("Array length: " + numbers.length);

        // To access the last element of an array, use .length - 1 as the index.
        System.out.println("Last number: " + numbers[numbers.length - 1]);

        // The first element of an array is accessed with index 0.
        System.out.println("First number: " + numbers[0]);

        // To update an element of an array, use the index.
        numbers[0] = 300;
        System.out.println("Updated numbers: " + Arrays.toString(numbers));

        // A for loop can iterate over the array elements by index.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number by index: " + numbers[i]);
        }

        // A 'for-each' loop is used for iterating over each element directly.
        for (int number : numbers) {
            System.out.println("Number in for-each: " + number);
        }

        // Similarly, a 'for-each' loop for the 'colors' array.
        for(String color : colors) {
            System.out.println("Color in for-each: " + color);
        }

        // A for loop in reverse order to iterate from the last element to the first.
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number in reverse: " + numbers[i]);
        }

        // Sort the 'numbers' array in ascending order and print it. Arrays.sort() modifies the original array.
        Arrays.sort(numbers);
        System.out.println("Sorted numbers array: " + Arrays.toString(numbers));
    }
}
