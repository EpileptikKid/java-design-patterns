package AbstractFactory;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        String config = "A";
        ShopModelFactory factory;
        if (config.equals("A")) {
            factory  = new ConcreteShopModelFactoryA();
        } else {
            throw new RuntimeException("Error!");
        }
        Application app = new Application(factory);
    }
}
