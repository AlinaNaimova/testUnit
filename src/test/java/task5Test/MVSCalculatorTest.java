package task5Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task5.MVSCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class MVSCalculatorTest {

    private MVSCalculator calculator;
    //MVSCalculator calculator = new MVSCalculator();
    @BeforeEach
    public void setUp() {
        calculator = new MVSCalculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}