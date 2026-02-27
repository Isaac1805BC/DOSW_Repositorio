package dosw.bitacora.semana3.Embajada_De_EstadosUnidos;

public abstract class FuncionarioEmbajada {
    
    protected FuncionarioEmbajada sucesor;

    public void setSucesor(FuncionarioEmbajada sucesor) {
        this.sucesor = sucesor;
    }

    
    public abstract void procesarTramite(Tramite tramite);
}