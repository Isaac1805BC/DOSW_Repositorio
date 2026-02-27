package dosw.bitacora.semana3.Personajes_De_Videojuegos;

public class ComandoSaltar implements Comando {
    private Personaje personaje;

    public ComandoSaltar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void ejecutar() {
        personaje.saltar();
    }
}
