import java.io.FileWriter;
// Para controlar posibles errores de escritura en el disco
import java.io.IOException;
// Para guardar la lista dinámica de ventas en memoria
import java.util.ArrayList;
// Clase integradora del Día 12 (archivo EjemploIntegradorFicheros.java)
public class EjemploIntegradorFicheros {
    // Punto de entrada del programa
    public static void main(String[] args) {
        // Lista de unidades vendidas (usando el Wrapper Integer)
        ArrayList<Integer> ventas = new ArrayList<Integer>();
        // Primera venta: 4 unidades
        ventas.add(4);
        // Segunda venta: 7 unidades
        ventas.add(7);
        // Tercera venta: 3 unidades
        ventas.add(3);
        // Acumulador inicializado a cero para sumar todas las ventas
        int total = 0;
        // Recorremos el ArrayList completo
        for (int i = 0; i < ventas.size(); i++) {
            // Sumamos cada venta al acumulador (total valdrá 14)
            total = total + ventas.get(i);
        // Cierra el bucle for
        }
        // Abrimos el bloque try para guardar el informe resultante en un fichero
        // de texto
        try {
            // Crea y abre el fichero 'ventas.txt'
            FileWriter escritor = new FileWriter("ventas.txt");
            // Escribe la primera línea con el total calculado
            escritor.write("Total de ventas del día: " + total + " unidades\n");
            // Evaluamos con un condicional if si el día ha sido productivo
            if (total >= 10) {
                // Escribe este diagnóstico en el fichero
                escritor.write("Resultado: Buen día de ventas (objetivo " +
                        "superado)\n");
            // Si fue menor de 10:
            } else {
                // Escribe el diagnóstico alternativo en el fichero
                escritor.write("Resultado: Día normal de ventas\n");
            // Cierra el condicional if-else
            }
            // Cerramos el fichero para asegurar que los datos quedan grabados en
            // el disco
            escritor.close();
            // Aviso en consola
            System.out.println("Resumen de ventas guardado con éxito en el " +
                    "fichero 'ventas.txt'.");
        // Si fallara el acceso al disco duro:
        } catch (IOException e) {
            // Aviso controlado
            System.out.println("Error: No se pudo guardar el resumen en el " +
                    "fichero.");
        // Cierra el bloque try-catch
        }
    // Cierra el método main
    }
// Cierra la clase EjemploIntegradorFicheros
}