/*
Question:
Write a program to demonstrate ArrayIndexOutOfBoundsException.

Hint:
- Access index beyond array length
- Handle exception using try-catch
*/

import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = {"Varun", "Amit", "Ravi"};

        // generateException(names);
        handleException(names);

        sc.close();
    }
}
