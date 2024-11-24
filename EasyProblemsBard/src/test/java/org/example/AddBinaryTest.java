package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddBinaryTest {

    @Test
    public void testSingleDigitAddition() {
        AddBinary addBinary = new AddBinary();
        assertEquals("10", addBinary.addBinary("1", "1"));
    }

    @Test
    public void testMultipleDigitAddition() {
        AddBinary addBinary = new AddBinary();
        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }

    @Test
    public void testLeadingZeros() {
        AddBinary addBinary = new AddBinary();
        assertEquals("111", addBinary.addBinary("011", "100"));
    }

    @Test
    public void testUnequalLengthInputs() {
        AddBinary addBinary = new AddBinary();
        assertEquals("100", addBinary.addBinary("1", "11"));
        assertEquals("100001", addBinary.addBinary("1010", "10111"));
    }

    @Test
    public void testZeroInput() {
        AddBinary addBinary = new AddBinary();
        assertEquals("0", addBinary.addBinary("0", "0"));
        assertEquals("1", addBinary.addBinary("0", "1"));
        assertEquals("1", addBinary.addBinary("1", "0"));
    }

    @Test
    public void testLargeNumbers() {
        AddBinary addBinary = new AddBinary();
        assertEquals("11111111111111111111111111111110", addBinary.addBinary("1111111111111111111111111111111", "1111111111111111111111111111111"));
    }
}