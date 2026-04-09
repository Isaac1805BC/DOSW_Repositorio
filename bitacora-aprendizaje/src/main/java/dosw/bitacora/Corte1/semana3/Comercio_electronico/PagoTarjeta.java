package dosw.bitacora.Corte1.semana3.Comercio_electronico;

public class PagoTarjeta implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de crédito por $ " + monto);
    }
}
