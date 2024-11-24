package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Plue1Test {

    private final Plue1 plue1 = new Plue1();

    @Test
    public void testBasicInputWithoutCarry() {
        // Test basic case where no carryover happens.
        assertArrayEquals(new int[] {1, 2, 3}, plue1.plusOne(new int[] {1, 2, 2}));
        assertArrayEquals(new int[] {5}, plue1.plusOne(new int[] {4}));
    }

    @Test
    public void testCarryOverFromLastDigit() {
        // Test cases where only the last digit has a carryover.
        assertArrayEquals(new int[] {1, 0, 0}, plue1.plusOne(new int[] {9, 9}));
        assertArrayEquals(new int[] {1, 0, 0, 0}, plue1.plusOne(new int[] {9, 9, 9}));
    }

    @Test
    public void testMultipleCarryovers() {
        // Test cases with multiple carryovers (when 9's appear in the middle).
        assertArrayEquals(new int[] {1, 0, 0, 0}, plue1.plusOne(new int[] {9, 9, 9}));
        assertArrayEquals(new int[] {1, 0, 0, 0, 0}, plue1.plusOne(new int[] {9, 9, 9, 9}));
    }

    @Test
    public void testSingleDigitInput() {
        // Test single-digit input.
        assertArrayEquals(new int[] {2}, plue1.plusOne(new int[] {1}));
        assertArrayEquals(new int[] {1}, plue1.plusOne(new int[] {0}));
        assertArrayEquals(new int[] {9}, plue1.plusOne(new int[] {8}));
    }

    @Test
    public void testEdgeCaseAllNines() {
        // Test case where all digits are 9, expect array size to increase by 1.
        assertArrayEquals(new int[] {1, 0}, plue1.plusOne(new int[] {9}));
        assertArrayEquals(new int[] {1, 0, 0}, plue1.plusOne(new int[] {9, 9}));
        assertArrayEquals(new int[] {1, 0, 0, 0}, plue1.plusOne(new int[] {9, 9, 9}));
    }

//    @Test
//    public void testEmptyInput() {
//        // Edge case for empty input (though this may not occur due to problem constraints).
//        // Just to make sure nothing breaks if input validation changes.
//        assertArrayEquals(new int[] {1}, plue1.plusOne(new int[] {}));
//    }

//    @Test
//    public void testPerformanceWithLargeInput() {
//        // Test case with a very large number of digits (e.g., 1000 digits).
//        int[] largeInput = new int[1000];
//        for (int i = 0; i < 999; i++) {
//            largeInput[i] = 9;
//        }
//        largeInput[999] = 8;  // Last digit is 8, so we expect carry over from the last 9's
//        int[] expected = new int[1001];
//        expected[0] = 1;
//        for (int i = 1; i <= 999; i++) {
//            expected[i] = 0;
//        }
//        expected[1000] = 9; // The last digit after addition
//        assertArrayEquals(expected, plue1.plusOne(largeInput));
//    }

    @Test
    public void testNoCarryMultipleDigits() {
        // Test cases with no carryover through multiple digits.
        assertArrayEquals(new int[] {1, 2, 3}, plue1.plusOne(new int[] {1, 2, 2}));
        assertArrayEquals(new int[] {4, 5}, plue1.plusOne(new int[] {4, 4}));
    }

    @Test
    public void testCarryOnSecondLastDigit() {
        // Test case where carryover affects the second last digit.
        assertArrayEquals(new int[] {1, 0, 0, 0}, plue1.plusOne(new int[] {9, 9, 9}));
        assertArrayEquals(new int[] {1, 0, 0, 0, 0}, plue1.plusOne(new int[] {9, 9, 9, 9}));
    }
}
