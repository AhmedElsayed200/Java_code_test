package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainDupliTest {

    private final ContainDupli containDupli = new ContainDupli();

    @Test
    public void testContainsDuplicateWithDuplicates() {
        // Test case where duplicates exist in the array
        int[] nums = {1, 2, 3, 1};
        boolean result = containDupli.containsDuplicate(nums);
        assertTrue(result, "The array contains duplicates");
    }

    @Test
    public void testContainsDuplicateWithoutDuplicates() {
        // Test case where there are no duplicates in the array
        int[] nums = {1, 2, 3, 4};
        boolean result = containDupli.containsDuplicate(nums);
        assertFalse(result, "The array does not contain duplicates");
    }

    @Test
    public void testContainsDuplicateWithSingleElement() {
        // Case with a single element: there cannot be duplicates
        int[] nums = {1};
        boolean result = containDupli.containsDuplicate(nums);
        assertFalse(result, "A single element array cannot have duplicates");
    }

    @Test
    public void testContainsDuplicateWithAllDuplicates() {
        // Case where all elements are the same
        int[] nums = {5, 5, 5, 5, 5};
        boolean result = containDupli.containsDuplicate(nums);
        assertTrue(result, "The array contains duplicates as all elements are the same");
    }

    @Test
    public void testContainsDuplicateWithNegativeNumbers() {
        // Case with negative numbers
        int[] nums = {-1, -2, -3, -1};
        boolean result = containDupli.containsDuplicate(nums);
        assertTrue(result, "The array contains duplicates");
    }

    @Test
    public void testContainsDuplicateWithLargeRange() {
        // Case with a large range of values
        int[] nums = {-1000000000, 1000000000, 0, -1000000000};
        boolean result = containDupli.containsDuplicate(nums);
        assertTrue(result, "The array contains duplicates");
    }

    @Test
    public void testContainsDuplicateWithEmptyArray() {
        // Case with an empty array: no duplicates possible
        int[] nums = {};
        boolean result = containDupli.containsDuplicate(nums);
        assertFalse(result, "An empty array cannot contain duplicates");
    }

    @Test
    public void testContainsDuplicateWithMultipleDistinctValues() {
        // Case with many distinct values, where no duplicates exist
        int[] nums = {10, 20, 30, 40, 50};
        boolean result = containDupli.containsDuplicate(nums);
        assertFalse(result, "The array does not contain duplicates");
    }

    @Test
    public void testContainsDuplicateWithLargeInput() {
        // Performance test: testing the upper limit (nums.length <= 10^5)
        int[] nums = new int[100000];
        // Filling array with distinct values
        for (int i = 0; i < 100000; i++) {
            nums[i] = i;
        }
        boolean result = containDupli.containsDuplicate(nums);
        assertFalse(result, "The array should not contain duplicates");

        // Now inserting a duplicate value
        nums[99999] = 50000;  // Adding a duplicate
        result = containDupli.containsDuplicate(nums);
        assertTrue(result, "The array should contain duplicates after modification");
    }
}
