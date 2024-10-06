public class NotificationManager {
    private NotificationInterface notification;

    public NotificationManager(NotificationInterface notification) {
        this.notification = notification;
    }

    public void sendNotification(String message, String userUID){
        notification.sendNotification(message, userUID);
    }

    public void sendBulkNotification(String message, String[] usersUID){
        for(String userUID : usersUID){
            sendNotification(message, userUID);
            System.out.println(); //Just for prettier output
        }
    }
}