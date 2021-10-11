package ex42;

import java.util.*;
import java.io.*;
import java.lang.String;

public class Roster {
    ArrayList<Person> roster = new ArrayList<Person>();
    String formattedRoster = "";

    public void createOutput(){
        String output = "Last      First     Salary\n--------------------------\n";
        for (int i = 0; i < roster.size(); i++){
            output = output + String.format("%-10s%-10s%-5d\n",
                    roster.get(i).getLast(), roster.get(i).getFirst(), roster.get(i).getSal() );
        }
        formattedRoster = output;
    }
    public void writeOutput(String fileName){
        try {
            BufferedWriter outWrite = new BufferedWriter(new FileWriter(fileName) );
            outWrite.write(formattedRoster);
            outWrite.close();
        } catch(Exception exc){
            System.out.println("Error: write failure");
            exc.printStackTrace();
        }
    }

    public Roster(String fileName){
        try {
            BufferedReader readIn = new BufferedReader(new FileReader(fileName));
            String newVal;

            while ((newVal = readIn.readLine()) != null) {
                String[] currentLine = newVal.split(",");
                Person temp = new Person(currentLine[1], currentLine[0], currentLine[2]);
                roster.add(temp);
            }
            readIn.close();
        } catch(Exception exc){
            System.out.println("error: read failure.");
            exc.printStackTrace();
        }
    }

    public Person getPerson(int index){
        return roster.get(index);
    }

    public String getForRos(){
        return formattedRoster;
    }

}
