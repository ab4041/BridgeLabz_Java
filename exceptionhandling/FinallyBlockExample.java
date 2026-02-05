import java.util.Scanner;

/*
Problem Statement:
Demonstrate finally block execution
*/

public class FinallyBlockExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");

        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}
