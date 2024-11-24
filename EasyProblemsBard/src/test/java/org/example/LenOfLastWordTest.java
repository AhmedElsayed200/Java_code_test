package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LenOfLastWordTest {

    @Test
    public void testSingleWord() {
        LenOfLastWord lenOfLastWord = new LenOfLastWord();
        assertEquals(5, lenOfLastWord.lengthOfLastWord("Hello"));
    }

    @Test
    public void testMultipleWords() {
        LenOfLastWord lenOfLastWord = new LenOfLastWord();
        assertEquals(5, lenOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(4, lenOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, lenOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    public void testLeadingAndTrailingSpaces() {
        LenOfLastWord lenOfLastWord = new LenOfLastWord();
        assertEquals(5, lenOfLastWord.lengthOfLastWord("  Hello World"));
        assertEquals(4, lenOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, lenOfLastWord.lengthOfLastWord("luffy is still joyboy   "));
    }

    @Test
    public void testSingleSpaceString() {
        LenOfLastWord lenOfLastWord = new LenOfLastWord();
        assertEquals(0, lenOfLastWord.lengthOfLastWord(" "));
    }

//    @Test
//    public void testEmptyInput() {
//        LenOfLastWord lenOfLastWord = new LenOfLastWord();
//        assertThrows(IllegalArgumentException.class, () -> lenOfLastWord.lengthOfLastWord(""));
//    }
}