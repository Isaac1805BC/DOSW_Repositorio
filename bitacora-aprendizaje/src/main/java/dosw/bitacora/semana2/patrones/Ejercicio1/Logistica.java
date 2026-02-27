package dosw.bitacora.semana2.patrones.Ejercicio1;

public abstract class Logistica {
    
    
    public abstract Transporte crearTransporte();
    
    
    public void planificarEntrega() {
        
        Transporte transporte = crearTransporte();
        
        System.out.println("Logística: Preparando la ruta y los manifiestos...");
        
        transporte.entregar();
    }
}