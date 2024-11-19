package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClosetSum3Test {

    @Test
    public void testBasicExample() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(2, result); // Closest sum is 2 (-1 + 2 + 1)
    }

    @Test
    public void testAllZeros() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {0, 0, 0};
        int target = 1;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(0, result); // Closest sum is 0 (0 + 0 + 0)
    }

    @Test
    public void testPositiveNumbers() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 10;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(10, result); // Closest sum is 10 (2 + 3 + 5)
    }

    @Test
    public void testNegativeNumbers() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {-5, -4, -3, -2, -1};
        int target = -7;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(-7, result); // Closest sum is -7 (-3 + -2 + -2)
    }

    @Test
    public void testMixedNumbers() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {-2, 0, 1, 2};
        int target = 3;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(3, result); // Closest sum is 3 (0 + 1 + 2)
    }

    @Test
    public void testExactMatch() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {-1, 2, 1, -4};
        int target = 2;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(2, result); // Closest sum is exactly the target
    }

    @Test
    public void testWithDuplicates() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {1, 1, 1, 1};
        int target = 3;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(3, result); // Closest sum is 3 (1 + 1 + 1)
    }

    @Test
    public void testLargeInputWithZeros() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = new int[500];
        for (int i = 0; i < 500; i++) {
            nums[i] = 0;
        }
        int target = 10;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(0, result); // Closest sum is 0 (0 + 0 + 0)
    }

    @Test
    public void testLargeRange() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {-1000, -500, 0, 500, 1000};
        int target = 200;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(0, result); // Closest sum is 200 (-500 + 500 + 1000)
    }

    @Test
    public void testNegativeTarget() {
        ClosetSum3 solution = new ClosetSum3();
        int[] nums = {-10, -5, -3, 2, 4, 6};
        int target = -4;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(-4, result); // Closest sum is -4 (-5 + -3 + 4)
    }
}
