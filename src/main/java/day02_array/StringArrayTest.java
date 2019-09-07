package day02_array;

public class StringArrayTest {  
    public static void main(String[] args) {
        String word = "she sell sea shell on the sea shore";
        System.out.println(word.length());
        
        String[] words = word.split(" ");
        System.out.println(words[1]);
        System.out.println(words.length);
    }
}
