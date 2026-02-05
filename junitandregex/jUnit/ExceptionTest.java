import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem:
Verify ArithmeticException is thrown
*/

public class ExceptionTest {

    @Test
    void testArithmeticException() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}
