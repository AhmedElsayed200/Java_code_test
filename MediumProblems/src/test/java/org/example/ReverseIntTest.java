package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntTest {
    @Test
    public void testPositiveNumber() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = 123;
        int expected = 321;
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testNegativeNumber() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = -123;
        int expected = -321;
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testNumberEndingWithZero() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = 120;
        int expected = 21;
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testZero() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = 0;
        int expected = 0;
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testOverflowPositive() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = 1534236469; // Reversing this will overflow
        int expected = 0;
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testOverflowNegative() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = -1534236469; // Reversing this will overflow
        int expected = 0;
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testSmallest32BitInteger() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = Integer.MIN_VALUE;
        int expected = 0; // Reversing this will overflow
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testLargest32BitInteger() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = Integer.MAX_VALUE;
        int expected = 0; // Reversing this will overflow
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testSingleDigitPositive() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = 5;
        int expected = 5;
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testSingleDigitNegative() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = -7;
        int expected = -7;
        assertEquals(expected, ReverseInt.reverse(input));
    }

    @Test
    public void testTrailingZeros() {
        ReverseInt ReverseInt = new ReverseInt();
        int input = 1000;
        int expected = 1;
        assertEquals(expected, ReverseInt.reverse(input));
    }
}