import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
JUnit test cases for Calculator class
*/

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
