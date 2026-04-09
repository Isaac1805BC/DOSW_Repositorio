package dosw.bitacora.Corte1.semana3.Aplicacion_De_Navegacion;

public class RutaTransportePublico implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Ruta en TRANSPORTE PÚBLICO de " + origen + " a " + destino + " (Revisando horarios).");
    }
}
