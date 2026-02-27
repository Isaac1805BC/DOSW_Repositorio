package dosw.bitacora.semana3.Aplicacion_De_Navegacion;

public class RutaTransportePublico implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Ruta en TRANSPORTE PÚBLICO de " + origen + " a " + destino + " (Revisando horarios).");
    }
}