package ex46;

import java.util.*;

public class WordList {
    ArrayList<Word> wordList;

    public WordList(){
        wordList = new ArrayList<Word>();
    }
    public WordList(ArrayList<String> inList){
        wordList = new ArrayList<Word>();
        for (int i = 0; i < inList.size(); i++){
            String curStr = inList.get(i);
            if (hasWord(curStr) ){
                increment(curStr);
            } else {
                Word temp = new Word(curStr);
                wordList.add(temp);
            }
        }
    }

    public void add(String name){
        Word word = new Word(name);
        wordList.add(word);
    }
    public void add(String name, int count){
        Word word = new Word (name, count);
        wordList.add(word);
    }

    public Word get(int index){
        return wordList.get(index);
    }

    public boolean hasWord(String name){
        if (wordList.size() <= 0){
            return false;

        }
        for (int i = 0; i < wordList.size(); i++ ){
            if (wordList.get(i).getWord().equals(name) ){
                return true;
            }
        }
        return false;
    }

    public void increment(String element){
        for (int i = 0; i < wordList.size(); i++ ){
            if (wordList.get(i).getWord().equals(element) ){
                wordList.get(i).increment();
                break;
            }
        }
    }

    public void sort(){
        for (int i = 0; i < wordList.size() - 1; i++ ){
            for (int j = 0; j < wordList.size() - (1 + i); j++){
                Word current = wordList.get(j);
                Word next = wordList.get(j+1);
                if (current.getCount() < next.getCount() ){
                    Word temp = next;
                    wordList.set(j + 1, current);
                    wordList.set(j, temp);
                }
            }
        }
    }

    public String createChart(){
        String output = "";
        for (int i = 0; i < wordList.size() ; i++){
            String astLn = "";
            for (int j = 0; j < wordList.get(i).getCount(); j++ ) {
                astLn += "*";
            }
            output = output + String.format("%-10s%s\n", wordList.get(i).getWord() + ":", astLn);
        }
        return output;
    }
}
