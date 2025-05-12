package com.example;

import org.junit.jupiter.api.Test;

import static com.example.StringUtil.reverseLetters;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void reverseLetters_shouldReverseLetters_keepingSymbolsInPosition() throws Exception {
        String result = reverseLetters("J@va the be$t!123");
        String expectedReversedString = "t@eb eht av$J!123";

        assertEquals(expectedReversedString, result);
    }
    @Test
     void reverseLetters_shouldReturnEmptyString_ifContainsEmptyString() throws Exception {
        String result = reverseLetters("");
        String expectedReversedString = "";

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReturnNull_ifContainsNull() throws Exception {
        String result = reverseLetters(null);
        String expectedReversedString = null;

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReturnSameLetter_ifContainsSingleLetter() throws Exception {
        String result = reverseLetters("Q");
        String expectedReversedString = "Q";

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReturnSameCharacter_ifContainsSingleCharacter() throws Exception {
        String result = reverseLetters("*");
        String expectedReversedString = "*";

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReturnSameString_ifContainsEvenNumberOfCharacters() throws Exception {
        String result = reverseLetters("@!123#)^");
        String expectedReversedString = "@!123#)^";

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReturnSameString_ifContainsOddNumberOfCharacters() throws Exception {
        String result = reverseLetters("}?<&#");
        String expectedReversedString = "}?<&#";

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReverseLetters_ifContainsEvenNumberOfLetters() throws Exception {
        String result = reverseLetters("Hello world");
        String expectedReversedString = "dlrow olleH";

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReverseLetters_ifContainsOddNumberOfLetters() throws Exception {
        String result = reverseLetters("Java is the best");
        String expectedReversedString = "tseb eh tsi avaJ";

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReturnSameString_ifContainsOnlyCharacters() throws Exception {
        String result = reverseLetters("=568£&$");
        String expectedReversedString = "=568£&$";

        assertEquals(expectedReversedString, result);
    }
    @Test
    void reverseLetters_shouldReverseLetters_ifContainsOnlyLetters() throws Exception {
        String result = reverseLetters("Valhalla");
        String expectedReversedString = "allahlaV";

        assertEquals(expectedReversedString, result);
    }
}
