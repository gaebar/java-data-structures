package dev.gaetanobarreca.list;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(); // using diamond operator
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        colors.add("green");

        System.out.println(colors);
        System.out.println("How many colors are in the array? " + colors.size());
        System.out.println("It contains purple? " + colors.contains("purple"));
        System.out.println("It contains pink? " + colors.contains("pink"));
        System.out.println("The color at index 2 is: " + colors.get(2));
        System.out.println("The index of yellow is: " + colors.indexOf("yellow"));
        System.out.println("The index of pink is: " + colors.indexOf("pink"));

        // Looping through a list
        // We use a Foreach-loop when we don't need to know the index of the element
        for (String color : colors) {
            System.out.println("Using Foreach Loop: " + color);
        }

        // We use a For-loop when we need to know the index of the element
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Using For Loop: " + colors.get(i));
        }

        // Foreach method
        colors.forEach(System.out::println);

        // Foreach method with custom message
        colors.forEach(color -> System.out.println("Using Foreach method: " + color));

        // Removing an element
        colors.remove("purple");
        System.out.println("Removing purple: " + colors);

    }
}
