package dosw.bitacora.semana3.Comercio_electronico;

public class PagoPayPal implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal por $ " + monto);
    }
}