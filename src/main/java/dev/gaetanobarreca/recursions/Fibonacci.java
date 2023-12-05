package dev.gaetanobarreca.recursions;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci is a classic example of recursion.
        // Fibonacci is a number that is the sum of the two numbers before it.
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        int number = 10; // Number for which we want the Fibonacci value
        int fibonacciResult = fibonacci(number); // Calling the fibonacci function
        System.out.println("Fibonacci of " + number + " is " + fibonacciResult);

    }

    public static int fibonacci(int n) {
        // base case
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            // recursive case);
            return fibonacci(n -1) + fibonacci(n -2);
        }
    }
}
