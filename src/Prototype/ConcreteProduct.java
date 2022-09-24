package Prototype;

public class ConcreteProduct extends Product {

    public String description;

    public ConcreteProduct() {
    }

    public ConcreteProduct(ConcreteProduct concreteProduct) {
        super(concreteProduct);
        if (concreteProduct != null) {
            this.description = concreteProduct.description;
        }
    }

    @Override
    public ConcreteProduct clone() {
        return new ConcreteProduct(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ConcreteProduct) || !super.equals(obj)) return false;
        ConcreteProduct concreteProduct = (ConcreteProduct) obj;
        return concreteProduct.description == description;
    }
}
