package dia5;

import java.util.Scanner;


public class AnalizarNumeros {
    // Punto de arranque del programa
    public static void main(String[] args) {
        // Creamos el lector de teclado conectado a la consola
        Scanner teclado = new Scanner(System.in);
        // Creamos un array con capacidad para guardar 5 números enteros en
        // memoria
        int[] numeros = new int[5];
        // ACUMULADOR: Empezamos en 0 para ir sumando todos los números que entren
        int suma = 0;
        // CONTADOR: Empezamos en 0 para contar cuántos de esos números resultan
        // ser pares
        int pares = 0;
        // Declaramos la variable donde guardaremos el número más alto
        int maximo;
        // Declaramos la variable donde guardaremos el número más bajo
        int minimo;
        // Primer bucle for: sirve para pedir los 5 números, sumarlos y contar los
        // pares
        for (int i = 0; i < numeros.length; i++) {
            // Pedimos el dato mostrando el número de pregunta humano (del 1 al 5)
            System.out.print("Introduce el número " + (i + 1) + " de 5: ");
            // Guardamos el valor tecleado dentro de la casilla 'i' del array
            numeros[i] = teclado.nextInt();
            // Sumamos inmediatamente ese valor a nuestra hucha acumuladora 'suma'
            suma += numeros[i];
            // Comprobamos si el resto de dividir ese número entre 2 es cero (es
            // decir, si es par)
            if (numeros[i] % 2 == 0) {
                // Si es par, incrementamos en 1 nuestro contador de números pares
                pares++;
                // Cerramos el condicional if
            }
            // Cerramos el primer bucle cuando ya tenemos las 5 casillas rellenas
        }
        // Una vez lleno el array, tomamos el número de la primera casilla (índice
        // 0) como máximo provisional
        maximo = numeros[0];
        // Tomamos también el número de la primera casilla como mínimo provisional
        minimo = numeros[0];
        // Segundo bucle for: recorremos desde la casilla 1 hasta la 4 para buscar
        // los récords
        for (int i = 1; i < numeros.length; i++) {
            // Si el número de la casilla actual supera a nuestro máximo
            // provisional:
            if (numeros[i] > maximo) {
                // Actualizamos el máximo con este nuevo valor mayor
                maximo = numeros[i];
                // Cerramos el if del máximo
            }
            // Si el número de la casilla actual es inferior a nuestro mínimo
            // provisional:
            if (numeros[i] < minimo) {
                // Actualizamos el mínimo con este nuevo valor menor
                minimo = numeros[i];
                // Cerramos el if del mínimo
            }
            // Cerramos el segundo bucle for
        }
        // Calculamos la media convirtiendo 'suma' a double para obtener los
        // decimales exactos
        double media = (double) suma / numeros.length;
        // Mostramos el título del informe final
        System.out.println("\n=== INFORME ESTADÍSTICO DE LOS 5 NÚMEROS ===");
        // Imprimimos la suma acumulada
        System.out.println("Suma total: " + suma);
        // Imprimimos el prom
        System.out.println("Media aritmética: " + media);
        // Imprimimos el número más grande introducido
        System.out.println("Valor máximo: " + maximo);
        // Imprimimos el número más pequeño introducido
        System.out.println("Valor mínimo: " + minimo);
        // Imprimimos cuántos números pares se contaron
        System.out.println("Cantidad de pares: " + pares);
        // Cerramos el lector de teclado al finalizar el programa
        teclado.close();
        // Cerramos el método main
    }
    // Cerramos la clase AnalizarNumeros
}
