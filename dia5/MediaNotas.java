
package dia5;

import java.util.Scanner;

public class MediaNotas {

    // Iniciamos el método principal main
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Creamos un array para guardar 5 notas
        double[] notas = new double[5];

        // Introducimos las 5 notas
        for (int i = 0; i < notas.length; i++) {

            System.out.print("Introduce la nota " + (i + 1) + ": ");

            notas[i] = teclado.nextDouble();

        }

        // Inicializamos el acumulador
        double suma = 0.0;

        // Recorremos el array para sumar las notas
        for (int i = 0; i < notas.length; i++) {

            suma = suma + notas[i];

            System.out.println("Nota en la posición " + i + ": " + notas[i]);

        }

        // Calculamos la media
        double media = suma / notas.length;

        System.out.println("La nota media del curso es: " + media);

        teclado.close();
    }
}
