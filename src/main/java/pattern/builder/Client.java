package pattern.builder;

public class Client {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setCC(3000)
                .setWheel(5)
                .setColor("Red")
                .setDoor(6)
                .create();
        System.out.println(car);
    }
}
