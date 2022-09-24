package Adapter;

public class PayPalAdapter implements PaymentAdapter {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public String collectMoney(double amount) {
        String result = this.payPal.transfer("payments@myshop.com", amount);
        return result;
    }
}
