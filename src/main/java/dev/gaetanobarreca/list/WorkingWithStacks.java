package dev.gaetanobarreca.list;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10); // Pushing 10
        stack.push(5); // Pushing 5
        stack.push(30); // Pushing 30

        // Display the entire stack
        System.out.println("Stack: " + stack);

        // Display the element at the top of the stack without removing it, e.g., 30
        System.out.println("Peek at the top element: " + stack.peek()); // 30 (top of the stack)

        // Display the current size (number of elements) of the stack
        System.out.println("Size: " + stack.size());

        // Remove and display the element at the top of the stack, e.g., 30
        System.out.println("Pop and display the top element: " + stack.pop()); // 30 (top of the stack)

        // Display the new top element of the stack after the pop operation, e.g., next element below the one just popped
        System.out.println("New Peek after Pop: " + stack.peek()); // 5 (top of the stack)

    }
}
