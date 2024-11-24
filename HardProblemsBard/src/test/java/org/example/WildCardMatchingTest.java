package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WildCardMatchingTest {

    @Test
    public void testExactMatch() {
        assertTrue(new WildCardMatching().isMatch("abc", "abc"));
    }

    @Test
    public void testDotMatch() {
        assertTrue(new WildCardMatching().isMatch("a", "?"));
        assertTrue(new WildCardMatching().isMatch("ab", "a?"));
    }

    @Test
    public void testStarMatch() {
        assertTrue(new WildCardMatching().isMatch("aa", "a*"));
        assertTrue(new WildCardMatching().isMatch("ab", "?*"));
        assertFalse(new WildCardMatching().isMatch("aab", "c*a*b"));
    }

    @Test
    public void testEdgeCases() {
        assertFalse(new WildCardMatching().isMatch("", "a"));
        assertFalse(new WildCardMatching().isMatch("a", ""));
        assertTrue(new WildCardMatching().isMatch("", "*"));
        assertTrue(new WildCardMatching().isMatch("a", "*"));
    }

    @Test
    public void testComplexPatterns() {
        assertTrue(new WildCardMatching().isMatch("adceb", "*a*b"));
        assertFalse(new WildCardMatching().isMatch("acdcb", "a*c?b"));
    }

    // Add more test cases for specific scenarios and edge cases as needed.

    // Performance testing (optional):
    // Use a benchmarking framework to measure execution time for large inputs.
    // @PerfTest
    // public void testPerformance() {
    //     // ...
    // }
}