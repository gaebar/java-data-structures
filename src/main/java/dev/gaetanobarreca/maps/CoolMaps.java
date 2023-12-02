// https://www.youtube.com/watch?v=CUR1UbEzWnY&t=2s&ab_channel=AlexLee

package dev.gaetanobarreca.maps;

import java.util.HashMap;
import java.util.Map;

public class CoolMaps {
    public static void main(String[] args) {
        // Maps are a data structure that store key-value pairs
        // Maps is an interface, HashMap is a class that implements the Map interface
        Map<Integer, String> lakers = new HashMap<>();

        // Put elements in the map using the put method (key, value)
        lakers.put(23, "Lebron James");
        lakers.put(3, "Anthony Davis");
        lakers.put(0, "Kyle Kuzma");

        // Display the entire map
        System.out.println("Lakers: " + lakers);

        // Display the value associated with a key
        System.out.println("The player with jersey number 23 is: " + lakers.get(23));

        // Display the number of elements in the map
        System.out.println("The number of players in the map is: " + lakers.size());

        // Check if a key is in the map - boolean return value
        System.out.println("Is jersey number 3 in the map? " + lakers.containsKey(3));
        System.out.println("Is jersey number 1 in the map? " + lakers.containsKey(1));

        // Check if a value is in the map - boolean return value
        System.out.println("Is Lebron James in the map? " + lakers.containsValue("Lebron James"));

        // Remove an element from the map
        lakers.remove(0);

        // replace the value associated with a key
        lakers.replace(3, "Anthony Davis", "Dennis Schroder");

        // Display the entire map
        System.out.println("Lakers: " + lakers);
    }
}
