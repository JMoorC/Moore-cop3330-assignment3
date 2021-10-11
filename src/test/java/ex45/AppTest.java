package ex45;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void readFile() {
        ArrayList<String> list = App.readFile("exercise45_test_input.txt");
        assertEquals("She utilizes the use of utilize to use", list.get(0) );
        assertEquals("the useful utility of words, but fails to utilize", list.get(1) );
        assertEquals("the word use whenever she uses utilize.", list.get(2) );
    }

    @Test
    void replaceWord() {
        ArrayList<String> list = App.readFile("exercise45_test_input.txt");
        assertEquals("She uses the use of use to use\n" +
                "the useful utility of words, but fails to use\n" +
                "the word use whenever she uses use.\n", App.replaceWord("utilize", "use", list ) );
    }
}