package creational.abstractfactory.product;

public class PlasticTable implements Table{
    @Override
    public void create() {
        System.out.println("Created plastic table!");
    }
}
