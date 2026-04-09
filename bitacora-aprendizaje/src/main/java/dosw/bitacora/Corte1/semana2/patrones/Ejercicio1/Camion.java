package dosw.bitacora.Corte1.semana2.patrones.Ejercicio1;

public class Camion implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por tierra: El paquete va en una caja dentro de un camión.");
    }
}

