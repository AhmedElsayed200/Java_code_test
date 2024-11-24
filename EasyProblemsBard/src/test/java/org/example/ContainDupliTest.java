package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainDupliTest {

    @Test
    public void testEmptyArray() {
        ContainDupli containDupli = new ContainDupli();
        int[] nums = {};
        assertFalse(containDupli.containsDuplicate(nums));
    }

    @Test
    public void testSingleElementArray() {
        ContainDupli containDupli = new ContainDupli();
        int[] nums = {1};
        assertFalse(containDupli.containsDuplicate(nums));
    }

    @Test
    public void testMultipleUniqueElements() {
        ContainDupli containDupli = new ContainDupli();
        int[] nums = {1, 2, 3, 4, 5};
        assertFalse(containDupli.containsDuplicate(nums));
    }

    @Test
    public void testMultipleDuplicateElements() {
        ContainDupli containDupli = new ContainDupli();
        int[] nums = {1, 2, 3, 1, 4, 5, 2};
        assertTrue(containDupli.containsDuplicate(nums));
    }

    @Test
    public void testAllDuplicateElements() {
        ContainDupli containDupli = new ContainDupli();
        int[] nums = {1, 1, 1, 1, 1};
        assertTrue(containDupli.containsDuplicate(nums));
    }

    @Test
    public void testNegativeNumbers() {
        ContainDupli containDupli = new ContainDupli();
        int[] nums = {-1, 2, -1, 2, 3};
        assertTrue(containDupli.containsDuplicate(nums));
    }

    @Test
    public void testLargeArray() {
        // Create a large array with random numbers, ensuring some duplicates
        int[] largeNums = new int[100000];
        // ... (populate the array with random numbers, including duplicates)
        // ... (test the function with largeNums)
        // Note: For large inputs, consider using a parameterized test with different input sizes.
    }
}