package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseIntTest {

    @Test
    public void testPositiveInteger() {
        assertEquals(321, new ReverseInt().reverse(123));
        assertEquals(21, new ReverseInt().reverse(120));
    }

    @Test
    public void testNegativeInteger() {
        assertEquals(-321, new ReverseInt().reverse(-123));
        assertEquals(-21, new ReverseInt().reverse(-120));
    }

    @Test
    public void testZero() {
        assertEquals(0, new ReverseInt().reverse(0));
    }

    @Test
    public void testIntegerMinValue() {
        assertEquals(0, new ReverseInt().reverse(Integer.MIN_VALUE));
    }

    @Test
    public void testIntegerMaxValue() {
        assertEquals(0, new ReverseInt().reverse(Integer.MAX_VALUE));
    }

    @Test
    public void testOverflow() {
        assertEquals(0, new ReverseInt().reverse(1534236469));
        assertEquals(0, new ReverseInt().reverse(-1534236469));
    }

    @Test
    public void testSingleDigit() {
        assertEquals(1, new ReverseInt().reverse(1));
        assertEquals(-1, new ReverseInt().reverse(-1));
    }

    @Test
    public void testMultipleZeroes() {
        assertEquals(21, new ReverseInt().reverse(12000));
        assertEquals(-21, new ReverseInt().reverse(-12000));
    }
}