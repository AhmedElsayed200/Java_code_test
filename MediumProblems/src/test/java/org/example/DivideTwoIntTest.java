package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntTest {

    private final DivideTwoInt divideTwoInt = new DivideTwoInt();

    @Test
    void testBasicDivision() {
        assertEquals(3, divideTwoInt.divide(10, 3), "10 divided by 3 should be 3");
        assertEquals(-2, divideTwoInt.divide(7, -3), "7 divided by -3 should be -2");
        assertEquals(1, divideTwoInt.divide(5, 5), "5 divided by 5 should be 1");
        assertEquals(0, divideTwoInt.divide(0, 3), "0 divided by any number should be 0");
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-3, divideTwoInt.divide(-10, 3), "-10 divided by 3 should be -3");
        assertEquals(3, divideTwoInt.divide(-10, -3), "-10 divided by -3 should be 3");
        assertEquals(-1, divideTwoInt.divide(1, -1), "1 divided by -1 should be -1");
    }

    @Test
    void testEdgeCases() {
        assertEquals(Integer.MAX_VALUE, divideTwoInt.divide(Integer.MAX_VALUE, 1), "MAX_VALUE divided by 1 should be MAX_VALUE");
        assertEquals(Integer.MIN_VALUE, divideTwoInt.divide(Integer.MIN_VALUE, 1), "MIN_VALUE divided by 1 should be MIN_VALUE");
        assertEquals(Integer.MAX_VALUE, divideTwoInt.divide(Integer.MIN_VALUE, -1), "MIN_VALUE divided by -1 should be clamped to MAX_VALUE");
    }

    @Test
    void testLargeDivisor() {
        assertEquals(0, divideTwoInt.divide(1, Integer.MAX_VALUE), "1 divided by MAX_VALUE should be 0");
        assertEquals(0, divideTwoInt.divide(-1, Integer.MAX_VALUE), "-1 divided by MAX_VALUE should be 0");
    }

    @Test
    void testSmallDivisor() {
        assertEquals(Integer.MAX_VALUE, divideTwoInt.divide(Integer.MAX_VALUE, 1), "MAX_VALUE divided by 1 should be MAX_VALUE");
        assertEquals(Integer.MIN_VALUE, divideTwoInt.divide(Integer.MIN_VALUE, 1), "MIN_VALUE divided by 1 should be MIN_VALUE");
    }

//    @Test
//    void testZeroDivisor() {
//        assertThrows(ArithmeticException.class, () -> divideTwoInt.divide(10, 0), "Division by zero should throw ArithmeticException");
//    }

    @Test
    void testPowerOfTwoDivisors() {
        assertEquals(2, divideTwoInt.divide(4, 2), "4 divided by 2 should be 2");
        assertEquals(8, divideTwoInt.divide(16, 2), "16 divided by 2 should be 8");
        assertEquals(4, divideTwoInt.divide(16, 4), "16 divided by 4 should be 4");
    }
}
