package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        List<Product> productsCopy = new ArrayList<>();

        ConcreteProduct concreteProduct = new ConcreteProduct();
        concreteProduct.id = 13;
        concreteProduct.name = "Milk";
        concreteProduct.description = "Dairy products";
        concreteProduct.cost = 24.0d;
        products.add(concreteProduct);

        ConcreteProduct anotherProduct = (ConcreteProduct) concreteProduct.clone();
        productsCopy.add(anotherProduct);
        System.out.println(products.get(0).equals(productsCopy.get(0)));
        System.out.println(products.get(0) == productsCopy.get(0));
    }
}
