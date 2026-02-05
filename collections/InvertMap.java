/*
Problem: Invert Map<K,V> to Map<V,List<K>>
*/

import java.util.*;

public class InvertMap {

    public static void main(String[] args) {
        Map<String, Integer> input = Map.of("A", 1, "B", 2, "C", 1);
        Map<Integer, List<String>> output = new HashMap<>();

        for (var entry : input.entrySet()) {
            output.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                  .add(entry.getKey());
        }

        System.out.println(output);
    }
}
