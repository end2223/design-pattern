package creational.builder;

public class Car {
    private int id;
    private String branch;
    private String name;
    private String type;
    private int seats;
    private String color;

    public Car(int id, String branch, String name, String type, int seats, String color) {
        this.id = id;
        this.branch = branch;
        this.name = name;
        this.type = type;
        this.seats = seats;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getBranch() {
        return branch;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", branch='" + branch + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                '}';
    }
}
