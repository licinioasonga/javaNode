
package dia4;

import java.util.Scanner;

public class TablaMultiplicarParImpar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        // 1. Validar que el número esté entre 1 y 10
        do {
            System.out.print("Introduce un número del 1 al 10: ");
            numero = teclado.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Número incorrecto. Inténtalo de nuevo.");
            }

        } while (numero < 1 || numero > 10);

        // 2. Contador de resultados pares
        int contadorPares = 0;

        System.out.println("\nTabla de multiplicar del " + numero);
        System.out.println("----------------------------");

        // 3. Recorrer la tabla del 1 al 10
        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            if (resultado % 2 == 0) {

                System.out.println(numero + " x " + i + " = " + resultado + " (par)");

                contadorPares++;

            } else {

                System.out.println(numero + " x " + i + " = " + resultado + " (impar)");

            }
        }

        // 4. Mostrar el total de resultados pares
        System.out.println("----------------------------");
        System.out.println("Total de resultados pares: " + contadorPares);

        teclado.close();
    }
}
