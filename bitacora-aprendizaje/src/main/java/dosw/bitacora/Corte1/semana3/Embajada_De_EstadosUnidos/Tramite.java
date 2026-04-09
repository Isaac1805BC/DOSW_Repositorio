package dosw.bitacora.Corte1.semana3.Embajada_De_EstadosUnidos;

public class Tramite {
    private String tipo;
    private String descripcion;

    public Tramite(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
