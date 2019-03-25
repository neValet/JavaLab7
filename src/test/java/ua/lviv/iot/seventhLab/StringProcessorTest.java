package ua.lviv.iot.seventhLab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.seventhLab.StringProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringProcessorTest {
    private String inputText;

    @BeforeEach
    void setUp() {
        inputText = "When I could not sleep at noon in my childhood my mom told me sagas";
    }

    @Test
    void testRemoveNonPalindromes() {
        StringProcessor stringProcessor = new StringProcessor();
        String str = stringProcessor.removeNonPalindromes(inputText);

        assertEquals("I noon mom sagas ",
                str, "There is an error in removeNonPalindromes()");
    }
}
