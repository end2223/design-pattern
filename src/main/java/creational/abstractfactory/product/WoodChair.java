package creational.abstractfactory.product;

public class WoodChair implements Chair{
    @Override
    public void create() {
        System.out.println("Created wood chair!");
    }
}
