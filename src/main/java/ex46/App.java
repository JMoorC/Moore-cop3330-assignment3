/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 James Moore
 */
package ex46;

import java.util.*;
import java.io.*;

public class App {

    public static void main (String[] args){
        ArrayList<String> list = readFile("exercise46_input.txt");
        WordList wordList = new WordList(list);
        wordList.sort();
        String output = wordList.createChart();
        writeFile("exercise46_output.txt", output);
    }

    public static ArrayList<String> readFile(String fileName){
        ArrayList<String> newList = new ArrayList<>();
        String newVal;
        try {
            BufferedReader readIn = new BufferedReader(new FileReader(fileName) );

            while ( (newVal = readIn.readLine() )  != null){
                String[] currentLine = newVal.split(" ");
                for (int i = 0; i < currentLine.length; i++){
                    newList.add(currentLine[i]);
                }
            }
            readIn.close();
        } catch(Exception exc){
            System.out.println("error: read failure.");
            exc.printStackTrace();
        }
        return newList;
    }
    public static void writeFile(String fileName, String output){
        try {
            BufferedWriter outWrite = new BufferedWriter(new FileWriter(fileName) );
            outWrite.write(output);
            outWrite.close();
        } catch(Exception exc){
            System.out.println("Error: write failure");
            exc.printStackTrace();
        }
    }
}

