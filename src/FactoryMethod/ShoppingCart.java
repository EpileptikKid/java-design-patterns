package FactoryMethod;

public interface ShoppingCart {
    void addProduct(Product product, int count);
    double getSummaryCost();
    void deleteProduct(int id);

}
