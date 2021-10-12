/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 James Moore
 */

package ex42;
import java.util.*;
import java.io.*;

public class App {

    public static void main(String[] args){
        Roster roster = new Roster("exercise42_input.txt");
        roster.createOutput();
        roster.writeOutput("exercise_42_output.txt");

    }
}
