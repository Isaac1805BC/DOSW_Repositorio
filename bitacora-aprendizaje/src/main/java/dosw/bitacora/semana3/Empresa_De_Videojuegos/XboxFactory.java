package dosw.bitacora.semana3.Empresa_De_Videojuegos;

public class XboxFactory implements ConsolaFactory {
    public Control crearControl() { return new ControlXbox(); }
    public Juego crearJuego() { return new JuegoXbox(); }
    public InterfazGrafica crearInterfaz() { return new InterfazXbox(); }
}