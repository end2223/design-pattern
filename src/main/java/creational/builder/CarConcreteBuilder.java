package creational.builder;

public class CarConcreteBuilder implements CarBuilder{
    private int id;
    private String branch;
    private String name;
    private String type;
    private String color;
    private int seats;

    @Override
    public CarBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    @Override
    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car build() {
        return new Car(id, branch, name, type, seats, color);
    }
}
