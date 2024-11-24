package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegularExpMatchTest {

    @Test
    public void testBasicMatching() {
        assertTrue(new RegularExpMatch().isMatch("aa", "a*"));
        assertTrue(new RegularExpMatch().isMatch("ab", ".*"));
        assertTrue(new RegularExpMatch().isMatch("aab", "c*a*b"));
    }

    @Test
    public void testEdgeCases() {
        assertFalse(new RegularExpMatch().isMatch("", "a"));
        assertFalse(new RegularExpMatch().isMatch("a", ""));
        assertFalse(new RegularExpMatch().isMatch("", "*"));
        assertFalse(new RegularExpMatch().isMatch("a", "*"));
    }

    @Test
    public void testComplexPatterns() {
        assertFalse(new RegularExpMatch().isMatch("adceb", "*a*b"));
        assertFalse(new RegularExpMatch().isMatch("acdcb", "a*c?b"));
    }

    // Add more test cases for specific scenarios and edge cases as needed.

    // Performance testing (optional):
    // Use a benchmarking framework to measure execution time for large inputs.
    // @PerfTest
    // public void testPerformance() {
    //     // ...
    // }
}