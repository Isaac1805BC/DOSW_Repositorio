package dosw.bitacora.Corte1.semana3.Comercio_electronico;

public class ProcesadorTransferencia extends ProcesadorPagoFactory {
    @Override
    public Pago crearMetodoPago() {
        return new PagoTransferencia();
    }
}
