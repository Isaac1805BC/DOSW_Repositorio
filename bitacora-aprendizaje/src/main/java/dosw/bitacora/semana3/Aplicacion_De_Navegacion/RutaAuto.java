package dosw.bitacora.semana3.Aplicacion_De_Navegacion;

public class RutaAuto implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Ruta en AUTO de " + origen + " a " + destino + " (Buscando vías rápidas).");
    }
}