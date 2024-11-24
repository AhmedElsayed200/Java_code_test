package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Sum4Test {

    @Test
    public void testExample1() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2, 0, 0, 2),
                Arrays.asList(-1, 0, 0, 1)
        );
        assertEquals(expected, new Sum4().fourSum(nums, target));
    }

    @Test
    public void testExample2() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 2, 2));
        assertEquals(expected, new Sum4().fourSum(nums, target));
    }

    @Test
    public void testNoSolution() {
        int[] nums = {1, 2, 3, 4};
        int target = 15;
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, new Sum4().fourSum(nums, target));
    }

    @Test
    public void testAllNegative() {
        int[] nums = {-1, -2, -3, -4};
        int target = -10;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-4, -3, -2, -1));
        assertEquals(expected, new Sum4().fourSum(nums, target));
    }

    @Test
    public void testAllPositive() {
        int[] nums = {1, 2, 3, 4};
        int target = 10;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 3, 4));
        assertEquals(expected, new Sum4().fourSum(nums, target));
    }

    @Test
    public void testDuplicates() {
        int[] nums = {0, 0, 0, 0};
        int target = 0;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0, 0));
        assertEquals(expected, new Sum4().fourSum(nums, target));
    }

    @Test
    public void testLargeInput() {
        // Create a large input array with random values
        // ...
        // Test the function with the large input
    }
}