package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Num1bitsTest {

    @Test
    public void testZeroInput() {
        Num1bits Num1bits = new Num1bits();
        int input = 0;
        int expected = 0;
        int actual = Num1bits.hammingWeight(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testAllOnesInput() {
        Num1bits Num1bits = new Num1bits();
        int input = -1; // All 1s in 32-bit two's complement
        int expected = 32;
        int actual = Num1bits.hammingWeight(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testPositiveInput() {
        Num1bits Num1bits = new Num1bits();
        int input = 11;
        int expected = 3;
        int actual = Num1bits.hammingWeight(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testPowerOfTwoInput() {
        Num1bits Num1bits = new Num1bits();
        int input = 128;
        int expected = 1;
        int actual = Num1bits.hammingWeight(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRandomInputs() {
        Num1bits Num1bits = new Num1bits();
        int[] inputs = {12345, 67890, 1024, 2048};
        int[] expectedOutputs = {6, 6, 1, 1};

        for (int i = 0; i < inputs.length; i++) {
            int actual = Num1bits.hammingWeight(inputs[i]);
            assertEquals(expectedOutputs[i], actual);
        }
    }
}
