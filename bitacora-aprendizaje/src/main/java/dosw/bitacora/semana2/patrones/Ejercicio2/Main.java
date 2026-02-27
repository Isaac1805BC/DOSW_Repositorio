package dosw.bitacora.semana2.patrones.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        
        EnchufeAmericano miCargador = new EnchufeAmericano();
        
      
        EnchufeEuropeo paredEuropa = new AdaptadorCorriente(miCargador);
        
       
        paredEuropa.conectarVoltaje220V();
    }
}