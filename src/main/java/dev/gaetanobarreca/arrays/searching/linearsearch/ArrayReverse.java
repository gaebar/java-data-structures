package dev.gaetanobarreca.arrays.searching.linearsearch;

/*
Write a program that can reverse a given array. It should accurately preserve the elements order,
and handle arrays of varying lengths.

Example:
    arr = {10, 5, 30, 15, 0}

    Output: {0, 15, 30, 5, 10}
*/


import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 15, 0};

        int[] newArr = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
