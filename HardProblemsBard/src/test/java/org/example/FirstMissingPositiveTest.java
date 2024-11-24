package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstMissingPositiveTest {

    @Test
    public void testBasicCases() {
        assertEquals(3, new FirstMissingPositive().firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
        assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[]{1}));
//        assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[]{}));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(4, new FirstMissingPositive().firstMissingPositive(new int[]{1, 2, 3}));
        assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[]{-1, -2, -3}));
        assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[]{2}));
    }

    @Test
    public void testComplexScenarios() {
        assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(5, new FirstMissingPositive().firstMissingPositive(new int[]{3, 4, -1, 1, 6, 2}));
        // Add more complex test cases with large input sizes and various patterns
    }

    // Performance testing (optional):
    // Use a benchmarking framework to measure execution time for large inputs.
    // @PerfTest
    // public void testPerformance() {
    //     // ...
    // }
}
