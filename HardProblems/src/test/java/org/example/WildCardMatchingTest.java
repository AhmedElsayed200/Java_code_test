package org.example;

import org.junit.jupiter.api.Test;

//import static jdk.internal.joptsimple.internal.Strings.repeat;
import static org.junit.jupiter.api.Assertions.*;


class WildCardMatchingTest {

    private final WildCardMatching wildCardMatching = new WildCardMatching();

    @Test
    void testExactMatch() {
        String s = "hello";
        String p = "hello";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testSingleCharacterWildcard() {
        String s = "hello";
        String p = "he?lo";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testWildcardMatchAll() {
        String s = "hello";
        String p = "*";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testWildcardAtStart() {
        String s = "hello";
        String p = "*lo";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testWildcardAtEnd() {
        String s = "hello";
        String p = "he*";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testWildcardInMiddle() {
        String s = "hello";
        String p = "h*o";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testMultipleWildcards() {
        String s = "hello";
        String p = "h*?o";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testConsecutiveWildcards() {
        String s = "hello";
        String p = "h**o";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testNonMatchingPattern() {
        String s = "hello";
        String p = "world";
        assertFalse(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testEmptyStringAndPattern() {
        String s = "";
        String p = "";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testEmptyStringWithWildcard() {
        String s = "";
        String p = "*";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testEmptyStringWithNonWildcard() {
        String s = "";
        String p = "?";
        assertFalse(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testEmptyPattern() {
        String s = "hello";
        String p = "";
        assertFalse(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testComplexPattern() {
        String s = "abcde";
        String p = "a*c?e";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testPatternLongerThanString() {
        String s = "abc";
        String p = "a*c*d";
        assertFalse(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testStringWithSpecialCharacters() {
        String s = "a_b-c";
        String p = "a*?_c";
        assertFalse(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testStringWithNumbers() {
        String s = "abc123";
        String p = "*123";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

    @Test
    void testPatternWithOnlyWildcards() {
        String s = "abcdef";
        String p = "******";
        assertTrue(wildCardMatching.isMatch(s, p));
    }

//    @Test
//    void testLargeInputMatch() {
//        String s = repeat('a', 1000);
//        String p = repeat('a', 1000);
//        assertTrue(wildCardMatching.isMatch(s, p));
//    }
//
//    @Test
//    void testLargeInputWildcard() {
//        String s = repeat('a', 1000);;
//        String p = "*";
//        assertTrue(wildCardMatching.isMatch(s, p));
//    }
}
