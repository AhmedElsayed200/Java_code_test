package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Sum3Test {

    @Test
    public void testBasicExample() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(sortTriplets(expected), sortTriplets(result));
    }

    @Test
    public void testNoTriplets() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{0, 1, 1});
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAllZeros() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{0, 0, 0});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testAllPositiveNumbers() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{1, 2, 3, 4, 5});
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAllNegativeNumbers() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{-5, -4, -3, -2, -1});
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMixedNumbers() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{-2, 0, 1, 1, 2});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-2, 1, 1)
        );
        assertEquals(sortTriplets(expected), sortTriplets(result));
    }

    @Test
    public void testWithDuplicates() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{-1, -1, 0, 1, 2, -1, -4});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(sortTriplets(expected), sortTriplets(result));
    }

    @Test
    public void testLargeInput() {
        Sum3 sum3 = new Sum3();
        int[] nums = new int[3000];
        Arrays.fill(nums, 0); // All zeros
        List<List<Integer>> result = sum3.threeSum(nums);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testEdgeCaseNegativeAndPositive() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{-100000, 50000, 50000});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-100000, 50000, 50000)
        );
        assertEquals(expected, result);
    }

    @Test
    public void testUnsortedInput() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{3, -2, 1, 0, -1, -4});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-4, 1, 3),
                Arrays.asList(-2, -1, 3),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(sortTriplets(expected), sortTriplets(result));
    }

    @Test
    public void testExtremeValues() {
        Sum3 sum3 = new Sum3();
        List<List<Integer>> result = sum3.threeSum(new int[]{-105, 0, 105});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-105, 0, 105)
        );
        assertEquals(expected, result);
    }

    /**
     * Utility function to sort triplets and the list of triplets for comparison
     */
    private List<List<Integer>> sortTriplets(List<List<Integer>> triplets) {
        triplets.forEach(Collections::sort);
        triplets.sort(Comparator.comparing((List<Integer> t) -> t.get(0))
                .thenComparing(t -> t.get(1))
                .thenComparing(t -> t.get(2)));
        return triplets;
    }
}
