package dosw.bitacora.semana3.Fabrica_De_Juguetes;

public class BuilderMuñecaClasica implements BuilderMuñeco {
    private Muñeco muñeco;

    public BuilderMuñecaClasica() { this.reset(); }

    @Override
    public void reset() { this.muñeco = new Muñeco(); }

    @Override
    public void construirCabeza() { muñeco.setCabeza("Cabeza con sombrero de copa"); }

    @Override
    public void construirCuerpo() { muñeco.setCuerpo("Cuerpo de tela suave"); }

    @Override
    public void construirBrazos() { muñeco.setBrazos("Brazos de tela"); }

    @Override
    public void construirPiernas() { muñeco.setPiernas("Piernas de tela con zapatos pintados"); }

    @Override
    public void construirAccesorios() { 
        
        muñeco.setAccesorios(null); 
    }

    @Override
    public Muñeco getResultado() {
        Muñeco productoFinal = this.muñeco;
        this.reset();
        return productoFinal;
    }
}