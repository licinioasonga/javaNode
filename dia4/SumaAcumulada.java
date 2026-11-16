

package dia4;

import java.util.Scanner;

public class SumaAcumulada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {

            System.out.print("Introduce un número (0 para terminar): ");
            numero = teclado.nextInt();

            suma = suma + numero;

        } while (numero != 0);

        System.out.println("La suma total es: " + suma);

        teclado.close();
    }
}