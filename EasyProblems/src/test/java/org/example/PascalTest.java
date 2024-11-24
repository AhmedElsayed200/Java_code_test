package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

public class PascalTest {

    private final Pascal pascal = new Pascal();

    @Test
    public void testGenerateWithSmallInput() {
        // Test the first few rows of Pascal's Triangle
        List<List<Integer>> result = pascal.generate(1);
        assertEquals(1, result.size());
        assertEquals(Arrays.asList(1), result.get(0));

        result = pascal.generate(2);
        assertEquals(2, result.size());
        assertEquals(Arrays.asList(1), result.get(0));
        assertEquals(Arrays.asList(1, 1), result.get(1));

        result = pascal.generate(3);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList(1), result.get(0));
        assertEquals(Arrays.asList(1, 1), result.get(1));
        assertEquals(Arrays.asList(1, 2, 1), result.get(2));
    }

    @Test
    public void testGenerateWithLargerInput() {
        // Test for a larger number of rows (5 rows)
        List<List<Integer>> result = pascal.generate(5);
        assertEquals(5, result.size());
        assertEquals(Arrays.asList(1), result.get(0));
        assertEquals(Arrays.asList(1, 1), result.get(1));
        assertEquals(Arrays.asList(1, 2, 1), result.get(2));
        assertEquals(Arrays.asList(1, 3, 3, 1), result.get(3));
        assertEquals(Arrays.asList(1, 4, 6, 4, 1), result.get(4));
    }

    @Test
    public void testGenerateWithEdgeInput() {
        // Test with the maximum row size (30 rows)
        List<List<Integer>> result = pascal.generate(30);
        assertEquals(30, result.size());
        assertEquals(Arrays.asList(1), result.get(0));  // first row should always be [1]
        assertEquals(Arrays.asList(1, 1), result.get(1));  // second row should always be [1, 1]
        // Further checks can be omitted for brevity, or check specific known values

        // Optionally, check a specific row for correctness, such as the 4th row
        assertEquals(Arrays.asList(1, 3, 3, 1), result.get(3));
    }

    @Test
    public void testGenerateWithEdgeCaseInput() {
        // Test with the minimum row size (1 row)
        List<List<Integer>> result = pascal.generate(1);
        assertEquals(1, result.size());
        assertEquals(Arrays.asList(1), result.get(0));
    }

    @Test
    public void testGeneratedTriangleIsCorrect() {
        // Test that generated rows are valid Pascal's Triangle rows
        for (int numRows = 1; numRows <= 5; numRows++) {
            List<List<Integer>> result = pascal.generate(numRows);

            // Check if the number of rows is correct
            assertEquals(numRows, result.size());

            // Check each row of Pascal's Triangle
            for (int i = 0; i < numRows; i++) {
                // First and last elements of each row should always be 1
                assertEquals(1, result.get(i).get(0));
                assertEquals(1, result.get(i).get(i));

                // Check the elements in the middle of the row
                for (int j = 1; j < i; j++) {
                    int left = result.get(i - 1).get(j - 1);
                    int right = result.get(i - 1).get(j);
                    assertEquals(left + right, result.get(i).get(j));
                }
            }
        }
    }

    @Test
    public void testGeneratePerformance() {
        // Test performance for the largest input
        long startTime = System.currentTimeMillis();
        pascal.generate(30);  // 30 rows should be manageable within the given constraints
        long endTime = System.currentTimeMillis();
        System.out.println("Performance Test Duration: " + (endTime - startTime) + " ms");
    }
}

