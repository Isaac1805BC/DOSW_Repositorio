package dosw.bitacora.semana2.patrones.Ejercicio4;

public class Calculadora {
    
    
    public double calcular(Operacion operacion, double a, double b) {
        return operacion.ejecutar(a, b);
    }
}