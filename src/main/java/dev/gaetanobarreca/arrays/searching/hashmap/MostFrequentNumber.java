package dev.gaetanobarreca.arrays.searching.hashmap;


// Find the Most Frequent Element:
// Problem: Given an array of integers, find the element that appears the most frequently.
// If there are multiple elements with the same highest frequency, return any one of them.
// Example: For the array [1, 3, 2, 3, 4, 3], your program should return 3.

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mostFrequentElement = arr[0];

        for(int num : arr){
            // Update frequency count for each number
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            // Check if the current number has a higher frequency
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                mostFrequentElement = num;
            }
        }
        System.out.println("The most frequent element is: " + mostFrequentElement);
    }
}
