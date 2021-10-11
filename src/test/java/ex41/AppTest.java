package ex41;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.io.*;

class AppTest {

    @org.junit.jupiter.api.Test
    void prepareOutput() {
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("Fletcher, Donjon");
        test1.add("Allison, Bryce");
        test1.add("Allison, Brice");
        test1.add("Belmont, Trevor");
        Collections.sort(test1);
        String comparator = "Total of 4 names\n" +
                "-----------------\n" +
                "Allison, Brice\n" +
                "Allison, Bryce\n" +
                "Belmont, Trevor\n" +
                "Fletcher, Donjon\n";
        assertEquals(App.prepareOutput(test1), comparator);
    }
}