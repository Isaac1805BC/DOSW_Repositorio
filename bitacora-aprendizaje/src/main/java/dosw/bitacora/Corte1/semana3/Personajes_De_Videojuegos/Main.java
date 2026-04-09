package dosw.bitacora.Corte1.semana3.Personajes_De_Videojuegos;

public class Main {
    public static void main(String[] args) {
        
        Personaje mario = new Personaje();

        
        Comando saltar = new ComandoSaltar(mario);
        Comando atacar = new ComandoAtacar(mario);

        
        Controlador control = new Controlador();
        control.setComandoBotonA(saltar);
        control.setComandoBotonB(atacar);

        
        control.presionarBotonA();
        control.presionarBotonB(); 
        
        
        System.out.println("\nCambiando configuración de controles...");
        control.setComandoBotonA(atacar);
        control.presionarBotonA(); 
    }
}
