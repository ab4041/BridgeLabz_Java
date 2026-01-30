public class CompareStringBufferAndStringBuilder {

    /*
     StringBuffer Problem 2: Compare StringBuffer with StringBuilder for String Concatenation
     Problem:
     Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings.
     For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.

     Approach:
     Initialize two StringBuffer and StringBuilder objects.
     Perform string concatenation in both objects, appending 1 million strings (e.g., "hello").
     Measure the time taken using System.nanoTime() for both.
     Output the time taken by both classes for comparison.
    */

    public static void main(String[] args) {
        int n = 1_000_000;

        //  StringBuilder timing (faster, not synchronized)
        long startBuilder = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }
        long endBuilder = System.nanoTime();

        //  StringBuffer timing (slower, synchronized)
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }
        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder Time (ns): " + (endBuilder - startBuilder));
        System.out.println("StringBuffer  Time (ns): " + (endBuffer - startBuffer));
    }
}
