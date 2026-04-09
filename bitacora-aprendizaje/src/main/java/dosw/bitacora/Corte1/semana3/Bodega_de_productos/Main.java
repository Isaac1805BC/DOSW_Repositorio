package dosw.bitacora.Corte1.semana3.Bodega_de_productos;

public class Main {
    public static void main(String[] args) {
        
        ItemBodega celular = new Producto("Celular", 500.0);
        ItemBodega audifonos = new Producto("Audífonos", 50.0);
        ItemBodega cargador = new Producto("Cargador", 25.0);
        ItemBodega laptop = new Producto("Laptop", 1200.0);

        
        Caja cajaAccesorios = new Caja("Caja de Accesorios Pequeños");
        cajaAccesorios.agregarItem(audifonos);
        cajaAccesorios.agregarItem(cargador);

        Caja cajaPrincipal = new Caja("Caja de Envío Principal");
        cajaPrincipal.agregarItem(celular);
        cajaPrincipal.agregarItem(laptop);
        
        cajaPrincipal.agregarItem(cajaAccesorios); 

        
        System.out.println("--- Calculando precio de todo el envío ---");
        double granTotal = cajaPrincipal.calcularPrecio();
        System.out.println("\nEl Gran Total de la bodega es: $" + granTotal);
    }
}
