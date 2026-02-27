package dosw.bitacora.semana2.patrones.Ejercicio1;

public class LogisticaTerrestre extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Camion();
    }
}