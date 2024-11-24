package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomantoIntTest {

    @Test
    public void testSingleDigitRomanNumerals() {
        RomantoInt romanToInt = new RomantoInt();
        assertEquals(1, romanToInt.romanToInt("I"));
        assertEquals(5, romanToInt.romanToInt("V"));
        assertEquals(10, romanToInt.romanToInt("X"));
        assertEquals(50, romanToInt.romanToInt("L"));
        assertEquals(100, romanToInt.romanToInt("C"));
        assertEquals(500, romanToInt.romanToInt("D"));
        assertEquals(1000, romanToInt.romanToInt("M"));
    }

    @Test
    public void testSimpleRomanNumerals() {
        RomantoInt romanToInt = new RomantoInt();
        assertEquals(3, romanToInt.romanToInt("III"));
        assertEquals(8, romanToInt.romanToInt("VIII"));
        assertEquals(12, romanToInt.romanToInt("XII"));
        assertEquals(18, romanToInt.romanToInt("XVIII"));
    }

    @Test
    public void testSubtractionRomanNumerals() {
        RomantoInt romanToInt = new RomantoInt();
        assertEquals(4, romanToInt.romanToInt("IV"));
        assertEquals(9, romanToInt.romanToInt("IX"));
        assertEquals(40, romanToInt.romanToInt("XL"));
        assertEquals(90, romanToInt.romanToInt("XC"));
        assertEquals(400, romanToInt.romanToInt("CD"));
        assertEquals(900, romanToInt.romanToInt("CM"));
    }

    @Test
    public void testComplexRomanNumerals() {
        RomantoInt romanToInt = new RomantoInt();
        assertEquals(58, romanToInt.romanToInt("LVIII"));
        assertEquals(1994, romanToInt.romanToInt("MCMXCIV"));
        assertEquals(3999, romanToInt.romanToInt("MMMCMXCIX"));
    }

//    @Test
//    public void testInvalidInput() {
//        RomantoInt romanToInt = new RomantoInt();
//        assertThrows(IllegalArgumentException.class, () -> romanToInt.romanToInt("IIII"));
//        assertThrows(IllegalArgumentException.class, () -> romanToInt.romanToInt("VV"));
//        assertThrows(IllegalArgumentException.class, () -> romanToInt.romanToInt("MMMM"));
//    }
}
