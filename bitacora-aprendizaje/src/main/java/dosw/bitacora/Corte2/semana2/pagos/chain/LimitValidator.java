package dosw.bitacora.Corte2.semana2.pagos.chain;

public class LimitValidator extends PaymentValidator {
    @Override
    public boolean validate(double amount, String details) {
        System.out.println("Validando límite de transacción...");
        if (amount <= 0) {
            System.out.println("Error: El monto debe ser mayor a 0.");
            return false;
        }
        return checkNext(amount, details);
    }
}
