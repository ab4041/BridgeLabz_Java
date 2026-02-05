import java.util.InputMismatchException;
import java.util.Scanner;

/*
Problem Statement:
Ask the user to enter two numbers and divide them.
Handle:
- ArithmeticException (division by zero)
- InputMismatchException (non-numeric input)
*/

public class DivisionExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int a = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numbers");

        } finally {
            scanner.close();
        }
    }
}
