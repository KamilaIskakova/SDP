public class PayPalPaymentInterface implements PaymentInterface {

    @Override
    public void GetPayment(double amount) {
        System.out.println("Payment with PayPal accepted: " + amount);
    }
}