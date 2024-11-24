package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Num1bitsTest {

    private final Num1bits num1bits = new Num1bits();

    // Test Case 1: A basic test with a small number (11)
    @Test
    public void testHammingWeight_11() {
        int input = 11; // Binary: 1011, Hamming weight: 3
        int expected = 3;
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 2: A basic test with a single bit set (128)
    @Test
    public void testHammingWeight_128() {
        int input = 128; // Binary: 10000000, Hamming weight: 1
        int expected = 1;
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 3: A test with a large number (2147483645)
    @Test
    public void testHammingWeight_2147483645() {
        int input = 2147483645; // Binary: 1111111111111111111111111111101, Hamming weight: 30
        int expected = 30;
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 4: A test with the smallest possible number (1)
    @Test
    public void testHammingWeight_1() {
        int input = 1; // Binary: 1, Hamming weight: 1
        int expected = 1;
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 5: A test with the largest possible 32-bit signed integer (Integer.MAX_VALUE)
    @Test
    public void testHammingWeight_MaxValue() {
        int input = Integer.MAX_VALUE; // Binary: 0111111111111111111111111111111, Hamming weight: 31
        int expected = 31;
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 6: A test with 0 (no set bits)
    @Test
    public void testHammingWeight_0() {
        int input = 0; // Binary: 00000000, Hamming weight: 0
        int expected = 0;
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 7: A test with all bits set (Integer.MAX_VALUE - 1)
    @Test
    public void testHammingWeight_AllSetBits() {
        int input = Integer.MAX_VALUE - 1; // Binary: 1111111111111111111111111111110, Hamming weight: 31
        int expected = 30;
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 8: A test with an alternating bit pattern
    @Test
    public void testHammingWeight_AlternatingBits() {
        int input = Integer.parseInt("1010101010101010101010101010101", 2); // Binary pattern: alternating 1s and 0s
        int expected = 16; // Hamming weight: 16 (half the bits are set to 1)
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 9: A random large value
    @Test
    public void testHammingWeight_RandomLargeValue() {
        int input = 1234567890; // Random large value
        int expected = 12; // Binary: 0100100111101111101011011010010, Hamming weight: 16
        assertEquals(expected, num1bits.hammingWeight(input));
    }

    // Test Case 10: A test with only one bit set at the most significant bit position
    @Test
    public void testHammingWeight_MostSignificantBit() {
        int input = 1 << 31; // Binary: 10000000000000000000000000000000, Hamming weight: 1
        int expected = 1;
        assertEquals(expected, num1bits.hammingWeight(input));
    }
}
