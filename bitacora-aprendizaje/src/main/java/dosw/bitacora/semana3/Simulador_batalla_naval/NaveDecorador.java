package dosw.bitacora.semana3.Simulador_batalla_naval;

public abstract class NaveDecorador implements Nave {
    protected Nave naveEnvuelta;

    public NaveDecorador(Nave nave) {
        this.naveEnvuelta = nave;
    }

    @Override
    public String getDescripcion() {
        return naveEnvuelta.getDescripcion();
    }

    @Override
    public int getPoderAtaque() {
        return naveEnvuelta.getPoderAtaque();
    }
}
