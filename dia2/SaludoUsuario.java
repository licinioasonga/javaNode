package dia2;
// Paso 1: Importamos la clase Scanner del paquete de utilidades de Java antes de
// abrir nuestra clase
import java.util.Scanner;
// Abre la clase principal SaludoUsuario (archivo SaludoUsuario.java)
public class SaludoUsuario {
 // Inicia el punto de entrada del programa
 public static void main(String[] args) {
 // Paso 2: Creamos el objeto 'teclado' conectado a System.in (el teclado
 // del ordenador)
 Scanner teclado = new Scanner(System.in);
 // Mostramos el aviso con 'print' (sin ln) para que el usuario escriba
 // justo al lado de los dos puntos
 System.out.print("Escribe tu nombre: ");
 // Paso 3: El programa hace una pausa hasta que el usuario escribe su
 // nombre y pulsa Enter, guardándolo en 'nombre'
 String nombre = teclado.nextLine();
 // Muestra el saludo personalizado con el dato recién introducido
 System.out.println("Hola, " + nombre + ", bienvenido al sistema.");
 // Cerramos el lector de teclado al finalizar el programa como buena
 // costumbre para liberar el recurso
 teclado.close();
 // Cierra el método main
 }
// Cierra la clase SaludoUsuario
}