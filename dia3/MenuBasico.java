package dia3;
// Importamos Scanner para leer qué opción del menú elige el usuario
import java.util.Scanner;
// Definimos la clase MenuBasico (archivo MenuBasico.java)
public class MenuBasico {
 // Arranca la ejecución del programa
 public static void main(String[] args) {
 // Creamos el objeto lector de teclado
 Scanner sc = new Scanner(System.in);
 // Imprimimos la cabecera visual del menú
 System.out.println("=== MENÚ PRINCIPAL DEL SERVIDOR ===");
 // Mostramos la primera opción disponible
 System.out.println("1. Ver mensaje de bienvenida");
 // Mostramos la segunda opción disponible
 System.out.println("2. Ver horario de soporte técnico");
 // Mostramos la tercera opción disponible
 System.out.println("3. Salir del programa");
 // Pedimos al usuario que teclee el número de su elección
 System.out.print("Elige una opción (1, 2 o 3): ");
 // Guardamos el número entero elegido dentro de la variable 'opcion'
 int opcion = sc.nextInt();
 // Evaluamos el contenido exacto de la variable 'opcion'
 switch (opcion) {
 // Si el usuario tecleó un 1:
 case 1:
 // Mostramos el saludo
 System.out.println("Hola, bienvenido al curso de Programación " +
 "Web en Entorno Servidor.");
 // Salimos del switch para no ejecutar los casos inferiores
 break;
 // Si el usuario tecleó un 2:
 case 2:
 // Mostramos la información solicitada
 System.out.println("El soporte técnico atiende de lunes a " +
 "viernes de 09:00 a 18:00.");
 // Salimos del switch
 break;
 // Si el usuario tecleó un 3:
 case 3:
 // Mostramos el mensaje de despedida
 System.out.println("Cerrando sesión... ¡Hasta pronto!");
 // Salimos del switch
 break;
 // Si el usuario tecleó cualquier otro número (como 0, 4 o 99):
 default:
 // Informamos del error
 System.out.println("Opción no válida: por favor, ejecuta de " +
 "nuevo y elige entre 1 y 3.");
 // Cerramos el bloque switch
 }
 // Cerramos el canal de lectura del teclado
 sc.close();
 // Cerramos el método main
 }
// Cerramos la clase MenuBasico
}
 
