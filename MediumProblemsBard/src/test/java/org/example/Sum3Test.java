package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Sum3Test {

    @Test
    public void testExample1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        assertEquals(expected, new Sum3().threeSum(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, new Sum3().threeSum(nums));
    }

    @Test
    public void testExample3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        assertEquals(expected, new Sum3().threeSum(nums));
    }

    @Test
    public void testAllNegative() {
        int[] nums = {-1, -2, -3};
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, new Sum3().threeSum(nums));
    }

    @Test
    public void testAllPositive() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, new Sum3().threeSum(nums));
    }

    @Test
    public void testDuplicates() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        assertEquals(expected, new Sum3().threeSum(nums));
    }

    @Test
    public void testLargeInput() {
        // Create a large input array with random values
        // ...
        // Test the function with the large input
    }
}
