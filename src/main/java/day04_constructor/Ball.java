package day04_constructor;

public class Ball {
    private String color;
    private String memberName;
    private int price;
    
    // 建構子統一實作區段
    {
        color = "白";
        price = 100;
    }
    
    public Ball() {
        // 建構子個別實作區段
        System.out.println("會員姓名: 訪客");
    }
    
    public Ball(String name) {
        // 建構子個別實作區段
        System.out.println("會員姓名: " + name);
        memberName = name;
        price *= 0.8;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", memberName=" + memberName + ", price=" + price + '}';
    }

    
    
    
    
    
}
