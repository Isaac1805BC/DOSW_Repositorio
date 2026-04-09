package dosw.bitacora.Corte1.semana3.Embajada_De_EstadosUnidos;

public class Consul extends FuncionarioEmbajada {
    @Override
    public void procesarTramite(Tramite tramite) {
        if (tramite.getTipo().equals("Visa")) {
            System.out.println("Cónsul: Realizando entrevista y aprobando visa para: " + tramite.getDescripcion());
        } else if (sucesor != null) {
            System.out.println("Cónsul: Trámite fuera de mi jurisdicción. Escalando al Embajador...");
            sucesor.procesarTramite(tramite);
        }
    }
}
