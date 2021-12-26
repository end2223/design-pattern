package creational.abstractfactory;

import creational.abstractfactory.product.Chair;
import creational.abstractfactory.product.Table;

/*
* Abstract Factory
* 1. FurnitureFactory: have the same role as in the factory method pattern. but it is return FurnitureAbstractFactory
* 2. FurnitureAbstractFactory: It is an abstract or interface class. It constrains method that are common to Factory (Wood, Plastic)
* 3. Factory: It extends and implements methods abstract factory.
* 4. Product: setup specific object
*
*
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== PLASTIC FACTORY =====");
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        Chair chair = factory.createChair();
        chair.create();
        Table table = factory.createTable();
        table.create();
        System.out.println();

        System.out.println("===== WOOD FACTORY =====");
        FurnitureAbstractFactory _factory = FurnitureFactory.getFactory(MaterialType.WOOD);
        Chair _chair = _factory.createChair();
        _chair.create();
        Table _table = _factory.createTable();
        _table.create();
    }
}
