package ex42;

import static java.lang.Integer.parseInt;

public class Person {
    private String fName;
    private String lName;
    private int salary;

    public int getSal(){
        return salary;
    }
    public String getFirst(){
        return fName;
    }
    public String getLast(){
        return lName;
    }

    public void addFirst(String name){
        fName = name;
    }
    public void addLast(String name){
        lName = name;
    }
    public void addSal(int val){
        salary = val;
    }

    public Person(){
    }
    public Person(String val1, String val2, String val3){
        fName = val1;
        lName = val2;
        salary = parseInt(val3);
    }

}
