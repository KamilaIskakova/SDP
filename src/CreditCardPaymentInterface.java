public class CreditCardPaymentInterface implements PaymentInterface {

    @Override
    public void GetPayment(double amount) {
        System.out.println("Payment with Credit Card accepted: " + amount);
    }
}