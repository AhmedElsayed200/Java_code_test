package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleNumTest {

    @Test
    public void testSingleElementArray() {
        SingleNum singleNum = new SingleNum();
        int[] nums = {1};
        assertEquals(1, singleNum.singleNumber(nums));
    }

    @Test
    public void testMultipleElementsWithSingleUnique() {
        SingleNum singleNum = new SingleNum();
        int[] nums = {2, 2, 1};
        assertEquals(1, singleNum.singleNumber(nums));
        int[] nums2 = {4, 1, 2, 1, 2};
        assertEquals(4, singleNum.singleNumber(nums2));
    }

    @Test
    public void testNegativeNumbers() {
        SingleNum singleNum = new SingleNum();
        int[] nums = {-1, 2, -1, 2, 3};
        assertEquals(3, singleNum.singleNumber(nums));
    }

    @Test
    public void testLargeArray() {
        // Create a large array with random numbers, ensuring one number appears once
        int[] largeNums = new int[100000];
        // ... (populate the array with random numbers, ensuring one unique)
        // ... (test the function with largeNums)
        // Note: For large inputs, consider using a parameterized test with different input sizes.
    }

//    @Test
//    public void testEmptyArray() {
//        SingleNum singleNum = new SingleNum();
//        int[] nums = {};
//        // This should throw an exception or return an invalid value, depending on the desired behavior
//        // For now, let's assume it should throw an exception:
//        assertThrows(IllegalArgumentException.class, () -> singleNum.singleNumber(nums));
//    }
}