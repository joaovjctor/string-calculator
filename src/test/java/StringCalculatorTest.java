import org.example.StringCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void testEmptyStringReturnsZero() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(10, new StringCalculator().add("1,2,3,4"));
    }

    @Test
    public void testNewlineAsDelimiter() {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

    @Test
    public void testCustomDelimiter() {
        assertEquals(3, new StringCalculator().add("//;\n1;2"));
    }

    @Test
    public void testNegativeNumberThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new StringCalculator().add("-1,2");
        });
        assertTrue(exception.getMessage().contains("Negatives not allowed"));
    }

    @Test
    public void testIgnoreNumbersAbove1000() {
        assertEquals(2, new StringCalculator().add("2,1001"));
    }
}
