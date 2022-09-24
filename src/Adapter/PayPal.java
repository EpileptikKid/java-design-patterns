package Adapter;

public class PayPal {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String transfer(String emailReceiver, double amount) {
        return "PayPal Success!";
    }
}
