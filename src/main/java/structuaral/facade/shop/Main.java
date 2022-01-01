package structuaral.facade.shop;

public class Main {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("caongocson2122@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("caongocson2122@gmail.com", "0988.999.999");
    }
}
