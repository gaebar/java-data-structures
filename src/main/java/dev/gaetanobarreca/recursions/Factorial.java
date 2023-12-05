package dev.gaetanobarreca.recursions;

public class Factorial {
    public static void main(String[] args) {
        // Factorial is a classic example of recursion.
        // Factorial is a number multiplied by all the numbers before it.
        // 5! = 5 * 4 * 3 * 2 * 1 = 120

        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        // base case
        if(n == 1) {
            System.out.println("factorial(" + n + ") = 1");
            return 1;
        } else {
            // recursive case
            System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n -1) + ")");
            return n * factorial(n -1);
        }
    }
}
