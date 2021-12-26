package creational.abstractfactory.product;

public class WoodTable implements Table{
    @Override
    public void create() {
        System.out.println("Created wood table!");
    }
}
