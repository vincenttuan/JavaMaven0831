package decorator;

public class Onion extends Sidedish {
    
    public Onion(Food food) {
        super(food);
        name = "洋蔥";
        price = 12;
    }
    
}
