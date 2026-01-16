/*
1. Singly Linked List: Student Record Management
Problem Statement: Create a program to manage student records using a singly linked list.
Each node will store information about a student, including their Roll Number, Name, Age, and Grade.
Implement the following operations:
- Add a new student record at the beginning, end, or at a specific position.
- Delete a student record by Roll Number.
- Search for a student record by Roll Number.
- Display all student records.
- Update a student's grade based on their Roll Number.

Hint:
- Use a singly linked list where each node contains student information and a pointer to the next node.
- The head of the list will represent the first student, and the last node’s next pointer will be null.
- Update the next pointers when inserting or deleting nodes.
*/

import java.util.*;

class StudentNode {
    int roll;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private StudentNode head;

    // Insert at beginning (O(1))
    public void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end (O(n))
    public void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Insert at position (1-based index)
    public void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos <= 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range. Adding at end.");
            addAtEnd(roll, name, age, grade);
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRoll(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.roll == roll) {
            head = head.next;
            System.out.println("Deleted student with Roll: " + roll);
            return;
        }

        StudentNode prev = head;
        StudentNode curr = head.next;

        while (curr != null) {
            if (curr.roll == roll) {
                prev.next = curr.next; // bypass current
                System.out.println("Deleted student with Roll: " + roll);
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Student not found.");
    }

    // Search by Roll
    public void searchByRoll(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: Roll=" + temp.roll + ", Name=" + temp.name + ", Age=" + temp.age + ", Grade=" + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade by Roll
    public void updateGrade(int roll, char newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll: " + roll);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Display all records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records.");
            return;
        }

        StudentNode temp = head;
        System.out.println("---- Student Records ----");
        while (temp != null) {
            System.out.println("Roll=" + temp.roll + ", Name=" + temp.name + ", Age=" + temp.age + ", Grade=" + temp.grade);
            temp = temp.next;
        }
    }
}

public class Main1_StudentRecord {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Varun", 21, 'A');
        list.addAtEnd(102, "Rahul", 20, 'B');
        list.addAtPosition(2, 103, "Asha", 19, 'A');

        list.displayAll();
        list.searchByRoll(103);

        list.updateGrade(102, 'A');
        list.deleteByRoll(101);

        list.displayAll();
    }
}
