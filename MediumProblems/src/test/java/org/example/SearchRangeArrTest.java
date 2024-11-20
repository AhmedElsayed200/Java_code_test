package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchRangeArrTest {

    private final SearchRangeArr searchRangeArr = new SearchRangeArr();

    @Test
    void testTargetFoundSingleOccurrence() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int[] expected = {2, 2};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testTargetFoundMultipleOccurrences() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testTargetNotFound() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testSingleElementArrayTargetFound() {
        int[] nums = {1};
        int target = 1;
        int[] expected = {0, 0};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testSingleElementArrayTargetNotFound() {
        int[] nums = {1};
        int target = 2;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testArrayWithAllElementsSameTargetFound() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 2;
        int[] expected = {0, 4};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testArrayWithAllElementsSameTargetNotFound() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 3;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testArrayWithNegativeNumbersTargetFound() {
        int[] nums = {-10, -5, -3, 0, 1, 2, 3};
        int target = -3;
        int[] expected = {2, 2};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testArrayWithNegativeNumbersTargetNotFound() {
        int[] nums = {-10, -5, -3, 0, 1, 2, 3};
        int target = -2;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testArrayWithLargeSizeTargetFound() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = i; // Populate array with 0 to 99999
        }
        int target = 50000;
        int[] expected = {50000, 50000};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testArrayWithLargeSizeTargetNotFound() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = i; // Populate array with 0 to 99999
        }
        int target = 100001;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testTargetAtStart() {
        int[] nums = {2, 3, 4, 5, 6};
        int target = 2;
        int[] expected = {0, 0};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }

    @Test
    void testTargetAtEnd() {
        int[] nums = {2, 3, 4, 5, 6};
        int target = 6;
        int[] expected = {4, 4};
        assertArrayEquals(expected, searchRangeArr.searchRange(nums, target));
    }
}
