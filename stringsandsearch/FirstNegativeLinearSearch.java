public class FirstNegativeLinearSearch {

    /*
     Linear Search Problem 1: Search for the First Negative Number
     Problem:
     You are given an integer array. Write a program that performs Linear Search
     to find the first negative number in the array.
     If found, return its index. Otherwise return -1.

     Approach:
     Iterate through the array.
     If element < 0 -> return index immediately.
     If not found -> return -1.
    */

    public static int findFirstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) { // first negative number found
                return i;
            }
        }
        return -1; // no negative number
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, -7, 3, -1};

        System.out.println("First Negative Index: " + findFirstNegativeIndex(arr));
    }
}
