package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class ConcreteShoppingCartA implements ShoppingCart {
    List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void deleteProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
            }
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public double getSummaryPrice() {
        double summaryPrice = 0;
        for (Product product : products) {
            summaryPrice += product.getPrice();
        }
        return summaryPrice;
    }
}
