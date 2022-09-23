package AbstractFactory;

import java.util.List;

public interface ShoppingCart {
    void addProduct(Product product);
    void deleteProduct(int id);
    List<Product> getAllProducts();
    double getSummaryPrice();
}
