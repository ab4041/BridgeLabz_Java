import java.util.List;

/*
Problem:
Filter strings starting with letter 'A'
*/

public class FilterStrings {

    public static void main(String[] args) {

        List<String> names = List.of("Apple", "Banana", "Avocado", "Mango");

        names.stream()
             .filter(s -> s.startsWith("A"))
             .forEach(System.out::println);
    }
}
