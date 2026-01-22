/*
7. Counting Sort - Sort Student Ages
Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
*/

import java.util.Arrays;

public class CountingSortStudentAges {

    static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;

        // Count array to store frequency
        int[] count = new int[range];

        // Step 1: store frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: update ages array using count array
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                ages[index] = i + minAge;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 10, 15, 11, 18, 14, 13, 12, 16};

        System.out.println("Before Sorting: " + Arrays.toString(studentAges));
        countingSort(studentAges, 10, 18);
        System.out.println("After Sorting : " + Arrays.toString(studentAges));
    }
}
