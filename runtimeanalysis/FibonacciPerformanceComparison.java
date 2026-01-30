/*
Problem Statement: Recursive vs Iterative Fibonacci Computation

Objective:
Compare recursive (O(2^N)) and iterative (O(N)) approaches.

Expected Result:
Iterative approach is faster and memory-efficient.
*/

public class FibonacciPerformanceComparison {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long start = System.nanoTime();
        fibonacciRecursive(n);
        long end = System.nanoTime();
        System.out.println("Recursive Time: " + (end - start) + " ns");

        start = System.nanoTime();
        fibonacciIterative(n);
        end = System.nanoTime();
        System.out.println("Iterative Time: " + (end - start) + " ns");
    }
}
