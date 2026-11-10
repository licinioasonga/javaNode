package dia2;
// Importamos Scanner para permitir que el usuario introduzca los números por la
// consola
import java.util.Scanner;
// Definimos la clase SumaYMedia (archivo SumaYMedia.java)
public class SumaYMedia {
 // Iniciamos el método principal de ejecución
 public static void main(String[] args) {
 // Creamos el lector de teclado llamado 'sc' conectado a la entrada del
 // sistema
 Scanner sc = new Scanner(System.in);
 // Solicitamos el primer valor sin saltar de línea
 System.out.print("Introduce el primer número entero: ");
 // Leemos el número entero tecleado por el usuario y lo guardamos en la
 // variable 'num1'
 int num1 = sc.nextInt();
 // Solicitamos el segundo valor por pantalla
 System.out.print("Introduce el segundo número entero: ");
 // Leemos el segundo entero y lo almacenamos en la variable 'num2'
 int num2 = sc.nextInt();
 // Calculamos la suma de ambos enteros y guardamos el resultado en la
// variable 'suma'
 int suma = num1 + num2;
 // Dividimos entre 2.0 (con decimal) para que Java no pierda la parte
 // decimal si la suma es impar
 double media = suma / 2.0;
 // Mostramos por consola el resultado de la suma
 System.out.println("La suma total es: " + suma);
 // Mostramos por consola la media exacta con decimales
 System.out.println("La nota media es: " + media);
 // Liberamos el recurso del teclado al terminar el programa
 sc.close();
 // Cerramos el método main
 }
// Cerramos la clase SumaYMedia
}