package day02;

public class BookStore {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        b1.name = "Java";
        b1.price = 500;
        b2.name = "Kotlin";
        b2.price = 450;
        Book.publisher = "Gotop";
        
        System.out.printf("%s %d %s\n", b1.name, b1.price, Book.publisher);
        System.out.printf("%s %d %s\n", b2.name, b2.price, Book.publisher);
        
    }
}
