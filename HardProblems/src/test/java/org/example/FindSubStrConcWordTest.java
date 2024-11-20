package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class FindSubStrConcWordTest {

    private final FindSubStrConcWord solution = new FindSubStrConcWord();

    // Test 1: Simple test case with concatenation starting at index 0 and 9
    @Test
    public void testExample1() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> expected = Arrays.asList(0, 9);
        List<Integer> result = solution.findSubstring(s, words);
        Collections.sort(result); // Sort to compare in any order
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    // Test 2: No possible concatenated substring
    @Test
    public void testExample2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        List<Integer> expected = Collections.emptyList();
        List<Integer> result = solution.findSubstring(s, words);
        assertEquals(expected, result);
    }

    // Test 3: Test with multiple concatenated substrings
    @Test
    public void testExample3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        List<Integer> expected = Arrays.asList(6, 9, 12);
        List<Integer> result = solution.findSubstring(s, words);
        Collections.sort(result); // Sort to compare in any order
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    // Test 4: Edge case where the string is shorter than the total length of the words
    @Test
    public void testShorterStringThanWords() {
        String s = "abc";
        String[] words = {"abcd", "abcde"};
        List<Integer> expected = Collections.emptyList();
        List<Integer> result = solution.findSubstring(s, words);
        assertEquals(expected, result);
    }

    // Test 5: Case where the string contains repeated words and matches multiple permutations
    @Test
    public void testRepeatedWords() {
        String s = "abcabcabc";
        String[] words = {"abc", "abc"};
        List<Integer> expected = Arrays.asList(0, 3);
        List<Integer> result = solution.findSubstring(s, words);
        Collections.sort(result); // Sort to compare in any order
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    // Test 6: Case where the string and words are minimal
    @Test
    public void testMinimalCase() {
        String s = "a";
        String[] words = {"a"};
        List<Integer> expected = Arrays.asList(0);
        List<Integer> result = solution.findSubstring(s, words);
        assertEquals(expected, result);
    }

    // Test 7: Case where no words match the string
    @Test
    public void testNoMatch() {
        String s = "abcdef";
        String[] words = {"xyz"};
        List<Integer> expected = Collections.emptyList();
        List<Integer> result = solution.findSubstring(s, words);
        assertEquals(expected, result);
    }

    // Test 8: Large input case (edge case performance test)
//    @Test
//    public void testLargeInput() {
//        String s = "a".repeat(10000); // Large string of repeated 'a's
//        String[] words = {"a"};
//        List<Integer> expected = new ArrayList<>();
//        for (int i = 0; i <= s.length() - words.length; i++) {
//            expected.add(i);
//        }
//        List<Integer> result = solution.findSubstring(s, words);
//        assertEquals(expected, result);
//    }

    // Test 9: Case with words that are of varying lengths
    @Test
    public void testVaryingWordLengths() {
        String s = "abcabcabcabc";
        String[] words = {"ab", "ca"};
        List<Integer> expected = Arrays.asList(0, 3, 6);
        List<Integer> result = solution.findSubstring(s, words);
        Collections.sort(result); // Sort to compare in any order
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    // Test 10: Case where the words array contains just one word
    @Test
    public void testSingleWord() {
        String s = "aaaaaa";
        String[] words = {"aa"};
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> result = solution.findSubstring(s, words);
        Collections.sort(result); // Sort to compare in any order
        Collections.sort(expected);
        assertEquals(expected, result);
    }
}
