package dosw.bitacora.Corte2.semana2.notificaciones.factory;

import dosw.bitacora.Corte2.semana2.notificaciones.strategy.*;

public class NotificationFactory {
    public static MessagingStrategy createStrategy(String type) {
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailStrategy();
            case "SMS" -> new SmsStrategy();
            case "PUSH" -> new PushStrategy();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
