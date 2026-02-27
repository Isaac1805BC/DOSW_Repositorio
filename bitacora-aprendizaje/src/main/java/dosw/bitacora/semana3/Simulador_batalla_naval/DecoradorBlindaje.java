package dosw.bitacora.semana3.Simulador_batalla_naval;

public class DecoradorBlindaje extends NaveDecorador {
    public DecoradorBlindaje(Nave nave) {
        super(nave);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Blindaje de Acero";
    }

    @Override
    public int getPoderAtaque() {
        return super.getPoderAtaque() + 5; 
    }
}