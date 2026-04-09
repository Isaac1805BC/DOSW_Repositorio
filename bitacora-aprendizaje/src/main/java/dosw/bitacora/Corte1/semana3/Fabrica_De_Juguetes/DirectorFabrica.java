package dosw.bitacora.Corte1.semana3.Fabrica_De_Juguetes;

public class DirectorFabrica {
    
    public void hacerMunecoBasico(BuilderMuñeco builder) {
        builder.reset();
        builder.construirCabeza();
        builder.construirCuerpo();
        builder.construirBrazos();
        builder.construirPiernas();
        
    }

    public void hacerMunecoCompleto(BuilderMuñeco builder) {
        builder.reset();
        builder.construirCabeza();
        builder.construirCuerpo();
        builder.construirBrazos();
        builder.construirPiernas();
        builder.construirAccesorios(); 
    }
}
