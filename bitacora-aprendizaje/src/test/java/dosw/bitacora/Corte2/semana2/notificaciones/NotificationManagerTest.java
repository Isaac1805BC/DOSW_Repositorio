package dosw.bitacora.Corte2.semana2.notificaciones;

import dosw.bitacora.Corte2.semana2.notificaciones.factory.NotificationFactory;
import dosw.bitacora.Corte2.semana2.notificaciones.service.NotificationManager;
import dosw.bitacora.Corte2.semana2.notificaciones.strategy.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationManagerTest {

    @Test
    void testSingletonInstance() {
        NotificationManager instance1 = NotificationManager.getInstance();
        NotificationManager instance2 = NotificationManager.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testSendEmailNotification() {
        NotificationManager manager = NotificationManager.getInstance();
        MessagingStrategy emailStrategy = NotificationFactory.createStrategy("EMAIL");
        manager.setStrategy(emailStrategy);
        
        assertDoesNotThrow(() -> manager.sendNotification("Hello Email", "test@example.com"));
    }

    @Test
    void testSendSmsNotification() {
        NotificationManager manager = NotificationManager.getInstance();
        manager.setStrategy(NotificationFactory.createStrategy("SMS"));
        
        assertDoesNotThrow(() -> manager.sendNotification("Hello SMS", "123456789"));
    }

    @Test
    void testSendPushNotification() {
        NotificationManager manager = NotificationManager.getInstance();
        manager.setStrategy(NotificationFactory.createStrategy("PUSH"));
        
        assertDoesNotThrow(() -> manager.sendNotification("Hello Push", "user_device_id"));
    }

    @Test
    void testInvalidStrategyType() {
        assertThrows(IllegalArgumentException.class, () -> NotificationFactory.createStrategy("CARRIER_PIGEON"));
    }
}
