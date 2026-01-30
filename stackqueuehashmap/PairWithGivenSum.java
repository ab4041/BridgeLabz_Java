/*
Check for a Pair with Given Sum in an Array
Problem:
Given an array and a target sum, find if there exists a pair of elements
whose sum is equal to the target.
Hint:
Store visited numbers in a hash map and check if target - current_number exists.
*/

import java.util.HashSet;

public class PairWithGivenSum {

    static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int needed = target - num;

            if (seen.contains(needed)) {
                System.out.println("Pair Found: " + needed + " + " + num + " = " + target);
                return true;
            }

            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        if (!hasPair(arr, target)) {
            System.out.println("No pair found for target = " + target);
        }
    }
}
