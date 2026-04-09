package dosw.bitacora.Corte2.semana2.pagos.adapter;

public interface PaymentProcessor {
    void processPayment(double amount, String details);
}
