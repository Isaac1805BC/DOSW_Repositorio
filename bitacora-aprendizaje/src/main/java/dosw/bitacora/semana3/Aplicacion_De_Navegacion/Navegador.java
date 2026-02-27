package dosw.bitacora.semana3.Aplicacion_De_Navegacion;

public class Navegador {
    
    private EstrategiaRuta estrategia;

    
    public void setEstrategia(EstrategiaRuta estrategia) {
        this.estrategia = estrategia;
    }

    public void construirRuta(String origen, String destino) {
        if (estrategia == null) {
            System.out.println("Por favor, selecciona un método de transporte.");
            return;
        }
       
        estrategia.calcularRuta(origen, destino);
    }
}