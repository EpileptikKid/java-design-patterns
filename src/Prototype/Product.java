package Prototype;

public abstract class Product {

    public int id;
    public String name;
    public double cost;

    public Product() {
    }

    public Product(Product product) {
        if (product != null) {
            this.id = product.id;
            this.name = product.name;
            this.cost = product.cost;
        }
    }

    public abstract Product clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        Product product = (Product) obj;
        return product.id == id && product.name.equals(name) && product.cost == cost;
    }
}
