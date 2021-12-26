package creational.abstractfactory;

import creational.abstractfactory.factory.PlasticFactory;
import creational.abstractfactory.factory.WoodFactory;

public class FurnitureFactory {
    public FurnitureFactory() {

    }

    public static FurnitureAbstractFactory getFactory(MaterialType meMaterialType){
        switch (meMaterialType){
            case WOOD:
                return new WoodFactory();
            case PLASTIC:
                return new PlasticFactory();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
