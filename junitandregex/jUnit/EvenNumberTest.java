import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem:
Test isEven using parameterized tests
*/

public class EvenNumberTest {

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        if (number % 2 == 0) {
            assertTrue(isEven(number));
        } else {
            assertFalse(isEven(number));
        }
    }
}
