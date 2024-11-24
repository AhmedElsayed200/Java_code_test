package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchRangeArrTest {

    @Test
    public void testSingleElementArray() {
        int[] nums = {5};
        int target = 5;
        int[] expected = {0, 0};
        int[] expected2 = {-1, -1};
        assertArrayEquals(expected, new SearchRangeArr().searchRange(nums, target));

        target = 6;

        assertArrayEquals(expected2, new SearchRangeArr().searchRange(nums, target));
    }

    @Test
    public void testMultipleOccurrences() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, new SearchRangeArr().searchRange(nums, target));
    }

    @Test
    public void testTargetNotFound() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, new SearchRangeArr().searchRange(nums, target));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, new SearchRangeArr().searchRange(nums, target));
    }

    @Test
    public void testTargetAtStart() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 5;
        int[] expected = {0, 0};
        assertArrayEquals(expected, new SearchRangeArr().searchRange(nums, target));
    }

    @Test
    public void testTargetAtEnd() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;
        int[] expected = {5, 5};
        assertArrayEquals(expected, new SearchRangeArr().searchRange(nums, target));
    }

    @Test
    public void testLargeArray() {
        // Create a large sorted array with duplicates and various target values
        // ...
        // Test the function with the large input
    }
}