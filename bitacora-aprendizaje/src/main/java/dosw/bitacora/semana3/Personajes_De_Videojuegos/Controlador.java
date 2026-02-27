package dosw.bitacora.semana3.Personajes_De_Videojuegos;

public class Controlador {
    private Comando botonA;
    private Comando botonB;

    
    public void setComandoBotonA(Comando comando) {
        this.botonA = comando;
    }

    public void setComandoBotonB(Comando comando) {
        this.botonB = comando;
    }

    
    public void presionarBotonA() {
        System.out.print("Boton A presionado -> ");
        if (botonA != null) botonA.ejecutar();
    }

    public void presionarBotonB() {
        System.out.print("Boton B presionado -> ");
        if (botonB != null) botonB.ejecutar();
    }
}
