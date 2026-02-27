package dosw.bitacora.semana3.Bodega_de_productos;

import java.util.ArrayList;
import java.util.List;

public class Caja implements ItemBodega {
    
    private List<ItemBodega> items = new ArrayList<>();
    private String nombreCaja;

    public Caja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }

    
    public void agregarItem(ItemBodega item) {
        items.add(item);
    }

    public void removerItem(ItemBodega item) {
        items.remove(item);
    }

    @Override
    public double calcularPrecio() {
        System.out.println("Abriendo " + nombreCaja + "...");
        double precioTotal = 0;
        
        
        for (ItemBodega item : items) {
            precioTotal += item.calcularPrecio();
        }
        
        System.out.println("Total de " + nombreCaja + ": $" + precioTotal);
        return precioTotal;
    }
}