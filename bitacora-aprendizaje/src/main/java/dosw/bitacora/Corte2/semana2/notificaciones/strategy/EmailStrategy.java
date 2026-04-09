package dosw.bitacora.Corte2.semana2.notificaciones.strategy;

public class EmailStrategy implements MessagingStrategy {
    @Override
    public void sendMessage(String message, String destination) {
        System.out.println("Enviando Email a " + destination + ": " + message);
    }
}
