/*
Problem: Count word frequency ignoring case & punctuation.
*/

import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
