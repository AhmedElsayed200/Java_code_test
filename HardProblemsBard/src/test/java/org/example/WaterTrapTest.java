package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WaterTrapTest {

    @Test
    public void testBasicCases() {
//        assertEquals(0, new WaterTrap().trap(new int[]{}));
        assertEquals(0, new WaterTrap().trap(new int[]{1}));
        assertEquals(0, new WaterTrap().trap(new int[]{1, 2, 3}));
        assertEquals(1, new WaterTrap().trap(new int[]{1, 0, 1}));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(0, new WaterTrap().trap(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void testComplexScenarios() {
        assertEquals(6, new WaterTrap().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, new WaterTrap().trap(new int[]{4, 2, 0, 3, 2, 5}));
        assertEquals(1, new WaterTrap().trap(new int[]{5, 4, 1, 2}));
    }

    // Add more test cases for specific scenarios and edge cases as needed.

    // Performance testing (optional):
    // Use a benchmarking framework to measure execution time for large inputs.
    // @PerfTest
    // public void testPerformance() {
    //     // ...
    // }
}