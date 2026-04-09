package dosw.bitacora.Corte1.semana2.patrones.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba de Logística Terrestre");
        Logistica logisticaTierra = new LogisticaTerrestre();
        logisticaTierra.planificarEntrega();
        
        System.out.println("Prueba de Logística Marítima");
        Logistica logisticaMar = new LogisticaMaritima();
        logisticaMar.planificarEntrega();
    }
}
