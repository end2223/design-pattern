package creational.abstractfactory.factory;

import creational.abstractfactory.FurnitureAbstractFactory;
import creational.abstractfactory.product.Chair;
import creational.abstractfactory.product.Table;
import creational.abstractfactory.product.WoodChair;
import creational.abstractfactory.product.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
