package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordListTest {

    @Test
    void increment() {
        WordList list = new WordList();
        list.add("fire", 16);
        list.add("chimp", 3);
        list.add("based", 32);
        list.increment("fire");
        list.increment("fire");
        list.increment("chimp");
        assertEquals(18, list.get(0).getCount() );
        assertEquals(4, list.get(1).getCount() );
    }

    @Test
    void sort() {
        WordList list = new WordList();
        list.add("fire", 16);
        list.add("chimp", 3);
        list.add("based", 32);
        list.sort();
        assertEquals("based", list.get(0).getWord() );
        assertEquals("fire", list.get(1).getWord() );
        assertEquals("chimp", list.get(2).getWord() );
    }

    @Test
    void createChart() {
        WordList list = new WordList();
        list.add("fire", 4);
        list.add("chimp", 3);
        list.add("based", 5);
        String s = "fire:     ****\n" +
                "chimp:    ***\n" +
                "based:    *****\n";
        assertEquals(s, list.createChart());
        s = "based:    *****\n" +
                "fire:     ****\n" +
                "chimp:    ***\n";
        list.sort();
        assertEquals(s, list.createChart() );
    }
    @Test
    void hasWord() {
        WordList list = new WordList();
        list.add("fire", 4);
        list.add("chimp", 3);
        list.add("based", 5);
        assertTrue(list.hasWord("fire") );
        assertFalse(list.hasWord("tuxedo") );
    }
}