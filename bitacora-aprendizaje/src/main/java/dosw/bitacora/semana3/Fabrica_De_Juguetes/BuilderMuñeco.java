package dosw.bitacora.semana3.Fabrica_De_Juguetes;

public interface BuilderMuñeco {
    void reset(); 
    void construirCabeza();
    void construirCuerpo();
    void construirBrazos();
    void construirPiernas();
    void construirAccesorios();
    Muñeco getResultado();
}