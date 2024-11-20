package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestValidParanthesisTest {

    private final LongestValidParanthesis solution = new LongestValidParanthesis();

    // Test 1: Example from the problem description with a valid substring "()"
    @Test
    public void testExample1() {
        String s = "(()";
        int expected = 2;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 2: Another example from the problem description
    @Test
    public void testExample2() {
        String s = ")()())";
        int expected = 4;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 3: Edge case with an empty string
    @Test
    public void testEmptyString() {
        String s = "";
        int expected = 0;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 4: Case with no valid parentheses
    @Test
    public void testNoValidParentheses() {
        String s = "(((((";
        int expected = 0;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 5: Case with a fully valid parentheses string
    @Test
    public void testFullyValidParentheses() {
        String s = "()()()()";
        int expected = 8;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 6: Case with interspersed valid and invalid parentheses
    @Test
    public void testInterspersedValidAndInvalid() {
        String s = "(()())((())())";
        int expected = 14;  // The longest valid substring is "(()())"
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 7: Case where the string is just one character
    @Test
    public void testSingleCharacter() {
        String s = "(";
        int expected = 0;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 8: Case with a very long valid string (stress test)
    @Test
    public void testLongValidParentheses() {
        String s = "()" + "()" + "()" + "()" + "()" + "()" + "()" + "()" + "()" + "()"; // 20 characters
        int expected = 20;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 9: Case with a long string where no valid parentheses exist
    @Test
    public void testLongInvalidString() {
        String s = "(((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))";
        int expected = 64; // Only the last valid pair "()" forms a valid substring
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 10: Case with alternating parentheses
    @Test
    public void testAlternatingParentheses() {
        String s = "()()()()()()";
        int expected = 12;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 11: Case with large input string (upper boundary test case)
//    @Test
//    public void testLargeInput() {
//        String s = "()" + "()".repeat(15000); // Length 30000 (maximum input size)
//        int expected = 30000; // Since it's all valid parentheses
//        int result = solution.longestValidParentheses(s);
//        assertEquals(expected, result);
//    }

    // Test 12: Case with a string containing only valid closing parentheses
    @Test
    public void testOnlyClosingParentheses() {
        String s = ")))))))))";
        int expected = 0;  // No valid parentheses substring
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    // Test 13: Case with a string containing only valid opening parentheses
    @Test
    public void testOnlyOpeningParentheses() {
        String s = "(((((((((";
        int expected = 0;  // No valid parentheses substring
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }
}
