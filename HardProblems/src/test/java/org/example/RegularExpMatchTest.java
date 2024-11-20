package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpMatchTest {

    private final RegularExpMatch regularExpMatch = new RegularExpMatch();

    @Test
    void testExactMatch() {
        String s = "aa";
        String p = "aa";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testExactMismatch() {
        String s = "aa";
        String p = "a";
        assertFalse(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithAsteriskMatchingZero() {
        String s = "aa";
        String p = "a*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithAsteriskMatchingMultiple() {
        String s = "aaa";
        String p = "a*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithDotMatchingAny() {
        String s = "ab";
        String p = ".*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithDotNotMatching() {
        String s = "ab";
        String p = "a.";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithDotAtEnd() {
        String s = "a";
        String p = "a.";
        assertFalse(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithStarAfterDot() {
        String s = "abc";
        String p = "a.*c";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithNoMatchForEmptyString() {
        String s = "";
        String p = "a*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithStarAfterCharacter() {
        String s = "abc";
        String p = "a*b*";
        assertFalse(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithStarNotMatching() {
        String s = "abc";
        String p = "a*c*";
        assertFalse(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithMultipleAsterisks() {
        String s = "aaa";
        String p = "a*a*a*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithOnlyDot() {
        String s = "a";
        String p = ".";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithStarAndDot() {
        String s = "a";
        String p = ".*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testEmptyStringWithEmptyPattern() {
        String s = "";
        String p = "";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testEmptyStringWithNonEmptyPattern() {
        String s = "";
        String p = "a*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithLeadingDotMatching() {
        String s = "a";
        String p = ".a";
        assertFalse(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithStarMatchingZeroTimes() {
        String s = "abc";
        String p = ".*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithStarAtEnd() {
        String s = "abc";
        String p = "abc*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithMultipleDots() {
        String s = "abc";
        String p = "...";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithIncorrectDot() {
        String s = "abc";
        String p = "ab.";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testPatternWithLongStringAndPattern() {
        String s = "aabbccddeeff";
        String p = "a*b*c*d*e*f*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

    @Test
    void testEdgeCaseWithMaxLength() {
        String s = "aaaaaaaaaaaaaaaaaaaa"; // 20 characters
        String p = "a*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }

//    @Test
//    void testEdgeCaseWithPatternLengthEqualToMaxLength() {
//        String s = "a";
//        String p = ".*";
//        assertTrue(regularExpMatch.isMatch(s, p.repeat(10)));
//    }

    @Test
    void testEdgeCaseWithAllWildcardPattern() {
        String s = "abcd";
        String p = ".*";
        assertTrue(regularExpMatch.isMatch(s, p));
    }
}
