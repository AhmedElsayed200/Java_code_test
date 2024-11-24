package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LenOfLastWordTest {

    private final LenOfLastWord lenOfLastWord = new LenOfLastWord();

    @Test
    public void testBasicInput() {
        // Test typical cases with single and multiple words.
        assertEquals(5, lenOfLastWord.lengthOfLastWord("Hello World"));  // Last word: "World"
        assertEquals(4, lenOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));  // Last word: "moon"
        assertEquals(6, lenOfLastWord.lengthOfLastWord("luffy is still joyboy"));  // Last word: "joyboy"
    }

    @Test
    public void testWithLeadingAndTrailingSpaces() {
        // Test with leading and/or trailing spaces around the string.
        assertEquals(5, lenOfLastWord.lengthOfLastWord("   Hello World   "));  // Last word: "World"
        assertEquals(6, lenOfLastWord.lengthOfLastWord("   joyboy   "));  // Last word: "joyboy"
        assertEquals(4, lenOfLastWord.lengthOfLastWord("   The sky is blue   "));  // Last word: "blue"
    }

    @Test
    public void testSingleWordInput() {
        // Test strings with only one word, no spaces.
        assertEquals(5, lenOfLastWord.lengthOfLastWord("Hello"));  // Last word: "Hello"
        assertEquals(3, lenOfLastWord.lengthOfLastWord("abc"));  // Last word: "abc"
        assertEquals(1, lenOfLastWord.lengthOfLastWord("a"));  // Last word: "a"
    }

    @Test
    public void testEmptyStringInput() {
        // Test the edge case where the string is empty (though input guarantees at least one word).
        // This is just for validation, but not part of the given constraints.
        assertEquals(0, lenOfLastWord.lengthOfLastWord(""));  // No words in the string
    }

    @Test
    public void testEdgeCaseWithSpacesOnly() {
        // Test case where there are only spaces in the string (though this should not happen according to problem description).
        // Again, it's just for completeness.
        assertEquals(0, lenOfLastWord.lengthOfLastWord("     "));  // No words, just spaces
    }

//    @Test
//    public void testLongString() {
//        // Test case with a very long string (up to the maximum length allowed by the constraints).
//        String longInput = "a".repeat(10400);  // Creating a string of length 10400 with 'a's.
//        assertEquals(10400, lenOfLastWord.lengthOfLastWord(longInput));  // Last word: "a" repeated 10400 times
//    }

    @Test
    public void testWordWithSpecialCharacters() {
        // Test case with a string containing words and spaces and punctuation (based on constraints, words are just English letters).
        assertEquals(6, lenOfLastWord.lengthOfLastWord("Hello World!"));  // Last word: "World!"
        assertEquals(5, lenOfLastWord.lengthOfLastWord("I am 1 cool."));  // Last word: "cool."
    }

    @Test
    public void testMultipleWordsWithNoSpaces() {
        // Test for a string with a series of words directly together with no spaces.
        assertEquals(17, lenOfLastWord.lengthOfLastWord("appleorangebanana"));  // Last word: "banana"
    }
}
