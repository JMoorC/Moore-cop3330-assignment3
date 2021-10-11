/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 James Moore
 */
package ex41;
import java.util.*;
import java.io.*;

public class App {

    //C:\Users\Jim\IdeaProjects\Moore-cop3330-assignment3\src\main\java\ex41\exercise41_input.txt
    public static void main(String[] args){
       ArrayList<String> document = readFile("exercise41_input.txt");
       Collections.sort(document);
       printToFile(prepareOutput(document) );
    }

    public static ArrayList<String> readFile(String fileName){

        ArrayList<String> inList = new ArrayList<String>();

        try {
            BufferedReader readIn = new BufferedReader(new FileReader(fileName) );
            String newVal;

            while ( (newVal = readIn.readLine() ) != null){
                inList.add(newVal);
            }

            readIn.close();
        } catch(Exception exc){
            System.out.println("error: read failure.");
            exc.printStackTrace();
            return null;
        }
        return inList;
    }

    public static String prepareOutput(ArrayList<String> list){
        int size = list.size();
        String output = String.format("Total of %d names\n-----------------\n", size);
        for (int i = 0; i < size; i++){
            output = output + list.get(i) + "\n";
        }
        return output;
    }

    public static void printToFile(String output){
        try {
            BufferedWriter outWrite = new BufferedWriter(new FileWriter("exercise41_output.txt") );
            outWrite.write(output);
            outWrite.close();
        } catch(Exception exc){
            System.out.println("Error: write failure");
            exc.printStackTrace();
        }
    }

}
