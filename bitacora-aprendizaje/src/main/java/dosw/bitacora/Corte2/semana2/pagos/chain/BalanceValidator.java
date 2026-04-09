package dosw.bitacora.Corte2.semana2.pagos.chain;

public class BalanceValidator extends PaymentValidator {
    @Override
    public boolean validate(double amount, String details) {
        System.out.println("Validando saldo...");
        if (amount > 10000) {
            System.out.println("Error: Saldo insuficiente.");
            return false;
        }
        return checkNext(amount, details);
    }
}
