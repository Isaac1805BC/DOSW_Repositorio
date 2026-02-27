package dosw.bitacora.semana3.Empresa_De_Videojuegos;

public interface ConsolaFactory {
    Control crearControl();
    Juego crearJuego();
    InterfazGrafica crearInterfaz();
}