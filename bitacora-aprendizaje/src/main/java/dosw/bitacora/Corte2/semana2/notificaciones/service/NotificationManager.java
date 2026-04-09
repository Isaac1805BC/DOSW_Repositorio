package dosw.bitacora.Corte2.semana2.notificaciones.service;

import dosw.bitacora.Corte2.semana2.notificaciones.strategy.MessagingStrategy;

public class NotificationManager {
    private static NotificationManager instance;
    private MessagingStrategy strategy;

    private NotificationManager() {}

    public static synchronized NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void setStrategy(MessagingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendNotification(String message, String destination) {
        if (strategy == null) {
            throw new IllegalStateException("Messaging strategy not set");
        }
        strategy.sendMessage(message, destination);
    }
}
