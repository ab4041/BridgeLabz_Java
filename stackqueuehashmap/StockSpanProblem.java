/*
Stock Span Problem
Problem:
For each day in a stock price array, calculate the span
(number of consecutive days the price was less than or equal to the current day's price).
Hint:
Use a stack to keep track of indices of prices in descending order.
*/

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {

    static int[] stockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {

            // Pop while current price >= stack top price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack empty -> span = i + 1 (all previous are smaller)
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Span  : " + Arrays.toString(stockSpan(prices)));
    }
}
