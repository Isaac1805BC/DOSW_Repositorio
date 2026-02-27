package dosw.bitacora.semana3.Figuras_y_colores;

public class Cuadrado extends Forma {
    
    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.print("Dibujando un Cuadrado...");
        color.aplicarColor();
        System.out.println();
    }
}