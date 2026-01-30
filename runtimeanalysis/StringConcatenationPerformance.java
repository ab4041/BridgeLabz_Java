/*
Problem Statement: String Concatenation Performance

Objective:
Compare String (O(N^2)), StringBuilder (O(N)),
and StringBuffer (O(N)) for large concatenations.

Expected Result:
StringBuilder is fastest in single-threaded environments.
*/

public class StringConcatenationPerformance {

    public static void main(String[] args) {
        int n = 100_000;

        long start, end;

        start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        end = System.nanoTime();
        System.out.println("String Time: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) + " ns");
    }
}
