package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevBitsTest {

    private final RevBits revBits = new RevBits();

    @Test
    public void testReverseBits_zero() {
        assertEquals(0, revBits.reverseBits(0));
    }

    @Test
    public void testReverseBits_maxValue() {
        assertEquals(9223372032559808512L, revBits.reverseBits(Integer.MAX_VALUE)); // Result will be of long type
    }

    @Test
    public void testReverseBits_43261596() {
        int input = 43261596; // Binary: 00000010100101000001111010011100
        long expected = 2070552606110908416L; // Binary: 00111001011110000010100101000000
        assertEquals(expected, revBits.reverseBits(input));
    }

    @Test
    public void testReverseBits_minValue() {
        int input = Integer.MIN_VALUE; // Binary: 10000000000000000000000000000000
        long expected = -9223372032559808513L; // Binary: 00000000000000000000000000000001 (in 32-bit signed integer)
        assertEquals(expected, revBits.reverseBits(input));
    }

    @Test
    public void testReverseBits_4294967293() {
        long input = 4294967293L; // Binary: 11111111111111111111111111111101 (32-bit unsigned)
        long expected = 6917529025493598208L; // Binary: 10111111111111111111111111111111 (32-bit unsigned)
        assertEquals(expected, revBits.reverseBits(input));
    }

    @Test
    public void testReverseBits_negativeValue() {
        int input = -3; // Binary: 11111111111111111111111111111101
        long expected = -2305843009213693953L; // Binary: 00111001011110000010100101000000
        assertEquals(expected, revBits.reverseBits(input));
    }

    @Test
    public void testReverseBits_1234567890() {
        int input = 1234567890; // Example input
        long expected = 2711225013570109440L; // Expected reversed result (based on binary reversal)
        assertEquals(expected, revBits.reverseBits(input));
    }
}
