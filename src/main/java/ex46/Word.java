package ex46;

public class Word {
    String word;
    int count;

    public Word(String word){
        setWord(word);
        setCount(1);
    }
    public Word(String word, int count){
        setWord(word);
        setCount(count);
    }

    public String getWord(){
        return word;
    }
    public int getCount(){
        return count;
    }

    public void setWord(String word){
        this.word = word;
    }
    public void setCount(int count){
        this.count = count;
    }

    public void increment(){
        count++;
    }

}
