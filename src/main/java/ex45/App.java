/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 James Moore
 */
package ex45;


import java.util.*;
import java.io.*;

public class App {

    public static void main (String[] args) {
        String destination = "exercise45_output.txt";
        String original = promptFile();
        ArrayList<String> list = readFile(original);
        String output = replaceWord("utilize", "use", list);
        printToFile(destination, output);
    }

    public static ArrayList<String> readFile(String fileName){
        ArrayList<String> newList = new ArrayList<>();
        String newVal;
        try {
            BufferedReader readIn = new BufferedReader(new FileReader(fileName) );
            while ( (newVal = readIn.readLine() )  != null){
                newList.add(newVal);
            }
            readIn.close();
        } catch(Exception exc){
            System.out.println("error: read failure.");
            exc.printStackTrace();
        }
        return newList;
    }

    public static String replaceWord(String target, String replacement, ArrayList<String> list){
        String str = "";
        for (int i = 0; i < list.size(); i++){
            str = str + list.get(i).replace(target, replacement) + "\n";
        }
        return str;
    }

    public static void printToFile(String destination, String output){
        try {
            BufferedWriter outWrite = new BufferedWriter(new FileWriter(destination) );
            outWrite.write(output);
            outWrite.close();
        } catch(Exception exc){
            System.out.println("Error: write failure");
            exc.printStackTrace();
        }
    }

    public static String promptFile(){
        Scanner inScan = new Scanner(System.in);
        System.out.println("What is the filename: ");
        return inScan.nextLine();
    }
}
