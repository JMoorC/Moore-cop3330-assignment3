package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class RosterTest {
    Roster testRoster = new Roster("exercise42_test_input.txt");

    @Test
    void createOutput() {
        String s = "Last      First     Salary\n" +
                "--------------------------\n" +
                "Jacob     John      4400 \n" +
                "Abraham   Jim       2200 \n" +
                "Martin    Tim       46000\n" +
                "Chauslin  Fred      34500\n" +
                "McDauber  Klein     14200\n" +
                "Wang      Kevin     65000\n";
        testRoster.createOutput();
        assertEquals(s, testRoster.getForRos());
    }
}