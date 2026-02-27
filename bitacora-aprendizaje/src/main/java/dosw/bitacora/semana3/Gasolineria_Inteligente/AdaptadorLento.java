package dosw.bitacora.semana3.Gasolineria_Inteligente;

public class AdaptadorLento implements Surtidor {
    private CargadorLento cargadorLento;

    public AdaptadorLento(CargadorLento cargadorLento) {
        this.cargadorLento = cargadorLento;
    }

    @Override
    public void abastecer(double litros) {
        
        double kwh = litros * 7.0;
        System.out.println("Adaptador Lento: Convirtiendo " + litros + " litros a " + kwh + " KWh...");
        cargadorLento.cargarBateriaLenta(kwh);
    }
}