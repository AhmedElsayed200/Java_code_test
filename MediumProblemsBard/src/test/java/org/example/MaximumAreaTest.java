package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumAreaTest {

    @Test
    public void testSimpleCase() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, new MaximumArea().maxArea(height));
    }

    @Test
    public void testTwoElements() {
        int[] height = {1, 1};
        assertEquals(1, new MaximumArea().maxArea(height));
    }

    @Test
    public void testDecreasingHeight() {
        int[] height = {5, 4, 3, 2, 1};
        assertEquals(6, new MaximumArea().maxArea(height));
    }

    @Test
    public void testIncreasingHeight() {
        int[] height = {1, 2, 3, 4, 5};
        assertEquals(6, new MaximumArea().maxArea(height));
    }

    @Test
    public void testAllEqualHeight() {
        int[] height = {5, 5, 5, 5, 5};
        assertEquals(20, new MaximumArea().maxArea(height));
    }

    @Test
    public void testSingleElement() {
        int[] height = {1};
        assertEquals(0, new MaximumArea().maxArea(height));
    }

    @Test
    public void testZeroHeight() {
        int[] height = {0, 0, 0};
        assertEquals(0, new MaximumArea().maxArea(height));
    }

    @Test
    public void testLargeInput() {
        // Create a large input array
        int[] largeHeight = new int[100000];
        // Populate with random heights
        // ... (Use a loop or a random number generator)
        // Test the function with the large input
    }
}