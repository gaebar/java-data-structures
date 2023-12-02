package dev.gaetanobarreca.maps;

// aaabbc
//
//result a=3, b=2, c=1


import java.util.Map;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "aaabbc";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

