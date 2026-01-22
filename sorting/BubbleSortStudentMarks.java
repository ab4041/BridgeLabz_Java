/*
1. Bubble Sort - Sort Student Marks
Problem Statement:
A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
Hint:
Traverse through the array multiple times.
Compare adjacent elements and swap if needed.
Repeat the process until no swaps are required.
*/

import java.util.Arrays;

public class BubbleSortStudentMarks {

    // Bubble Sort method
    static void bubbleSort(int[] marks) {
        int n = marks.length;

        // Outer loop -> number of passes
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false; // optimization: stop if already sorted

            // Inner loop -> compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // swap marks[j] and marks[j+1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened -> array already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {78, 45, 90, 62, 88, 35, 70};

        System.out.println("Before Sorting: " + Arrays.toString(studentMarks));
        bubbleSort(studentMarks);
        System.out.println("After Sorting : " + Arrays.toString(studentMarks));
    }
}
