package app;

import org.junit.jupiter.api.Test;

import static app.ReverseResult.madeReverse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void test1() throws Exception {
        ReverseResult result = madeReverse("Lova kop");
        String expectedReversedString = "pok avoL";
        int expectedCharacterCount = 8;

        assertEquals(expectedReversedString, result.getReversedString());
        assertEquals(expectedCharacterCount, result.getCharacterCount());
    }
    @Test
    public void test2() throws Exception {
        ReverseResult result = madeReverse("Poopoom piDoo");
        String expectedReversedString = "ooDip moopooP";
        int expectedCharacterCount = 13;

        assertEquals(expectedReversedString, result.getReversedString());
        assertEquals(expectedCharacterCount, result.getCharacterCount());
    }
}
