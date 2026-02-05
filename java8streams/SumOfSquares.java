import java.util.List;

/*
Problem:
Find sum of squares of even numbers using map and reduce
*/

public class SumOfSquares {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        int result = numbers.stream()
                            .filter(n -> n % 2 == 0)
                            .map(n -> n * n)
                            .reduce(0, Integer::sum);

        System.out.println("Sum of squares: " + result);
    }
}
