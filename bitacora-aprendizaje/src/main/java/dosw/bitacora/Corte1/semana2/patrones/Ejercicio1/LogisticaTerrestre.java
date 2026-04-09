package dosw.bitacora.Corte1.semana2.patrones.Ejercicio1;

public class LogisticaTerrestre extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Camion();
    }
}
