/*
Implement a Custom Hash Map
Problem:
Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
Hint:
Use an array of linked lists to handle collisions using separate chaining.
*/

import java.util.LinkedList;

public class CustomHashMap {

    // Node for key-value pair
    static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    static class MyHashMap {
        private final int SIZE = 10; // fixed bucket size for simplicity
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        MyHashMap() {
            buckets = new LinkedList[SIZE];
            for (int i = 0; i < SIZE; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hash(int key) {
            return key % SIZE; // simple hash function
        }

        // Put (insert/update)
        void put(int key, int value) {
            int index = hash(key);

            for (Node node : buckets[index]) {
                if (node.key == key) {
                    node.value = value; // update existing
                    return;
                }
            }

            buckets[index].add(new Node(key, value)); // insert new
        }

        // Get value by key
        int get(int key) {
            int index = hash(key);

            for (Node node : buckets[index]) {
                if (node.key == key) {
                    return node.value;
                }
            }

            return -1; // not found
        }

        // Remove key
        void remove(int key) {
            int index = hash(key);

            for (Node node : buckets[index]) {
                if (node.key == key) {
                    buckets[index].remove(node);
                    return;
                }
            }
        }

        void display() {
            System.out.println("HashMap Contents:");
            for (int i = 0; i < SIZE; i++) {
                System.out.print("Bucket " + i + ": ");
                for (Node node : buckets[i]) {
                    System.out.print("[" + node.key + "=" + node.value + "] ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 120); // collision with key 2 (since 12 % 10 = 2)

        System.out.println("Get key 2: " + map.get(2));
        System.out.println("Get key 12: " + map.get(12));

        map.remove(2);
        System.out.println("After removing key 2:");
        map.display();
    }
}
