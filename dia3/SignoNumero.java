package dia3;

// Importamos la herramienta Scanner para leer el número que escriba el usuario
import java.util.Scanner;

// Definimos la clase SignoNumero (archivo SignoNumero.java)
public class SignoNumero {
    // Punto de entrada donde arranca la ejecución
    public static void main(String[] args) {
        // Creamos el lector de teclado 'sc' conectado a la consola
        Scanner sc = new Scanner(System.in);
        // Pedimos el dato al usuario por pantalla
        System.out.print("Introduce un número entero (positivo, negativo o " +
                "cero): ");
        // Capturamos el número entero tecleado y lo guardamos en la variable
        // 'numero'
        int numero = sc.nextInt();
        // Primera comprobación: ¿el número introducido es estrictamente mayor que
        // cero?
        if (numero > 0) {
            // Si es mayor que 0, informamos de que es positivo
            System.out.println("El número " + numero + " es POSITIVO.");
            // Segunda comprobación: si no fue mayor que 0, ¿es menor que cero?
        } else if (numero < 0) {
            // Si tiene signo menos, informamos de que es negativo
            System.out.println("El número " + numero + " es NEGATIVO.");
            // Por descarte lógico: si no es mayor que cero ni menor que cero, la
            // única posibilidad restante es que sea 0
        } else {
            // Mostramos el mensaje para el valor neutro
            System.out.println("El número introducido es exactamente CERO.");
            // Cerramos la estructura condicional if - else if - else
        }
        // Cerramos el lector de teclado para liberar recursos
        sc.close();
        // Cerramos el método main
    }
    // Cerramos la clase SignoNumero
}