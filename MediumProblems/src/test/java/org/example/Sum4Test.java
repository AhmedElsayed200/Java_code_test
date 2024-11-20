package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Sum4Test {

    @Test
    public void testBasicExample() {
        Sum4 solution = new Sum4();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = solution.fourSum(nums, target);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2, 0, 0, 2),
                Arrays.asList(-1, 0, 0, 1)
        );
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result)); // Ensure order-agnostic match
    }

    @Test
    public void testAllDuplicates() {
        Sum4 solution = new Sum4();
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> result = solution.fourSum(nums, target);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(2, 2, 2, 2)
        );
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testNoQuadruplets() {
        Sum4 solution = new Sum4();
        int[] nums = {1, 2, 3, 4};
        int target = 100;
        List<List<Integer>> result = solution.fourSum(nums, target);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMixedNumbers() {
        Sum4 solution = new Sum4();
        int[] nums = {-3, -1, 0, 2, 4, 5};
        int target = 0;
        List<List<Integer>> result = solution.fourSum(nums, target);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-3, -1, 0, 4)
        );
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testLargeInputSmallTarget() {
        Sum4 solution = new Sum4();
        int[] nums = {-1000000000, -1000000000, 1000000000, 1000000000};
        int target = 0;
        List<List<Integer>> result = solution.fourSum(nums, target);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1000000000, -1000000000, 1000000000, 1000000000)
        );
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testEdgeCaseMinAndMax() {
        Sum4 solution = new Sum4();
        int[] nums = {-10, -5, -3, 0, 3, 5, 10};
        int target = 0;
        List<List<Integer>> result = solution.fourSum(nums, target);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-10, -5, 5, 10),
                Arrays.asList(-10,-3,3,10),
                Arrays.asList(-5, -3, 3, 5)
        );
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testPerformanceWithLargeInput() {
        Sum4 solution = new Sum4();
        int[] nums = new int[200];
        Arrays.fill(nums, 1);
        int target = 4;
        List<List<Integer>> result = solution.fourSum(nums, target);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 1, 1, 1)
        );
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testNegativeTarget() {
        Sum4 solution = new Sum4();
        int[] nums = {-5, -4, -3, -2, -1};
        int target = -10;
        List<List<Integer>> result = solution.fourSum(nums, target);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-4, -3, -2, -1)
        );
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testZeroTarget() {
        Sum4 solution = new Sum4();
        int[] nums = {0, 0, 0, 0, 0};
        int target = 0;
        List<List<Integer>> result = solution.fourSum(nums, target);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0, 0, 0)
        );
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }
}
