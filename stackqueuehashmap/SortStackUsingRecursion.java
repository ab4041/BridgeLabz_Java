/*
Sort a Stack Using Recursion
Problem:
Given a stack, sort its elements in ascending order using recursion.
Hint:
Pop elements recursively, sort the remaining stack,
and insert the popped element back at the correct position.
*/

import java.util.Stack;

public class SortStackUsingRecursion {

    // Insert an element into sorted stack at correct position
    static void insertSorted(Stack<Integer> stack, int value) {
        // Base case: stack is empty OR value is bigger than top
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, value);
        stack.push(top); // put back the removed element
    }

    // Recursively sort stack
    static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();
        sortStack(stack);          // sort remaining stack
        insertSorted(stack, top);  // insert removed element correctly
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);

        System.out.println("Before Sorting: " + stack);
        sortStack(stack);
        System.out.println("After Sorting : " + stack);
    }
}
