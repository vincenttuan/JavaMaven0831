package day02_array;
import day02.Book;
import java.util.Arrays;

public class BookArrayTest {
   
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        b1.name = "Java";
        b1.setPrice(400);
        b2.name = "Kotlin";
        b2.setPrice(500);
        //--------------------------------
        Book[] books = {b1, b2};
        int total = 0;
        for(int i=0;i<books.length;i++) {
            System.out.println(books[i]);
            total += books[i].getPrice();
        }
        System.out.println(total);
        System.out.println(total/books.length);
       
    }
}
