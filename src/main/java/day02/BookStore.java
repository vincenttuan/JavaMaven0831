package day02;

public class BookStore {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        b1.name = "Java";
        b1.setPrice(-400);
        b2.name = "Kotlin";
        b2.setPrice(500);
        
        System.out.printf("%s %d %s\n", b1.name, b1.getPrice(), Book.publisher);
        System.out.printf("%s %d %s\n", b2.name, b2.getPrice(), Book.publisher);
        
        System.out.println(b1);
        System.out.println(b2);
    }
}
