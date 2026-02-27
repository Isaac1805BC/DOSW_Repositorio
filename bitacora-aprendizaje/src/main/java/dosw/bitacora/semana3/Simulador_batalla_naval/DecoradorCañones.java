package dosw.bitacora.semana3.Simulador_batalla_naval;

public class DecoradorCañones extends NaveDecorador {
    public DecoradorCañones(Nave nave) {
        super(nave);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Cañones Pesados";
    }

    @Override
    public int getPoderAtaque() {
        return super.getPoderAtaque() + 50; 
    }
}