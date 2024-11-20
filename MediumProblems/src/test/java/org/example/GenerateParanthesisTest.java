package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class GenerateParenthesisTest {

    GenerateParanthesis generator = new GenerateParanthesis();

    @Test
    void testZeroParentheses() {
        List<String> result = generator.generateParenthesis(0);
        assertEquals(Arrays.asList(""), result, "For n = 0, the result should be a list with an empty string.");
    }

    @Test
    void testOnePair() {
        List<String> result = generator.generateParenthesis(1);
        assertEquals(Arrays.asList("()"), result, "For n = 1, the result should be a list with '()'.");
    }

    @Test
    void testTwoPairs() {
        List<String> result = generator.generateParenthesis(2);
        List<String> expected = Arrays.asList("()()", "(())");
        assertEquals(expected, result, "For n = 2, the result should be [()(), (())].");
    }

    @Test
    void testThreePairs() {
        List<String> result = generator.generateParenthesis(3);
        List<String> expected = Arrays.asList("()()()", "()(())", "(())()", "(()())", "((()))");
        assertEquals(expected, result, "For n = 3, the result should include all valid combinations.");
    }

    @Test
    void testFivePairs() {
        List<String> result = generator.generateParenthesis(5);
        assertFalse(result.isEmpty(), "For n = 5, the result should contain valid combinations.");
        assertTrue(result.contains("(((())))()"), "Ensure the result contains valid combinations for larger n.");
    }

    @Test
    void testLargeInput() {
        // This is a performance test for large inputs
        assertDoesNotThrow(() -> generator.generateParenthesis(10),
                "The function should handle n = 10 without throwing any exception.");
    }

    @Test
    void testResultUniqueness() {
        List<String> result = generator.generateParenthesis(4);
        assertEquals(result.size(), result.stream().distinct().count(),
                "The result list should contain only unique combinations.");
    }

    @Test
    void testBalancedParentheses() {
        List<String> result = generator.generateParenthesis(3);
        for (String str : result) {
            assertTrue(isValidParentheses(str),
                    "All strings in the result should be valid balanced parentheses.");
        }
    }

    private boolean isValidParentheses(String str) {
        int balance = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') balance++;
            else if (ch == ')') balance--;
            if (balance < 0) return false; // Unbalanced
        }
        return balance == 0; // Must end balanced
    }
}
