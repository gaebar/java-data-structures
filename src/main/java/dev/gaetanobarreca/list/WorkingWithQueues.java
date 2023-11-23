package dev.gaetanobarreca.list;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("John", 25));
        supermarket.add(new Person("Mary", 30));
        supermarket.add(new Person("Peter", 40));

        System.out.println("Supermarket queue: " + supermarket);
        System.out.println("How many people are in the queue? " + supermarket.size());
        System.out.println("The first person in the queue is: " + supermarket.peek());
        System.out.println(supermarket.poll()); // Removes the first person in the queue
        System.out.println("Supermarket queue: " + supermarket);
        System.out.println("How many people are in the queue? " + supermarket.size());
    }

    static record Person(String name, int age){}
}
