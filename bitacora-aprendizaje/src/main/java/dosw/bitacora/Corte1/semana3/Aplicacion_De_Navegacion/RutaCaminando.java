package dosw.bitacora.Corte1.semana3.Aplicacion_De_Navegacion;

public class RutaCaminando implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Ruta CAMINANDO de " + origen + " a " + destino + " (Buscando aceras y parques).");
    }
}
