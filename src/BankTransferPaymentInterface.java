public class BankTransferPaymentInterface implements PaymentInterface {

    @Override
    public void GetPayment(double amount) {
        System.out.println("Payment with Bank Transfer accepted: " + amount );
    }
}