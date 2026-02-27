package dosw.bitacora.semana3.Embajada_De_EstadosUnidos;

public class Asesor extends FuncionarioEmbajada {
    @Override
    public void procesarTramite(Tramite tramite) {
        if (tramite.getTipo().equals("Informacion")) {
            System.out.println("Asesor: Entregando folletos sobre el proceso para: " + tramite.getDescripcion());
        } else if (sucesor != null) {
            System.out.println("Asesor: No puedo procesar esto. Escalando al Cónsul...");
            sucesor.procesarTramite(tramite);
        }
    }
}
