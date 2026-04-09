package dosw.bitacora.Corte1.semana2.patrones.Ejercicio1;

public class LogisticaMaritima extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Barco();
    }
}
