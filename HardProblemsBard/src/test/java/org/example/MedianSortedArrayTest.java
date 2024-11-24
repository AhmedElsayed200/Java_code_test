package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedianSortedArrayTest {

    private final MedianSortedArray medianCalculator = new MedianSortedArray();

//    @Test
//    public void testEmptyArrays() {
//        int[] nums1 = {};
//        int[] nums2 = {};
//        double expected = 0.0;
//        double actual = medianCalculator.findMedianSortedArrays(nums1, nums2);
//        assertEquals(expected, actual, 0.0001);
//    }

    @Test
    public void testSingleElementArrays() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        double expected = 1.5;
        double actual = medianCalculator.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testEqualLengthArrays() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;
        double actual = medianCalculator.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testDifferentLengthArrays() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5};
        double expected = 3.0;
        double actual = medianCalculator.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums1 = {-1, 0};
        int[] nums2 = {-2, -1};
        double expected = -1.0;
        double actual = medianCalculator.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testRepeatedElements() {
        int[] nums1 = {1, 1, 2, 2};
        int[] nums2 = {1, 1, 2, 2};
        double expected = 1.5;
        double actual = medianCalculator.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testLargeNumbers() {
        int[] nums1 = {1000000};
        int[] nums2 = {-1000000};
        double expected = 0.0;
        double actual = medianCalculator.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual, 0.0001);
    }

    // Add more test cases as needed, especially for edge cases and boundary conditions.
}