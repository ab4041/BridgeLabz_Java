/*
Problem: Find key with maximum value.
*/

import java.util.*;

public class MaxValueKey {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        String maxKey = null;
        int max = Integer.MIN_VALUE;

        for (var entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey);
    }
}
