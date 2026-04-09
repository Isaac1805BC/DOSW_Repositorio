package dosw.bitacora.Corte1.semana3.Gasolineria_Inteligente;

public class Main {
    public static void main(String[] args) {
        double cantidadBaseLitros = 10.0;

        System.out.println("--- Vehículo Eléctrico (Carga Rápida) ---");
        CargadorRapido apiCargadorRapido = new CargadorRapido();
        
        Surtidor surtidorRapido = new AdaptadorRapido(apiCargadorRapido);
        surtidorRapido.abastecer(cantidadBaseLitros);

        System.out.println("\n--- Vehículo Híbrido (Carga Lenta) ---");
        CargadorLento apiCargadorLento = new CargadorLento();
       
        Surtidor surtidorLento = new AdaptadorLento(apiCargadorLento);
        surtidorLento.abastecer(cantidadBaseLitros);
    }
}
