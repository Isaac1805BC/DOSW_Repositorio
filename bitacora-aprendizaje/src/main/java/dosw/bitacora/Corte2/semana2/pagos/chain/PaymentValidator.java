package dosw.bitacora.Corte2.semana2.pagos.chain;

public abstract class PaymentValidator {
    protected PaymentValidator next;

    public void setNext(PaymentValidator next) {
        this.next = next;
    }

    public abstract boolean validate(double amount, String details);

    protected boolean checkNext(double amount, String details) {
        if (next == null) {
            return true;
        }
        return next.validate(amount, details);
    }
}
