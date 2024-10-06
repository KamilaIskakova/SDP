public class Main {
    public static void main(String[] args) {
        notificationTest();
    }

    static void paymentTest(){
        PaymentInterface payPal = new PayPalPaymentInterface();
        PaymentManager payPalHandler = new PaymentManager(payPal);
        payPalHandler.handlePayment(48.64);

        PaymentInterface creditCard = new CreditCardPaymentInterface();
        PaymentManager creditCardHandler = new PaymentManager(creditCard);
        creditCardHandler.handlePayment(55.55);

        PaymentInterface bankTransfer = new BankTransferPaymentInterface();
        PaymentManager bankTransferHandler = new PaymentManager(bankTransfer);
        bankTransferHandler.handlePayment(87);
    }

    static void notificationTest(){
        EmailNotification email = new EmailNotification();
        NotificationManager emailHandler = new NotificationManager(email);
        emailHandler.sendNotification("Advertisement", "231111@astanait.edu.kz");
        emailHandler.sendBulkNotification("scholarship", new String[] {
                "231111@astanait.edu.kz", "232222@astanait.edu.kz", "233333@astanait.edu.kz"
        });

        PushNotification push = new PushNotification();
        NotificationManager pushHandler = new NotificationManager(push);
        pushHandler.sendNotification("Message", "6349659347876");

        SlackNotification slack = new SlackNotification();
        NotificationManager slackHandler = new NotificationManager(slack);
        slackHandler.sendNotification("Slack", "599570439866");


        SMSNotification sms = new SMSNotification();
        NotificationManager smsHandler = new NotificationManager(sms);
        smsHandler.sendNotification("It's going to rain tomorrow", "436793876596");

    }
}