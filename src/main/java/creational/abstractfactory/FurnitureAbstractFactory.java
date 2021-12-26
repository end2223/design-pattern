package creational.abstractfactory;

import creational.abstractfactory.product.Chair;
import creational.abstractfactory.product.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}
