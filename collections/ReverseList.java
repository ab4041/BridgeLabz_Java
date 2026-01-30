/*
Problem: Reverse a List without using built-in reverse methods.
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
*/

import java.util.*;

public class ReverseList {

    public static <T> List<T> reverseList(List<T> list) {
        List<T> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(arrayList);

        System.out.println(reverseList(arrayList));
        System.out.println(reverseList(linkedList));
    }
}
