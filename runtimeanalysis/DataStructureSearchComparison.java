/*
Problem Statement: Comparing Different Data Structures for Searching

Objective:
Compare search performance of Array, HashSet, and TreeSet.

Expected Result:
HashSet offers fastest lookup.
TreeSet maintains order with log(N) cost.
*/

import java.util.*;

public class DataStructureSearchComparison {

    public static void main(String[] args) {
        int n = 1_000_000;
        int target = n - 1;

        List<Integer> array = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            array.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, end;

        start = System.nanoTime();
        array.contains(target);
        end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }
}
