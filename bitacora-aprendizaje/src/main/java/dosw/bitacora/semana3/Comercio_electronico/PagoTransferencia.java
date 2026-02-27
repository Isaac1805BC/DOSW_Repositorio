package dosw.bitacora.semana3.Comercio_electronico;

public class PagoTransferencia implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Transferencia bancaria por $ " + monto);
    }
}
