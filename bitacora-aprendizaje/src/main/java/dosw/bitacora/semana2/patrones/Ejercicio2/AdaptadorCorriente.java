package dosw.bitacora.semana2.patrones.Ejercicio2;

public class AdaptadorCorriente implements EnchufeEuropeo {
    
    
    private EnchufeAmericano enchufeAmericano;

    public AdaptadorCorriente(EnchufeAmericano enchufeAmericano) {
        this.enchufeAmericano = enchufeAmericano;
    }

    
    @Override
    public void conectarVoltaje220V() {
        System.out.println("Adaptador en uso: Convirtiendo 220V de la pared a 110V...");
            enchufeAmericano.conectarVoltaje110V();
    }
}