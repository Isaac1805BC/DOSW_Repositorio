package dosw.bitacora.Corte2.semana2.pagos.chain;

public class FraudValidator extends PaymentValidator {
    @Override
    public boolean validate(double amount, String details) {
        System.out.println("Validando fraude...");
        if (details.contains("suspicious")) {
            System.out.println("Error: Transacción identificada como fraude.");
            return false;
        }
        return checkNext(amount, details);
    }
}
