package creational.abstractfactory.factory;

import creational.abstractfactory.FurnitureAbstractFactory;
import creational.abstractfactory.product.*;

public class PlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
