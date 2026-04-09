package dosw.bitacora.Corte1.semana3.Empresa_De_Videojuegos;

public class PlayStationFactory implements ConsolaFactory {
    public Control crearControl() { return new ControlPS(); }
    public Juego crearJuego() { return new JuegoPS(); }
    public InterfazGrafica crearInterfaz() { return new InterfazPS(); }
}
