package Adapter;

public class CreditCard {
    private String number;
    private String expiration;

    public CreditCard(String number, String expiration) {
        this.number = number;
        this.expiration = expiration;
    }

    public String authorizeTransaction(double amount) {
        return "Authorization code: 234da";
    }
}
