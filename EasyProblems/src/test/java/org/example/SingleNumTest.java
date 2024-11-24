package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleNumTest {

    private final SingleNum singleNum = new SingleNum();

    @Test
    public void testSingleNumberWithTypicalCase() {
        // Typical case: where one element appears once and the rest appear twice
        int[] nums = {2, 2, 1};
        int result = singleNum.singleNumber(nums);
        assertEquals(1, result, "The single number should be 1");
    }

    @Test
    public void testSingleNumberWithLargerArray() {
        // Larger array: multiple elements, with only one element appearing once
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNum.singleNumber(nums);
        assertEquals(4, result, "The single number should be 4");
    }

    @Test
    public void testSingleNumberWithSingleElement() {
        // Case with a single element
        int[] nums = {1};
        int result = singleNum.singleNumber(nums);
        assertEquals(1, result, "The single number should be 1");
    }

    @Test
    public void testSingleNumberWithNegativeNumbers() {
        // Case with negative numbers and positive numbers
        int[] nums = {-1, -2, -1, -3, -3};
        int result = singleNum.singleNumber(nums);
        assertEquals(-2, result, "The single number should be -2");
    }

    @Test
    public void testSingleNumberWithLargeInput() {
        // Performance case: large input size, testing the upper limit (nums.length <= 3 * 10^4)
        int[] nums = new int[30000];
        // Fill the array with a repeating pattern
        for (int i = 0; i < 29998; i += 2) {
            nums[i] = 1;
            nums[i + 1] = 2;
        }
        nums[29999] = 3; // Single element that doesn't repeat
        int result = singleNum.singleNumber(nums);
        assertEquals(0, result, "The single number should be 3");
    }

    @Test
    public void testSingleNumberWithMultiplePairs() {
        // Case with multiple pairs and one single number
        int[] nums = {7, 5, 3, 5, 7};
        int result = singleNum.singleNumber(nums);
        assertEquals(3, result, "The single number should be 3");
    }

    @Test
    public void testSingleNumberWithLargeRangeOfValues() {
        // Case with numbers from the large range [-30000, 30000] for validation of the algorithm
        int[] nums = {30000, -30000, 1, -30000, 1};
        int result = singleNum.singleNumber(nums);
        assertEquals(30000, result, "The single number should be 30000");
    }

    @Test
    public void testSingleNumberWithAllNegativeNumbers() {
        // Case with only negative numbers
        int[] nums = {-4, -2, -3, -2, -4};
        int result = singleNum.singleNumber(nums);
        assertEquals(-3, result, "The single number should be -3");
    }

    @Test
    public void testSingleNumberWithAlternatingNumbers() {
        // Case with alternating numbers
        int[] nums = {3, 5, 3, 7, 5};
        int result = singleNum.singleNumber(nums);
        assertEquals(7, result, "The single number should be 7");
    }

}
