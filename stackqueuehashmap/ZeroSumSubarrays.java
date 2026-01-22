/*
Find All Subarrays with Zero Sum
Problem:
Given an array, find all subarrays whose elements sum up to zero.
Hint:
Use a hash map to store the cumulative sum and its frequency.
If a sum repeats, a zero-sum subarray exists.
*/

import java.util.*;

public class ZeroSumSubarrays {

    static void findZeroSumSubarrays(int[] arr) {
        // Map: prefixSum -> list of indices where prefixSum occurred
        Map<Integer, List<Integer>> map = new HashMap<>();

        int prefixSum = 0;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1); // helps handle subarrays starting at index 0

        System.out.println("Zero-sum subarrays:");

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {
                // Found repeated sum => all those previous indices form zero-sum subarrays
                for (int startIndex : map.get(prefixSum)) {
                    System.out.println("From index " + (startIndex + 1) + " to " + i);
                }
            }

            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, -2, -2, 2, 2, -4, 1};

        findZeroSumSubarrays(arr);
    }
}
