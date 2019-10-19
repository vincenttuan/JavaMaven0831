package pattern.builder;

public interface ICarBuilder {

    public CarBuilder setWheel(int wheel);

    public CarBuilder setDoor(int door);

    public CarBuilder setCC(int cc);

    public CarBuilder setColor(String color);

    public Car create();
}
