/*
Question:
Write a program to create a calculator using switch-case.

Hint:
- Operators allowed: +, -, *, /
*/

import java.util.Scanner;

// Class to implement calculator
class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        String operator = input.next();

        // Perform operation
        switch (operator) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
