package dosw.bitacora.Corte2.semana2.pagos.adapter;

// Simulación de API externa
class ExternalPayPalApi {
    public void makePayment(String email, double amount) {
        System.out.println("Pago realizado con PayPal (" + email + "): $" + amount);
    }
}

public class PayPalAdapter implements PaymentProcessor {
    private ExternalPayPalApi paypalApi = new ExternalPayPalApi();

    @Override
    public void processPayment(double amount, String details) {
        // details se asume como el email en este caso
        paypalApi.makePayment(details, amount);
    }
}
