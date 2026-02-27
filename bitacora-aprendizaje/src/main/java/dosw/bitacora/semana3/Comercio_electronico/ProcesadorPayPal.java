package dosw.bitacora.semana3.Comercio_electronico;

public class ProcesadorPayPal extends ProcesadorPagoFactory {
    @Override
    public Pago crearMetodoPago() {
        return new PagoPayPal();
    }
}