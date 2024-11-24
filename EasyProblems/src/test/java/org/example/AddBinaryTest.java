package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddBinaryTest {

    private final AddBinary addBinary = new AddBinary();

    @Test
    public void testBasicAddition() {
        // Test basic binary addition without carry
        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
        assertEquals("10", addBinary.addBinary("1", "1"));
    }

    @Test
    public void testCarryOverAddition() {
        // Test cases where carryover is needed
        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("1000", addBinary.addBinary("111", "1"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }

    @Test
    public void testDifferentLengthInputs() {
        // Test cases where the binary strings have different lengths
        assertEquals("10100", addBinary.addBinary("1001", "1011"));
        assertEquals("100000", addBinary.addBinary("10101", "1011"));
        assertEquals("11010", addBinary.addBinary("10101", "101"));
    }

    @Test
    public void testSingleBitInput() {
        // Test cases with single-bit binary numbers
        assertEquals("0", addBinary.addBinary("0", "0"));
        assertEquals("1", addBinary.addBinary("0", "1"));
        assertEquals("1", addBinary.addBinary("1", "0"));
        assertEquals("10", addBinary.addBinary("1", "1"));
    }

//    @Test
//    public void testEdgeCaseLargeInput() {
//        // Test large input values to check performance
//        String largeInput = "1".repeat(10000); // String of 10000 '1's
//        String result = addBinary.addBinary(largeInput, "1");
//        String expected = "1".repeat(10000) + "0"; // Expected result is 10001 '1's followed by '0'
//        assertEquals(expected, result);
//    }

    @Test
    public void testEdgeCaseSmallInput() {
        // Test case for small input, including edge cases for leading zeroes
        assertEquals("1", addBinary.addBinary("0", "1"));
        assertEquals("1", addBinary.addBinary("1", "0"));
    }

    @Test
    public void testLongerFirstString() {
        // Test where the first string is longer than the second
        assertEquals("10110", addBinary.addBinary("1111", "111"));
        assertEquals("111110", addBinary.addBinary("101101", "10001"));
    }

    @Test
    public void testLongerSecondString() {
        // Test where the second string is longer than the first
        assertEquals("10110", addBinary.addBinary("111", "1111"));
        assertEquals("111110", addBinary.addBinary("10001", "101101"));
    }

    @Test
    public void testLeadingZeros() {
        // Test case where there are leading zeros in one or both input strings
        assertEquals("00100", addBinary.addBinary("00011", "001"));
        assertEquals("01010", addBinary.addBinary("0101", "00101"));
        assertEquals("00010", addBinary.addBinary("00001", "00001"));
    }
}
