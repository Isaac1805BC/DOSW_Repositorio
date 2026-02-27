package dosw.bitacora.semana3.Simulador_batalla_naval;

public class Main {
    public static void main(String[] args) {
        
        Nave miBarco = new BarcoBasico();
        System.out.println(miBarco.getDescripcion() + " | Poder: " + miBarco.getPoderAtaque());

        
        miBarco = new DecoradorCañones(miBarco);
        System.out.println(miBarco.getDescripcion() + " | Poder: " + miBarco.getPoderAtaque());

        
        miBarco = new DecoradorBlindaje(miBarco);
        System.out.println(miBarco.getDescripcion() + " | Poder: " + miBarco.getPoderAtaque());
        
        
    }
}