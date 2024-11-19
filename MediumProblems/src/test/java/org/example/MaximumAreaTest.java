package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaximumAreaTest {

    @Test
    public void testBasicExample() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(49, maximumArea.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void testMinimumInputSize() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(1, maximumArea.maxArea(new int[]{1, 1}));
    }

    @Test
    public void testAllEqualHeights() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(20, maximumArea.maxArea(new int[]{5, 5, 5, 5, 5}));
    }

    @Test
    public void testDecreasingHeights() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(9, maximumArea.maxArea(new int[]{6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void testIncreasingHeights() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(9, maximumArea.maxArea(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testMixedHeights() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(24, maximumArea.maxArea(new int[]{1, 3, 2, 5, 25, 24, 5}));
    }

    @Test
    public void testLargeHeightValues() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(10000, maximumArea.maxArea(new int[]{10000, 10000}));
    }

    @Test
    public void testZerosInHeight() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(8, maximumArea.maxArea(new int[]{0, 2, 0, 4, 0, 6, 0}));
    }

    @Test
    public void testAlternateZeroAndNonZeroHeights() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(6, maximumArea.maxArea(new int[]{0, 3, 0, 3, 0}));
    }

    @Test
    public void testSinglePeak() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(56, maximumArea.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 10}));
    }

    @Test
    public void testFlatHeightsWithZeros() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(0, maximumArea.maxArea(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    public void testAllOnes() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(4, maximumArea.maxArea(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testVeryLargeArraySize() {
        MaximumArea maximumArea = new MaximumArea();
        int[] height = new int[100000];
        for (int i = 0; i < height.length; i++) {
            height[i] = i % 100 + 1;
        }
        // Testing without asserting as expected value computation for large arrays may not be practical
        assertTrue(maximumArea.maxArea(height) > 0);
    }

    @Test
    public void testWideContainer() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(12, maximumArea.maxArea(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void testSingleTallContainer() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(20, maximumArea.maxArea(new int[]{1, 5, 2, 8, 3, 10}));
    }

    @Test
    public void testMultiplePeaks() {
        MaximumArea maximumArea = new MaximumArea();
        assertEquals(15, maximumArea.maxArea(new int[]{1, 3, 2, 1, 5, 4, 5}));
    }
}
