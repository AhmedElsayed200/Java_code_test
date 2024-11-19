package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringToIntTest {

    @Test
    public void testBasicPositiveNumber() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(42, stringToInt.myAtoi("42"));
    }

    @Test
    public void testBasicNegativeNumber() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(-42, stringToInt.myAtoi("   -42"));
    }

    @Test
    public void testLeadingWhitespace() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(42, stringToInt.myAtoi("   42"));
    }

    @Test
    public void testNumberWithTrailingNonDigitCharacters() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(1337, stringToInt.myAtoi("1337c0d3"));
    }

    @Test
    public void testOnlyNonDigitCharacters() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(0, stringToInt.myAtoi("words and 987"));
    }

    @Test
    public void testSingleZero() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(0, stringToInt.myAtoi("0"));
    }

    @Test
    public void testMixedZeroAndSign() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(0, stringToInt.myAtoi("0-1"));
    }

    @Test
    public void testNumberWithLeadingZeros() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(42, stringToInt.myAtoi("00042"));
    }

    @Test
    public void testOverflowPositive() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(Integer.MAX_VALUE, stringToInt.myAtoi("2147483648"));
    }

    @Test
    public void testOverflowNegative() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(Integer.MIN_VALUE, stringToInt.myAtoi("-2147483649"));
    }

    @Test
    public void testIntegerMaxBoundary() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(Integer.MAX_VALUE, stringToInt.myAtoi(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void testIntegerMinBoundary() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(Integer.MIN_VALUE, stringToInt.myAtoi(String.valueOf(Integer.MIN_VALUE)));
    }

    @Test
    public void testEmptyString() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(0, stringToInt.myAtoi(""));
    }

    @Test
    public void testStringWithOnlySpaces() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(0, stringToInt.myAtoi("   "));
    }

    @Test
    public void testSignOnly() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(0, stringToInt.myAtoi("-"));
        assertEquals(0, stringToInt.myAtoi("+"));
    }

    @Test
    public void testStringWithDecimalPoint() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(3, stringToInt.myAtoi("3.14"));
    }

    @Test
    public void testStringWithNonDigitAfterSign() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(0, stringToInt.myAtoi("-abc"));
    }

    @Test
    public void testStringWithWhitespaceAfterSign() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(0, stringToInt.myAtoi("- 123"));
    }

//    @Test
//    public void testNumberWithSpacesInBetween() {
//        StringToInt stringToInt = new StringToInt();
//        assertEquals(0, stringToInt.myAtoi("123 456"));
//    }

    @Test
    public void testNegativeNumberWithTrailingCharacters() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(-123, stringToInt.myAtoi("-123abc"));
    }

    @Test
    public void testPositiveNumberWithLeadingPlus() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(123, stringToInt.myAtoi("+123"));
    }

    @Test
    public void testNumberExceedingMaxDigits() {
        StringToInt stringToInt = new StringToInt();
        assertEquals(Integer.MAX_VALUE, stringToInt.myAtoi("999999999999999999999"));
    }
}
