package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomantoIntTest {

    private final RomantoInt romantoInt = new RomantoInt();

    @Test
    public void testSingleRomanNumerals() {
        // Test basic single numeral Roman numerals
        assertEquals(1, romantoInt.romanToInt("I"));
        assertEquals(5, romantoInt.romanToInt("V"));
        assertEquals(10, romantoInt.romanToInt("X"));
        assertEquals(50, romantoInt.romanToInt("L"));
        assertEquals(100, romantoInt.romanToInt("C"));
        assertEquals(500, romantoInt.romanToInt("D"));
        assertEquals(1000, romantoInt.romanToInt("M"));
    }

    @Test
    public void testSubtractiveNotation() {
        // Test Roman numerals with subtractive notation
        assertEquals(4, romantoInt.romanToInt("IV"));
        assertEquals(9, romantoInt.romanToInt("IX"));
        assertEquals(40, romantoInt.romanToInt("XL"));
        assertEquals(90, romantoInt.romanToInt("XC"));
        assertEquals(400, romantoInt.romanToInt("CD"));
        assertEquals(900, romantoInt.romanToInt("CM"));
    }

    @Test
    public void testCombinationOfNumerals() {
        // Test combinations of numerals
        assertEquals(3, romantoInt.romanToInt("III"));
        assertEquals(58, romantoInt.romanToInt("LVIII"));
        assertEquals(1994, romantoInt.romanToInt("MCMXCIV"));
        assertEquals(1999, romantoInt.romanToInt("MCMXCIX"));
    }

    @Test
    public void testLargestRomanNumeral() {
        // Test the largest possible value (3999)
        assertEquals(3999, romantoInt.romanToInt("MMMCMXCIX"));
    }

    @Test
    public void testBoundaryValues() {
        // Test boundary cases
        assertEquals(1, romantoInt.romanToInt("I"));
        assertEquals(3999, romantoInt.romanToInt("MMMCMXCIX"));
    }

    @Test
    public void testInvalidInputs() {
        // Given the problem guarantee that the input will be a valid Roman numeral,
        // we are not testing invalid inputs here. However, in a more robust solution,
        // error handling can be added for invalid cases (if the problem constraints change).
    }
}
