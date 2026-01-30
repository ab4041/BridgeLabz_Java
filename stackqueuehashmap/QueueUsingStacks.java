/*
Implement a Queue Using Stacks
Problem:
Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint:
Use one stack for enqueue and another stack for dequeue.
Transfer elements between stacks as needed.
*/

import java.util.Stack;

public class QueueUsingStacks {

    static class MyQueue {
        Stack<Integer> s1 = new Stack<>(); // for enqueue
        Stack<Integer> s2 = new Stack<>(); // for dequeue

        // Enqueue -> O(1)
        void enqueue(int x) {
            s1.push(x);
        }

        // Dequeue -> Amortized O(1)
        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow! Queue is empty.");
                return -1;
            }

            // If s2 is empty, transfer all elements from s1 to s2
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }

        boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front: " + q.peek());
    }
}
