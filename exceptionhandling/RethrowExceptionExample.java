/*
Problem Statement:
1. performDivision() performs division and throws ArithmeticException
2. calculate() catches and rethrows exception with additional context
3. main() handles the rethrown exception
*/

public class RethrowExceptionExample {

    static int performDivision(int numerator, int denominator) {
        return numerator / denominator; // may throw ArithmeticException
    }

    static int calculate(int numerator, int denominator) {

        try {
            return performDivision(numerator, denominator);

        } catch (ArithmeticException e) {
            // rethrowing exception with custom message
            throw new ArithmeticException("Error during division: denominator is zero");
        }
    }

    public static void main(String[] args) {

        try {
            int result = calculate(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
