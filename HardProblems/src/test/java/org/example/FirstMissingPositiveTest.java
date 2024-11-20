package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {

    private final FirstMissingPositive firstMissingPositive = new FirstMissingPositive();

    @Test
    void testExample1() {
        int[] nums = {1, 2, 0};
        int expected = 3;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {3, 4, -1, 1};
        int expected = 2;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testExample3() {
        int[] nums = {7, 8, 9, 11, 12};
        int expected = 1;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithAllPositiveNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 6;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithOnlyNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4};
        int expected = 1;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithSingleElement() {
        int[] nums = {1};
        int expected = 2;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithSingleElementNotOne() {
        int[] nums = {3};
        int expected = 1;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithLargeGap() {
        int[] nums = {100, 200, 300};
        int expected = 1;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int expected = 1;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithConsecutivePositiveNumbers() {
        int[] nums = {2, 1, 4, 3, 5};
        int expected = 6;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithDuplicates() {
        int[] nums = {3, 3, 3, 1};
        int expected = 2;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testLargeInputArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < 99999; i++) {
            nums[i] = i + 1;
        }
        nums[99999] = 1000000;  // Adding a large number to ensure 100000 is the missing number
        int expected = 100000;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

//    @Test
//    void testEmptyArray() {
//        int[] nums = {};
//        int expected = 1;
//        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
//    }

    @Test
    void testArrayWithZeroAndOne() {
        int[] nums = {0, 1};
        int expected = 2;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void testArrayWithAllElementsLargerThanLength() {
        int[] nums = {1000, 2000, 3000, 4000};
        int expected = 1;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(nums));
    }
}
