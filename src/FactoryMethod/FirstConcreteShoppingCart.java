package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class FirstConcreteShoppingCart implements ShoppingCart {
    List<Product> products = new ArrayList<>();
    @Override
    public void addProduct(Product product, int count) {
        for (int i = 1; i <= count; i++) {
            products.add(product);
        }
    }

    @Override
    public double getSummaryCost() {
        double cost = 0;
        for (Product product : products) {
            cost += product.getCost();
        }
        return cost;
    }

    @Override
    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
            }
        }
    }
}
