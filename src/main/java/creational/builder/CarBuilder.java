package creational.builder;

public interface CarBuilder {
    CarBuilder setId(int id);
    CarBuilder setBranch(String branch);
    CarBuilder setName(String name);
    CarBuilder setType(String type);
    CarBuilder setSeats(int seats);
    CarBuilder setColor(String color);
    Car build();
}
