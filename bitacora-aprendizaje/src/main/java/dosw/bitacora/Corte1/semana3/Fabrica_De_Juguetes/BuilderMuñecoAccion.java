package dosw.bitacora.Corte1.semana3.Fabrica_De_Juguetes;

public class BuilderMuñecoAccion implements BuilderMuñeco {
    private Muñeco muñeco;

    public BuilderMuñecoAccion() { this.reset(); }

    @Override
    public void reset() { this.muñeco = new Muñeco(); }

    @Override
    public void construirCabeza() { muñeco.setCabeza("Cabeza con casco"); }

    @Override
    public void construirCuerpo() { muñeco.setCuerpo("Cuerpo musculoso con armadura"); }

    @Override
    public void construirBrazos() { muñeco.setBrazos("Brazos articulados fuertes"); }

    @Override
    public void construirPiernas() { muñeco.setPiernas("Piernas con botas de combate"); }

    @Override
    public void construirAccesorios() { muñeco.setAccesorios("Espada y escudo"); }

    @Override
    public Muñeco getResultado() {
        Muñeco productoFinal = this.muñeco;
        this.reset();
        return productoFinal; 
    }
}
