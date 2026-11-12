package dia3;
// Importamos Scanner para que el profesor o alumno pueda teclear cualquier nota
import java.util.Scanner;
// Definimos la clase principal (archivo ClasificacionNotaInteractiva.java)
public class ClasificacionNotaInteractiva {
 // Iniciamos el método principal main
 public static void main(String[] args) {
 // Inicializamos el lector de teclado 'sc'
 Scanner sc = new Scanner(System.in);
 // Mostramos la solicitud en consola
 System.out.print("Introduce la nota del alumno (de 0 a 10): ");
 // Leemos la nota con decimales (recuerda usar coma en consola, ej. 8,3)
 double nota = sc.nextDouble();
 // Filtro de seguridad inicial: comprobamos con || si la nota está fuera
 // del rango válido (menor que 0 O mayor que 10)
 if (nota < 0 || nota > 10) {
 // Avisamos del error de introducción de datos
 System.out.println("Error: La nota introducida no es válida (debe " +
 "estar entre 0 y 10).");
 // Si la nota es válida, miramos si no llega al 5
 } else if (nota < 5) {
    // Imprime Suspenso para notas entre 0.0 y 4.99
 System.out.println("Resultado: Suspenso");
 // Si ya sabemos que tiene 5 o más, miramos si es inferior a 7
 } else if (nota < 7) {
 // Imprime Aprobado para notas entre 5.0 y 6.99
 System.out.println("Resultado: Aprobado");
 // Si ya sabemos que tiene 7 o más, miramos si es inferior a 9
 } else if (nota < 9) {
 // Imprime Notable para notas entre 7.0 y 8.99
 System.out.println("Resultado: Notable");
 // Si es una nota válida entre 0 y 10 y ha superado todos los escalones
 // anteriores, está entre 9.0 y 10.0
 } else {
 // Imprime la máxima calificación
 System.out.println("Resultado: Sobresaliente");
 // Cerramos la cadena de condicionales
 }
 // Cerramos el lector de teclado
 sc.close();
 // Cerramos el método main
 }
// Cerramos la clase ClasificacionNotaInteractiva
}