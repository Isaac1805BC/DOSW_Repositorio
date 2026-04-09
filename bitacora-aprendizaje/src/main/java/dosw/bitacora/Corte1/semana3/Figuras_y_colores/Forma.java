package dosw.bitacora.Corte1.semana3.Figuras_y_colores;

public abstract class Forma {
    
    protected Color color;

   
    public Forma(Color color) {
        this.color = color;
    }

    abstract public void dibujar();
}
