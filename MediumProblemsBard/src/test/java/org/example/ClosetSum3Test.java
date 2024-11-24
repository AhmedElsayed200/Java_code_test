package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClosetSum3Test {

    @Test
    public void testExample1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        assertEquals(2, new ClosetSum3().threeSumClosest(nums, target));
    }

    @Test
    public void testExample2() {
        int[] nums = {0, 0, 0};
        int target = 1;
        assertEquals(0, new ClosetSum3().threeSumClosest(nums, target));
    }

    @Test
    public void testAllNegative() {
        int[] nums = {-1, -2, -3};
        int target = -1;
        assertEquals(-6, new ClosetSum3().threeSumClosest(nums, target));
    }

    @Test
    public void testAllPositive() {
        int[] nums = {1, 2, 3};
        int target = 5;
        assertEquals(6, new ClosetSum3().threeSumClosest(nums, target));
    }

    @Test
    public void testDuplicates() {
        int[] nums = {0, 0, 0, 0};
        int target = 1;
        assertEquals(0, new ClosetSum3().threeSumClosest(nums, target));
    }

    @Test
    public void testLargeInput() {
        // Create a large input array with random values
        // ...
        // Test the function with the large input
    }

    @Test
    public void testTargetOutsideRange() {
        int[] nums = {-1, 2, 1, -4};
        int target = 100;
        // The expected output might vary depending on the specific implementation
        // but it should be a number close to the maximum possible sum or minimum possible sum
    }
}