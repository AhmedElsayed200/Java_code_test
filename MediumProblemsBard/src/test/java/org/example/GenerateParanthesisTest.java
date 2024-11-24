package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class GenerateParanthesisTest {

//    @Test
//    public void testN0() {
//        int n = 0;
//        List<String> expected = Arrays.asList();
//        assertEquals(expected, new GenerateParanthesis().generateParenthesis(n));
//    }

    @Test
    public void testN1() {
        int n = 1;
        List<String> expected = Arrays.asList("()");
        assertEquals(expected, new GenerateParanthesis().generateParenthesis(n));
    }

    @Test
    public void testN2() {
        int n = 2;
        List<String> expected = Arrays.asList("()()", "(())");
        assertEquals(expected, new GenerateParanthesis().generateParenthesis(n));
    }

    @Test
    public void testN3() {
        int n = 3;
        List<String> expected = Arrays.asList("()()()", "()(())", "(())()", "(()())", "((()))");
        assertEquals(expected, new GenerateParanthesis().generateParenthesis(n));
    }

    @Test
    public void testLargeN() {
        int n = 5;
        // Expected output will be a large list of valid parentheses combinations
        // ... (You can manually verify or use a larger test framework to compare)
    }
}