package dosw.bitacora.Corte2.semana2.pagos.adapter;

// Simulación de API externa
class ExternalStripeApi {
    public void charge(double amount, String token) {
        System.out.println("Cargo realizado con Stripe (Token: " + token + "): $" + amount);
    }
}

public class StripeAdapter implements PaymentProcessor {
    private ExternalStripeApi stripeApi = new ExternalStripeApi();

    @Override
    public void processPayment(double amount, String details) {
        // details se asume como el token de Stripe
        stripeApi.charge(amount, details);
    }
}
