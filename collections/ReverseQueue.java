/*
Problem: Reverse a queue using only queue operations.
Input: [10, 20, 30]
Output: [30, 20, 10]
*/

import java.util.*;

public class ReverseQueue {

    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) return;
        int x = queue.remove();
        reverse(queue);
        queue.add(x);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(List.of(10, 20, 30));
        reverse(queue);
        System.out.println(queue);
    }
}
