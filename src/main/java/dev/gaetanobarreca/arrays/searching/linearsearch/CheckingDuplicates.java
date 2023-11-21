package dev.gaetanobarreca.arrays.searching.linearsearch;

public class CheckingDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 3};

        // Flag variable to indicate if a duplicate is found
        boolean duplicateFound = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicateFound = true;
                    break; // Exit the inner loop if a duplicate is found
                }
            }
            if (duplicateFound) {
                break; // Exit the outer loop if a duplicate is found
            }
        }

        System.out.println("Duplicate found: " + duplicateFound);
    }
}
