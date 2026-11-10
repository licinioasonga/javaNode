package dia2;

public class CalculadoraSuma {
    public static void main(String[] args) {
        // Declaramos dos variables de tipo double
        double numero1 = 10.2;
        double numero2 = 20.5;

        // Calculamos la suma de las dos variables decimales
        double suma = numero1 + numero2;
        // Calculamos la resta de las dos variables
        double resta = numero1 - numero2;
        // Calculamos la multiplicación de las dos variables
        double multiplicacion = numero1 * numero2;

        // Imprimimos el resultado en la consola
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
    }
}
