import java.util.function.BiFunction;

/*
Problem:
Concatenate two strings with space using BiFunction
*/

public class StringConcat {

    public static void main(String[] args) {

        BiFunction<String, String, String> concat =
                (a, b) -> a + " " + b;

        System.out.println(concat.apply("Hello", "World"));
    }
}
