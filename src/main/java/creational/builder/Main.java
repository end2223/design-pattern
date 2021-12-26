package creational.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new CarConcreteBuilder().setId(1)
                                          .setBranch("Audi")
                                          .setName("A6")
                                          .setType("Sport")
//                                          .setColor("White")
                                          .setSeats(2).build();
        System.out.println(car);
    }
}
