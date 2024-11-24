package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Plue1Test {

    @Test
    public void testSingleDigitIncrement() {
        Plue1 plusOne = new Plue1();
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }

    @Test
    public void testMultipleDigitIncrement() {
        Plue1 plusOne = new Plue1();
        int[] digits = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }

    @Test
    public void testLeadingZeros() {
        Plue1 plusOne = new Plue1();
        int[] digits = {0};
        int[] expected = {1};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }

//    @Test
//    public void testMultipleLeadingZeros() {
//        Plue1 plusOne = new Plue1();
//        int[] digits = {0, 0, 0};
//        int[] expected = {1, 0, 0};
//        assertArrayEquals(expected, plusOne.plusOne(digits));
//    }

    @Test
    public void testLargeNumberIncrement() {
        Plue1 plusOne = new Plue1();
        int[] digits = {9, 9, 9, 9};
        int[] expected = {1, 0, 0, 0, 0};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }

    @Test
    public void testZeroIncrement() {
        Plue1 plusOne = new Plue1();
        int[] digits = {0};
        int[] expected = {1};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }
}
