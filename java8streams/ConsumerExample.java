import java.util.List;
import java.util.function.Consumer;

/*
Problem:
Print each string in uppercase using Consumer
*/

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());

        List.of("java", "streams", "lambda").forEach(printUpper);
    }
}
