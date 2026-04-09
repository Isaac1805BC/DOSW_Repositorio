package dosw.bitacora.Corte1.semana2.patrones.Ejercicio3;

import java.util.Stack;

public class Historial {
    
    private Stack<Memento> historia = new Stack<>();

    public void guardarEstado(EditorTexto editor) {
        System.out.println("Historial: Guardando estado...");
        historia.push(editor.guardar());
    }

    public void deshacer(EditorTexto editor) {
        if (!historia.isEmpty()) {
            System.out.println("Historial: Deshaciendo última acción...");
                
            editor.restaurar(historia.pop());
        } else {
            System.out.println("Historial: No hay acciones para deshacer.");
        }
    }
}
