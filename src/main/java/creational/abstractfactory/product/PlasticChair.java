package creational.abstractfactory.product;

public class PlasticChair implements Chair{
    @Override
    public void create() {
        System.out.println("Created plastic chair!");
    }
}
