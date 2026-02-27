package dosw.bitacora.semana2.patrones.Ejercicio1;

public class Barco implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por mar: El paquete va en un contenedor de carga.");
    }
}