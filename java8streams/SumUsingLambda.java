/*
Problem:
Implement a custom functional interface that takes two integers
and returns their sum using lambda expressions.
*/

@FunctionalInterface
interface SumOperation {
    int add(int a, int b);
}

public class SumUsingLambda {

    public static void main(String[] args) {

        SumOperation sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(10, 20));
    }
}
