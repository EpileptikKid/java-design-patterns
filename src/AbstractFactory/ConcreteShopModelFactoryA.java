package AbstractFactory;

public class ConcreteShopModelFactoryA implements ShopModelFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public ShoppingCart createShoppingCart() {
        return new ConcreteShoppingCartA();
    }
}
