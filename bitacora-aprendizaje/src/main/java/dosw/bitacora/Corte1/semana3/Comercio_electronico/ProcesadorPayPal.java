package dosw.bitacora.Corte1.semana3.Comercio_electronico;

public class ProcesadorPayPal extends ProcesadorPagoFactory {
    @Override
    public Pago crearMetodoPago() {
        return new PagoPayPal();
    }
}
