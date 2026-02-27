package dosw.bitacora.semana3.Figuras_y_colores;

public class Circulo extends Forma {
    
    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.print("Dibujando un Círculo...");
        
        color.aplicarColor(); 
        System.out.println();
    }
}