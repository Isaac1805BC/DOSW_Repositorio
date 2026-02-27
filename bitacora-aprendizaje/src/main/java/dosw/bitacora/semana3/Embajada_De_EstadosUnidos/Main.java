package dosw.bitacora.semana3.Embajada_De_EstadosUnidos;

public class Main {
    public static void main(String[] args) {
        
        FuncionarioEmbajada asesor = new Asesor();
        FuncionarioEmbajada consul = new Consul();
        FuncionarioEmbajada embajador = new Embajador();

        
        asesor.setSucesor(consul);
        consul.setSucesor(embajador);

        
        Tramite duda = new Tramite("Informacion", "Requisitos para viajar");
        Tramite visa = new Tramite("Visa", "Solicitud de visa de turista B1/B2");
        Tramite asilo = new Tramite("Diplomatico", "Petición de asilo político");

        
        System.out.println("--- Trámite 1 ---");
        asesor.procesarTramite(duda);

        System.out.println("\n--- Trámite 2 ---");
        asesor.procesarTramite(visa);

        System.out.println("\n--- Trámite 3 ---");
        asesor.procesarTramite(asilo);
    }
}