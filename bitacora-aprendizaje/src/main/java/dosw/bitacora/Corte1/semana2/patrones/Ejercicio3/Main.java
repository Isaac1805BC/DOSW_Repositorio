package dosw.bitacora.Corte1.semana2.patrones.Ejercicio3;


public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        
        editor.escribir("Hola ");
        historial.guardarEstado(editor);

       
        editor.escribir("Mundo! ");
        historial.guardarEstado(editor);

        
        editor.escribir("Esto es un error.");
        System.out.println("Texto actual: " + editor.getContenido()); 
        

        
        historial.deshacer(editor);
        System.out.println("Texto tras deshacer: " + editor.getContenido());
        

       
        historial.deshacer(editor);
        System.out.println("Texto tras deshacer: " + editor.getContenido());
       
    }
}
