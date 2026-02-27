package dosw.bitacora.semana3.Aplicacion_De_Navegacion;

public class RutaCaminando implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Ruta CAMINANDO de " + origen + " a " + destino + " (Buscando aceras y parques).");
    }
}