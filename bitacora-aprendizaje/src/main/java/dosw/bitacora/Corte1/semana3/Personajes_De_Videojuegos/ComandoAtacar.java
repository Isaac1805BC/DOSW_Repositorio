package dosw.bitacora.Corte1.semana3.Personajes_De_Videojuegos;

public class ComandoAtacar implements Comando {
    private Personaje personaje;

    public ComandoAtacar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void ejecutar() {
        personaje.atacar();
    }
}
