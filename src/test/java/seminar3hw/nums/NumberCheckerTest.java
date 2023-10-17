package seminar3hw.nums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberCheckerTest {
    private NumberChecker checker;

    @BeforeEach
    void setUp() {
        checker = new NumberChecker();
    }

    //проверяет, является ли переданное число четным или нечетным:
    @Test
    void evenOddNumberTest() {
        assertTrue(checker.evenOddNumber(2));
        assertFalse(checker.evenOddNumber(5));
    }

    //Второй вариант теста к методу evenOddNumber
    @ParameterizedTest
    @CsvSource({
            "2, true",
            "4, true",
            "6, true",
            "8, true",
            "10, true",
            "1, false",
            "3, false",
            "5, false",
            "7, false",
            "9, false"
    })
    public void testEvenOddNumber(int number, boolean expected) {
        assertEquals(expected, checker.evenOddNumber(number));
    }

    //проверяет, попадает ли переданное число в интервал (25;100)
    @Test
    void numberInIntervalTest() {
        int num = 30;
        assertTrue(checker.numberInInterval(30));
        assertFalse(checker.numberInInterval(15));
    }
    //Второй вариант теста к методу numberInInterval
    @ParameterizedTest
    @CsvSource({
            "10, false",
            "25, true",
            "50, true",
            "75, true",
            "99, true",
            "-1, false",
            "0, false",
            "26, true",
            "100, true",
            "101, false"
    })
    public void testNumberInInterval(int number, boolean expected) {
        assertEquals(expected, checker.numberInInterval(number));
    }


}