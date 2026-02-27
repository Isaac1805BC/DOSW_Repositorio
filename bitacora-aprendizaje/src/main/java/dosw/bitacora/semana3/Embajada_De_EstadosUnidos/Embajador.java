package dosw.bitacora.semana3.Embajada_De_EstadosUnidos;

public class Embajador extends FuncionarioEmbajada {
    @Override
    public void procesarTramite(Tramite tramite) {
        if (tramite.getTipo().equals("Diplomatico")) {
            System.out.println("Embajador: Atendiendo asunto de estado crítico: " + tramite.getDescripcion());
        } else {
            System.out.println("Embajador: Este trámite no es válido en esta embajada.");
        }
    }
}