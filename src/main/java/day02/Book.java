package day02;

public class Book {
    String name; // 書名
    private int price; // 價格
    static String publisher = "Gotop"; // 出版商

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.abs(price);
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price=" + price + '}';
    }

    
}
