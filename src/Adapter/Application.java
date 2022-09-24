package Adapter;

public class Application {
    public static void main(String[] args) {
        PayPal payPal = new PayPal("customer@aol.com", "password");
        CreditCard creditCard = new CreditCard("1234567890123456", "09/24");

        PayPalAdapter payPalAdapter = new PayPalAdapter(payPal);
        CreditCardAdapter creditCardAdapter = new CreditCardAdapter(creditCard);

        creditCardAdapter.collectMoney(24.02);
        payPalAdapter.collectMoney(24.09);

    }
}
