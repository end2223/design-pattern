package creational.factorymethod;

public class BankFactory {
    public BankFactory() {
    }
    public static Bank getBank(BankType bankType) {
        switch (bankType){
            case TPBank:
                return new TPBank();
            case VietcomBank:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}


