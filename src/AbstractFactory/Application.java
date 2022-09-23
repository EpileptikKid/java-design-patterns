package AbstractFactory;

public class Application {
    private ShopModelFactory shopModelFactory;
    private Product product;
    private ShoppingCart shoppingCart;

    public Application(ShopModelFactory factory) {
        this.shopModelFactory = factory;
    }

    public void createProduct() {
        this.product = shopModelFactory.createProduct();
    }

    public void createShoppingCart() {
        this.shoppingCart = shopModelFactory.createShoppingCart();
    }

    public void addProductInShoppingCart(Product p) {
        shoppingCart.addProduct(p);
    }
}
