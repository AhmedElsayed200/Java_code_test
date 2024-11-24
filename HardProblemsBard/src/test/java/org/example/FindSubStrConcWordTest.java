package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FindSubStrConcWordTest {

    @Test
    public void testBasicCases() {
        assertEquals(Arrays.asList(0, 9), new FindSubStrConcWord().findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        assertEquals(Arrays.asList(6, 9, 12), new FindSubStrConcWord().findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(Arrays.asList(), new FindSubStrConcWord().findSubstring("", new String[]{"word"}));
        assertEquals(Arrays.asList(0), new FindSubStrConcWord().findSubstring("word", new String[]{"word"}));
        assertEquals(Arrays.asList(), new FindSubStrConcWord().findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}));
    }

    @Test
    public void testComplexScenarios() {
        assertEquals(Arrays.asList(0, 6), new FindSubStrConcWord().findSubstring("barfoofoobar", new String[]{"foo", "bar"}));
        assertEquals(Arrays.asList(), new FindSubStrConcWord().findSubstring("aaaabaaaabaaab", new String[]{"aaba", "ba"}));
        // Add more complex test cases with varying string lengths, word counts, and patterns
    }

    // Performance testing (optional):
    // Use a benchmarking framework to measure execution time for large inputs.
    // @PerfTest
    // public void testPerformance() {
    //     // ...
    // }
}