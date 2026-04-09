package dosw.bitacora.Corte1.semana3.Aplicacion_De_Navegacion;

public class Main {
    public static void main(String[] args) {
        Navegador gps = new Navegador();
        String origen = "Casa";
        String destino = "Universidad";

        
        gps.setEstrategia(new RutaAuto());
        gps.construirRuta(origen, destino);

        
        System.out.println("\nCambiando método de transporte...");
        gps.setEstrategia(new RutaTransportePublico());
        gps.construirRuta(origen, destino);
    }
}
