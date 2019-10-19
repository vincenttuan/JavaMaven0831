package day06_interface;

public class Glass extends Decoration {
    private String name;
    private int amount;
    private int price;

    public Glass(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public int getPrice() {
        return price;
    }
    
}
