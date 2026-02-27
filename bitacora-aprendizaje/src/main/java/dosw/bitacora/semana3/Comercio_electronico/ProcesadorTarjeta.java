package dosw.bitacora.semana3.Comercio_electronico;

public class ProcesadorTarjeta extends ProcesadorPagoFactory {
    @Override
    public Pago crearMetodoPago() {
        return new PagoTarjeta();
    }
}