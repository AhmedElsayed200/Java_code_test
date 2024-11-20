package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedArrTest {

    private final SearchInRotatedArr searchInRotatedArr = new SearchInRotatedArr();

    @Test
    void testTargetInLeftSortedHalf() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(1, searchInRotatedArr.search(nums, 5)); // Target is in the left sorted half
    }

    @Test
    void testTargetInRightSortedHalf() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, searchInRotatedArr.search(nums, 0)); // Target is in the right sorted half
    }

    @Test
    void testTargetNotInArray() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(-1, searchInRotatedArr.search(nums, 3)); // Target does not exist
    }

    @Test
    void testArrayNotRotated() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(3, searchInRotatedArr.search(nums, 4)); // Array is not rotated
    }

    @Test
    void testSingleElementTargetExists() {
        int[] nums = {1};
        assertEquals(0, searchInRotatedArr.search(nums, 1)); // Single element array, target exists
    }

    @Test
    void testSingleElementTargetNotExists() {
        int[] nums = {1};
        assertEquals(-1, searchInRotatedArr.search(nums, 0)); // Single element array, target does not exist
    }

    @Test
    void testMinimumEdgeCase() {
        int[] nums = {-10000, -9999, -5000, 0, 5000, 9999, 10000};
        assertEquals(6, searchInRotatedArr.search(nums, 10000)); // Maximum positive edge
    }

    @Test
    void testMaximumEdgeCase() {
        int[] nums = {-10000, -9999, -5000, 0, 5000, 9999, 10000};
        assertEquals(0, searchInRotatedArr.search(nums, -10000)); // Minimum negative edge
    }

    @Test
    void testTargetAtPivot() {
        int[] nums = {6, 7, 1, 2, 3, 4, 5};
        assertEquals(2, searchInRotatedArr.search(nums, 1)); // Target is at the pivot
    }

    @Test
    void testLargeArray() {
        int[] nums = new int[5000];
        for (int i = 0; i < 5000; i++) nums[i] = i;
        assertEquals(4999, searchInRotatedArr.search(nums, 4999)); // Large array, target is at the end
    }

    @Test
    void testLargeRotatedArray() {
        int[] nums = new int[5000];
        for (int i = 0; i < 5000; i++) nums[i] = (i + 2500) % 5000;
        assertEquals(2499, searchInRotatedArr.search(nums, 4999)); // Large rotated array, target is at the end
    }
}
