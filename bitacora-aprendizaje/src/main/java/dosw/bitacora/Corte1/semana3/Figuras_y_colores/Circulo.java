package dosw.bitacora.Corte1.semana3.Figuras_y_colores;

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
