package dosw.bitacora.semana3.Gasolineria_Inteligente;

public class AdaptadorRapido implements Surtidor {
    private CargadorRapido cargadorRapido;

    public AdaptadorRapido(CargadorRapido cargadorRapido) {
        this.cargadorRapido = cargadorRapido;
    }

    @Override
    public void abastecer(double litros) {
        
        double kwh = litros * 8.0; 
        System.out.println("Adaptador Rápido: Convirtiendo " + litros + " litros a " + kwh + " KWh...");
        cargadorRapido.cargarBateriaRapida(kwh);
    }
}