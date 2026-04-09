package dosw.bitacora.Corte1.semana3.Comercio_electronico;

public class Main {
    public static void main(String[] args) {
        double montoCompra = 150.75; 

        ProcesadorPagoFactory pago1 = new ProcesadorTarjeta();
        pago1.ejecutarCobro(montoCompra);

        ProcesadorPagoFactory pago2 = new ProcesadorPayPal();
        pago2.ejecutarCobro(montoCompra);
    }
}
