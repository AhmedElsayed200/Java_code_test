package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WaterTrapTest {

    private final WaterTrap waterTrap = new WaterTrap();

    @Test
    void testSimpleExample() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testExampleWithLargerHeight() {
        int[] height = {4, 2, 0, 3, 2, 5};
        int expected = 9;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testNoTrapping() {
        int[] height = {1, 1, 1, 1, 1};
        int expected = 0;
        assertEquals(expected, waterTrap.trap(height));
    }

//    @Test
//    void testEmptyArray() {
//        int[] height = {};
//        int expected = 0;
//        assertEquals(expected, waterTrap.trap(height));
//    }

    @Test
    void testSingleBar() {
        int[] height = {5};
        int expected = 0;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testAllBarsSameHeight() {
        int[] height = {3, 3, 3, 3, 3, 3};
        int expected = 0;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testLargeArrayWithNoTrapping() {
        int[] height = new int[20000];
        for (int i = 0; i < height.length; i++) {
            height[i] = 1;
        }
        int expected = 0;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testArrayWithPeak() {
        int[] height = {0, 1, 2, 3, 2, 1, 0};
        int expected = 0;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testArrayWithDescendThenAscend() {
        int[] height = {0, 3, 2, 1, 2, 1, 0};
        int expected = 1;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testArrayWithDescendingBars() {
        int[] height = {5, 4, 3, 2, 1};
        int expected = 0;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testArrayWithSingleDip() {
        int[] height = {2, 0, 2};
        int expected = 2;
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testLargeInputArray() {
        int[] height = new int[20000];
        for (int i = 0; i < 10000; i++) {
            height[i] = i % 2 == 0 ? 1 : 5;
        }
        int expected = 19996;  // Update this value depending on expected water trapped for this pattern
        assertEquals(expected, waterTrap.trap(height));
    }

    @Test
    void testTrappingWithZeros() {
        int[] height = {0, 1, 0, 1, 0, 1, 0};
        int expected = 2;
        assertEquals(expected, waterTrap.trap(height));
    }
}
