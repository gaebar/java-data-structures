package dev.gaetanobarreca.recursions;

public class Recursion {
    public static void main(String[] args) {
        // Recursion is a method that calls itself
        sayHi(5);
    }

    public static void sayHi(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n + ": Hi");
            sayHi(n -1);
        }
    }
}
