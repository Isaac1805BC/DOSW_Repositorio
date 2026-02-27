package dosw.bitacora.semana3.Fabrica_De_Juguetes;

public class Main {
    public static void main(String[] args) {
        DirectorFabrica director = new DirectorFabrica();

        
        BuilderMuñecoAccion builderAccion = new BuilderMuñecoAccion();
        System.out.println("--- Fabricando Muñeco de Acción ---");
        director.hacerMunecoCompleto(builderAccion);
        Muñeco munecoAccion = builderAccion.getResultado();
        System.out.println(munecoAccion);

        
        BuilderMuñecaClasica builderClasica = new BuilderMuñecaClasica();
        System.out.println("\n--- Fabricando Muñeca Clásica ---");
        director.hacerMunecoBasico(builderClasica);
        Muñeco munecaClasica = builderClasica.getResultado();
        System.out.println(munecaClasica);
    }
}