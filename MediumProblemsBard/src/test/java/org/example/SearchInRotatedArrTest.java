package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchInRotatedArrTest {

    @Test
    public void testSimpleCase() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        assertEquals(4, new SearchInRotatedArr().search(nums, target));
    }

    @Test
    public void testTargetNotFound() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        assertEquals(-1, new SearchInRotatedArr().search(nums, target));
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {1};
        int target = 0;
        assertEquals(-1, new SearchInRotatedArr().search(nums, target));
        int target2 = 1;
        assertEquals(0, new SearchInRotatedArr().search(nums, target2));
    }

    @Test
    public void testSortedArray() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        assertEquals(2, new SearchInRotatedArr().search(nums, target));
    }

    @Test
    public void testReversedArray() {
        int[] nums = {5, 4, 3, 2, 1};
        int target = 3;
        assertEquals(2, new SearchInRotatedArr().search(nums, target));
    }

    @Test
    public void testTargetAtEnd() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        assertEquals(6, new SearchInRotatedArr().search(nums, target));
    }

    @Test
    public void testTargetAtStart() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        assertEquals(0, new SearchInRotatedArr().search(nums, target));
    }

    @Test
    public void testLargeArray() {
        // Create a large array with random rotations and targets
        // ...
        // Test the function with the large input
    }
}