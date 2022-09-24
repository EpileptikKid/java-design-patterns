package Adapter;

public class CreditCardAdapter implements PaymentAdapter {
    private CreditCard creditCard;

    public CreditCardAdapter(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String collectMoney(double amount) {
        String result = this.creditCard.authorizeTransaction(amount);
        return result;
    }
}
