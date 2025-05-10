package com.example;

import org.junit.jupiter.api.Test;

import static com.example.StringUtil.reverseLetters;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void test1() throws Exception {
        String result = reverseLetters("J@va the be$t!123");
        String expectedReversedString = "t@eb eht av$J!123";

        assertEquals(expectedReversedString, result.toString());
    }
    @Test
    public void test2() throws Exception {
        String result = reverseLetters("Poopoom15 piDoo**!");
        String expectedReversedString = "ooDipmo15 opooP**!";

        assertEquals(expectedReversedString, result.toString());
    }
}
