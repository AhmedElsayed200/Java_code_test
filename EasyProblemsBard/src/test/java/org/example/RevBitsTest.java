package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevBitsTest {

    @Test
    public void testZeroInput() {
        RevBits revBits = new RevBits();
        int input = 0;
        int expected = 0;
        int actual = revBits.reverseBits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testAllOnesInput() {
        RevBits revBits = new RevBits();
        int input = -1; // All 1s in 32-bit two's complement
        int expected = -1; // All 1s in 32-bit unsigned integer
        int actual = revBits.reverseBits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testPositiveInput() {
        RevBits revBits = new RevBits();
        int input = 43261596;
        int expected = 482088096;
        int actual = revBits.reverseBits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeInput() {
        RevBits revBits = new RevBits();
        int input = -3;
        int expected = -536870913;
        int actual = revBits.reverseBits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRandomInputs() {
        RevBits revBits = new RevBits();
        int[] inputs = {12345, 67890, -12345, -67890};
        int[] expectedOutputs = {1309016064, 642269184, -235274241, -1179140097};

        for (int i = 0; i < inputs.length; i++) {
            int actual = revBits.reverseBits(inputs[i]);
            assertEquals(expectedOutputs[i], actual);
        }
    }
}
