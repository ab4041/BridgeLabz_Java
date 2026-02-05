/*
Problem: Count frequency of elements in a list.
Input: ["apple", "banana", "apple", "orange"]
Output: {apple=2, banana=1, orange=1}
*/

import java.util.*;

public class ElementFrequency {

    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
