package dosw.bitacora.Corte2.semana2.notificaciones.strategy;

public class PushStrategy implements MessagingStrategy {
    @Override
    public void sendMessage(String message, String destination) {
        System.out.println("Enviando Notificación Push a " + destination + ": " + message);
    }
}
