package dev.gaetanobarreca.arrays;


public class HashMap {
    public static void main(String[] args) {

    }
}

/**
 * HashMap in Java:
 *
 * HashMap is a part of the Java Collections Framework and is present in the java.util package.
 * It stores data in key-value pairs and is based on the hashing principle.
 *
 * Key Characteristics:
 *
 * 1. Implementation of the Map Interface: HashMap implements the Map interface, which means it handles data in a key-value pair format.
 * Each key maps to exactly one value.
 *
 * 2. Uses Hashing: It uses a hash table to store the map. This allows it to perform put and get operations in
 * constant time (O(1)) under ideal conditions.
 *
 * 3. Unordered Collection: The elements in a HashMap are not ordered. The order of elements can change over time,
 * especially when rehashing occurs due to resizing.
 *
 * 4. Unique Keys: The keys are unique in a HashMap. If a duplicate key is inserted, the new value overwrites the
 * existing value associated with that key.
 *
 * 5. Null Keys and Values: HashMap allows one null key and multiple null values.
 *
 * 6. Not Synchronized: HashMap is not synchronized, which means it is not thread-safe. If a HashMap is accessed by multiple
 * threads concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally.
 *
 * Common Operations:
 *
 * - put(K key, V value): Inserts a key-value pair into the map.
 * - get(Object key): Returns the value to which the specified key is mapped, or null if the map contains no mapping for the key.
 * - remove(Object key): Removes the mapping for a key from this map if it is present.
 * - containsKey(Object key): Returns true if this map contains a mapping for the specified key.
 * - size(): Returns the number of key-value mappings in this map.
 *
 * Example Usage:
 *
 * Map<Integer, String> hashMap = new HashMap<>();
 * hashMap.put(1, "one");
 * hashMap.put(2, "two");
 * String value = hashMap.get(1); // Returns "one"
 * hashMap.remove(2); // Removes the key 2
 *
 * Note: The performance of a HashMap is significantly affected by its load factor and initial capacity. It's important
 * to set these appropriately based on the expected number of elements in the HashMap.
 */
