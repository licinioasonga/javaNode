
package dia4;

import java.util.Scanner;

public class CuadradoAsteriscos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño del cuadrado: ");
        int tamaño = teclado.nextInt();

        for (int fila = 1; fila <= tamaño; fila++) {

            for (int columna = 1; columna <= tamaño; columna++) {

                System.out.print("* ");

            }

            System.out.println();
        }

        teclado.close();
    }
}
