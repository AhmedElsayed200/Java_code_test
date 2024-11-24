package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringToIntTest {

    @Test
    public void testPositiveInteger() {
        assertEquals(42, new StringToInt().myAtoi("42"));
    }

    @Test
    public void testNegativeInteger() {
        assertEquals(-42, new StringToInt().myAtoi("-42"));
    }

    @Test
    public void testLeadingWhitespace() {
        assertEquals(42, new StringToInt().myAtoi("   42"));
    }

    @Test
    public void testTrailingWhitespace() {
        assertEquals(42, new StringToInt().myAtoi("42   "));
    }

    @Test
    public void testLeadingZeros() {
        assertEquals(42, new StringToInt().myAtoi("0042"));
    }

    @Test
    public void testNonNumericCharacters() {
        assertEquals(0, new StringToInt().myAtoi("words and 987"));
    }

    @Test
    public void testOverflow() {
        assertEquals(Integer.MAX_VALUE, new StringToInt().myAtoi("2147483648"));
        assertEquals(Integer.MIN_VALUE, new StringToInt().myAtoi("-2147483649"));
    }

    @Test
    public void testMixedSigns() {
        assertEquals(0, new StringToInt().myAtoi("+ -1"));
    }

    @Test
    public void testEmptyInput() {
        assertEquals(0, new StringToInt().myAtoi(""));
    }

    @Test
    public void testSingleSign() {
        assertEquals(0, new StringToInt().myAtoi("-"));
        assertEquals(0, new StringToInt().myAtoi("+"));
    }

    @Test
    public void testDecimalNumber() {
        assertEquals(42, new StringToInt().myAtoi("42.34"));
    }
}