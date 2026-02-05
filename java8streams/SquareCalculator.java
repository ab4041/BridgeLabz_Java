/*
Problem:
Custom functional interface with default method
*/

@FunctionalInterface
interface Square {
    int calculate(int x);

    default void printResult(int result) {
        System.out.println("Square is: " + result);
    }
}

public class SquareCalculator {

    public static void main(String[] args) {

        Square square = x -> x * x;
        square.printResult(square.calculate(5));
    }
}
