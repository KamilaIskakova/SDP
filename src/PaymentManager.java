public class PaymentManager {
    private PaymentInterface paymentInterface;

    public PaymentManager(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void handlePayment(double amount){
        paymentInterface.GetPayment(amount);
    }
}
