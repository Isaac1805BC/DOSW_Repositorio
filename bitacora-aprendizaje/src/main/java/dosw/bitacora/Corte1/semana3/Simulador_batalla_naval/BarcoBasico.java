package dosw.bitacora.Corte1.semana3.Simulador_batalla_naval;

public class BarcoBasico implements Nave {
    @Override
    public String getDescripcion() {
        return "Barco de combate básico";
    }

    @Override
    public int getPoderAtaque() {
        return 10; 
    }
}
