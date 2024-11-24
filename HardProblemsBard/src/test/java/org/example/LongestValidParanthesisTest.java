package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestValidParanthesisTest {

    @Test
    public void testBasicCases() {
        assertEquals(2, new LongestValidParanthesis().longestValidParentheses("(()"));
        assertEquals(4, new LongestValidParanthesis().longestValidParentheses(")()())"));
        assertEquals(0, new LongestValidParanthesis().longestValidParentheses(""));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(0, new LongestValidParanthesis().longestValidParentheses("((("));
        assertEquals(0, new LongestValidParanthesis().longestValidParentheses(")))"));
        assertEquals(4, new LongestValidParanthesis().longestValidParentheses("()()"));
    }

    @Test
    public void testComplexScenarios() {
        assertEquals(6, new LongestValidParanthesis().longestValidParentheses("(()())"));
        assertEquals(4, new LongestValidParanthesis().longestValidParentheses(")()())"));
        assertEquals(2, new LongestValidParanthesis().longestValidParentheses("(()(((()"));
        assertEquals(6, new LongestValidParanthesis().longestValidParentheses("()(())"));
        // Add more complex test cases with varying string lengths and patterns
    }

    // Performance testing (optional):
    // Use a benchmarking framework to measure execution time for large inputs.
    // @PerfTest
    // public void testPerformance() {
    //     // ...
    // }
}