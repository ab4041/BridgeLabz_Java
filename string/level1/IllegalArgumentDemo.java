/*
Question:
Write a program to demonstrate IllegalArgumentException using substring().

Hint:
- Start index greater than end index
- Handle exception using try-catch
*/

import java.util.Scanner;

class IllegalArgumentDemo {

    public static void generateException(String text) {
        text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);

        sc.close();
    }
}
