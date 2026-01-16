/*
Question:
Write a program to demonstrate NumberFormatException.

Hint:
- Take String input
- Use Integer.parseInt()
- Handle exception using try-catch
*/

import java.util.Scanner;

class NumberFormatDemo {

    public static void generateException(String text) {
        Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);

        sc.close();
    }
}
