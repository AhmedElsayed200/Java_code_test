package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTest {

    @Test
    public void testSingleRow() {
        Pascal pascal = new Pascal();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        assertEquals(expected, pascal.generate(1));
    }

    @Test
    public void testMultipleRows() {
        Pascal pascal = new Pascal();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(1, 3, 3, 1));
        expected.add(Arrays.asList(1, 4, 6, 4, 1));
        assertEquals(expected, pascal.generate(5));
    }

    @Test
    public void testBoundaryCase() {
        Pascal pascal = new Pascal();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(1, 3, 3, 1));
        expected.add(Arrays.asList(1, 4, 6, 4, 1));
        expected.add(Arrays.asList(1, 5, 10, 10, 5, 1));
        assertEquals(expected, pascal.generate(6));
    }

    @Test
    public void testZeroRows() {
        Pascal pascal = new Pascal();
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, pascal.generate(0));
    }
}