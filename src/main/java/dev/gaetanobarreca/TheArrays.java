package dev.gaetanobarreca;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        // To get all the elements of an array, use Arrays.toString()
        System.out.println(Arrays.toString(colors));

        // To get the length of an array, use .length
        System.out.println(colors[0]);

        // To change an element of an array, use the index
        colors[2] = "Yellow";
        System.out.println(Arrays.toString(colors));

        // Once we create an array, we can't change its size
        int[] numbers = {100, 200};
    }
}
