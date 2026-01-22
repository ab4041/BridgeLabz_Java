/*
Longest Consecutive Sequence
Problem:
Given an unsorted array, find the length of the longest consecutive elements sequence.
Hint:
Use a hash set to store elements and check for consecutive sequence starts efficiently.
*/

import java.util.HashSet;

public class LongestConsecutiveSequence {

    static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        int longest = 0;

        for (int x : arr) {
            // Only start counting if x is the beginning of a sequence
            if (!set.contains(x - 1)) {
                int current = x;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest Consecutive Length: " + longestConsecutive(arr));
    }
}
