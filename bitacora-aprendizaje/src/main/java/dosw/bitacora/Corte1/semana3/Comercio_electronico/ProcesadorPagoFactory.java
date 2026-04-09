package dosw.bitacora.Corte1.semana3.Comercio_electronico;

public abstract class ProcesadorPagoFactory {
   
    public abstract Pago crearMetodoPago();
    
    
    public void ejecutarCobro(double monto) {
        Pago pago = crearMetodoPago();
        pago.procesarPago(monto);
    }
}
