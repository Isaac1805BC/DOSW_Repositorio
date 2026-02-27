package dosw.bitacora.semana2.patrones.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double num1 = 10;
        double num2 = 5;

        
        double resultadoSuma = calc.calcular(new Suma(), num1, num2);
        System.out.println("Suma: " + resultadoSuma); 

        double resultadoResta = calc.calcular(new Resta(), num1, num2);
        System.out.println("Resta: " + resultadoResta); 
        
    
        double resultadoMultiplicacion = calc.calcular(new Multiplicacion(), num1, num2);
        System.out.println("Multiplicación: " + resultadoMultiplicacion); 
    }
}