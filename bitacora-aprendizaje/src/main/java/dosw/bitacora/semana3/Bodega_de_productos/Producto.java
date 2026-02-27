package dosw.bitacora.semana3.Bodega_de_productos;

public class Producto implements ItemBodega {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        System.out.println("   - Producto: " + nombre + " ($" + precio + ")");
        return precio;
    }
}