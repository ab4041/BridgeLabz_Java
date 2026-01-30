/*
5. Selection Sort - Sort Exam Scores
Problem Statement:
A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
Hint:
Find the minimum element in the array.
Swap it with the first unsorted element.
Repeat the process for the remaining elements.
*/

import java.util.Arrays;

public class SelectionSortExamScores {

    static void selectionSort(int[] scores) {
        int n = scores.length;

        // Move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i; // assume current is minimum

            // Find the minimum in remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with first unsorted element
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {65, 90, 72, 88, 50, 95};

        System.out.println("Before Sorting: " + Arrays.toString(examScores));
        selectionSort(examScores);
        System.out.println("After Sorting : " + Arrays.toString(examScores));
    }
}
