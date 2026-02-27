package dosw.bitacora.semana2.patrones.Ejercicio1;

public class LogisticaMaritima extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Barco();
    }
}