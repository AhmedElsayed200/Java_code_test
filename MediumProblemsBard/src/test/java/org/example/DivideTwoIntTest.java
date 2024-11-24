package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivideTwoIntTest {

    @Test
    public void testPositiveDivisor() {
        assertEquals(3, new DivideTwoInt().divide(10, 3));
        assertEquals(2, new DivideTwoInt().divide(7, 3));
    }

    @Test
    public void testNegativeDivisor() {
        assertEquals(-2, new DivideTwoInt().divide(7, -3));
        assertEquals(-3, new DivideTwoInt().divide(-10, 3));
    }

//    @Test
//    public void testZeroDivisor() {
//        assertThrows(ArithmeticException.class, () -> new DivideTwoInt().divide(10, 0));
//    }

    @Test
    public void testIntegerMinValue() {
        assertEquals(Integer.MAX_VALUE, new DivideTwoInt().divide(Integer.MIN_VALUE, -1));
    }

    @Test
    public void testIntegerMaxValue() {
        assertEquals(Integer.MAX_VALUE, new DivideTwoInt().divide(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(1000000, new DivideTwoInt().divide(1000000000, 1000));
    }

    @Test
    public void testSmallNumbers() {
        assertEquals(-1, new DivideTwoInt().divide(-1, 1));
        assertEquals(1, new DivideTwoInt().divide(1, 1));
    }
}