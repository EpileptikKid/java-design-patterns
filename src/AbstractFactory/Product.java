package AbstractFactory;

public interface Product {
    void setId(int id);
    int getId();
    void setName(String name);
    String getName();
    void setPrice(double price);
    double getPrice();
}
