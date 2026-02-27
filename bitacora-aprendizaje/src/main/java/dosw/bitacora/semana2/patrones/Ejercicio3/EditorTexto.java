package dosw.bitacora.semana2.patrones.Ejercicio3;


public class EditorTexto {
    private String contenido = "";

    public void escribir(String texto) {
        this.contenido += texto;
    }

    public String getContenido() {
        return contenido;
    }

   
    public Memento guardar() {
        return new Memento(contenido);
    }

   
    public void restaurar(Memento memento) {
        this.contenido = memento.getEstadoTexto();
    }
}