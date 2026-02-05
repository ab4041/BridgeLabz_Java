import java.util.List;
import java.util.function.Predicate;

/*
Problem:
Filter strings with length > 5 and containing "Java"
*/

public class PredicateComposition {

    public static void main(String[] args) {

        List<String> list = List.of("JavaStream", "Java", "PythonCode");

        Predicate<String> lengthCheck = s -> s.length() > 5;
        Predicate<String> containsJava = s -> s.contains("Java");

        list.stream()
            .filter(lengthCheck.and(containsJava))
            .forEach(System.out::println);
    }
}
