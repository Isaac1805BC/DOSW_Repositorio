package dosw.bitacora.semana3.Figuras_y_colores;

public class Main {
    public static void main(String[] args) {
        
        Color rojo = new Rojo();
        Color azul = new Azul();

        
        Forma circuloRojo = new Circulo(rojo);
        Forma cuadradoAzul = new Cuadrado(azul);
        Forma circuloAzul = new Circulo(azul);

        
        circuloRojo.dibujar();
        cuadradoAzul.dibujar();
        circuloAzul.dibujar();
    }
}
