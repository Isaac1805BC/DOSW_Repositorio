package dosw.bitacora.Corte2.semana2.notificaciones.strategy;

public class SmsStrategy implements MessagingStrategy {
    @Override
    public void sendMessage(String message, String destination) {
        System.out.println("Enviando SMS a " + destination + ": " + message);
    }
}
