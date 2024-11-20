package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    private final MedianSortedArray medianCalculator = new MedianSortedArray();

    @Test
    void testBasicCaseOddLength() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2.0;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testBasicCaseEvenLength() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testEmptyFirstArray() {
        int[] nums1 = {};
        int[] nums2 = {2, 3};
        double expected = 2.5;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testEmptySecondArray() {
        int[] nums1 = {1, 2};
        int[] nums2 = {};
        double expected = 1.5;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

//    @Test
//    void testBothArraysEmpty() {
//        int[] nums1 = {};
//        int[] nums2 = {};
//        assertThrows(IllegalArgumentException.class, () -> medianCalculator.findMedianSortedArrays(nums1, nums2));
//    }

    @Test
    void testSingleElementArrays() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        double expected = 1.5;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testDifferentLengths() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 5, 6};
        double expected = 3.5;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums1 = {-5, -3, -1};
        int[] nums2 = {-2, 0, 2};
        double expected = -1.5;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {2, 3, 4};
        double expected = 2.0;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testLargeInputArrays() {
        int[] nums1 = new int[1000];
        int[] nums2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums1[i] = i;
            nums2[i] = i + 1000;
        }
        double expected = 999.5;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testTargetMedianAtStart() {
        int[] nums1 = {1};
        int[] nums2 = {2, 3, 4, 5};
        double expected = 3.0;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    void testTargetMedianAtEnd() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5};
        double expected = 3.0;
        assertEquals(expected, medianCalculator.findMedianSortedArrays(nums1, nums2), 0.00001);
    }
}
