package dia5;

import java.util.Scanner;

public class ContarNumerosPares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // 1. Crear un array de 8 números enteros
        int[] numeros = new int[8];

        // 2. Introducir los números por teclado
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // 3. Crear un contador de números pares
        int contadorPares = 0;

        // 4. Recorrer el array y comprobar cuáles son pares
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {

                contadorPares++;
            }
        }

        // 5. Mostrar los resultados
        System.out.println("-------------------------");
        System.out.println("Números introducidos:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Cantidad de números pares: " + contadorPares);

        teclado.close();
    }
}

