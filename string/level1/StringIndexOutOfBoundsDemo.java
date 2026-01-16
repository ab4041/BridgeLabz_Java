/*
Question:
Write a program to demonstrate StringIndexOutOfBoundsException.

Hint:
- Access index beyond string length
- Handle exception using try-catch
*/

import java.util.Scanner;

class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {
        text.charAt(text.length()); // Invalid index
    }

    public static void handleException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
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
