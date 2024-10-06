public class SMSNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userUID) {
        System.out.println("Notification to " + userUID + "sent: " + message);
    }
}