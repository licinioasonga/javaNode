package dia2;
// Define la clase para probar el formateo visual de textos por consola
public class EjemploEscapes {
 // Inicia el método principal
 public static void main(String[] args) {
 // El carácter \n parte el texto en dos renglones distintos en la consola
 System.out.println("Línea 1\nLínea 2");
 // Los caracteres \t separan las palabras formando columnas alineadas
 System.out.println("Nombre\t\tEdad");
 // Alinea los datos justo debajo de las cabeceras anteriores
 System.out.println("Carlos\t\t25");
 // El escape \" permite imprimir las comillas en pantalla sin romper el
 // String
 System.out.println("El profesor dijo: \"Muy bien\"");
 // Cierra el método main
 }
// Cierra la clase EjemploEscapes
}